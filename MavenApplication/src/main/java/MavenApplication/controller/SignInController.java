package MavenApplication.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import MavenApplication.dao.ApplicationDao;
import MavenApplication.dao.ApplicationDaoImpl;
import MavenApplication.model.Login;



/**
 * Servlet implementation class SignInController
 */
@WebServlet("/SignInController")
public class SignInController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		Login lobj=new Login(userName, password);
		
		ApplicationDao rado=new ApplicationDaoImpl();
		String str = rado.validateUser(lobj);
		HttpSession session=request.getSession();
		
		if(str.equals("valid")) {
			System.out.println("Hello....");
			session.setAttribute("msg",lobj);
			response.sendRedirect("Dashboard.jsp");
		}
		else {
			System.out.println("Byee....");
			session.setAttribute("msg", str);
			response.sendRedirect("SignIn.jsp");
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
