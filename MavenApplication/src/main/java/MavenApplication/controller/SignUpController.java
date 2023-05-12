package MavenApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import MavenApplication.dao.ApplicationDao;
import MavenApplication.dao.ApplicationDaoImpl;
import MavenApplication.model.SignUp;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String password=request.getParameter("password");
		int accBal=Integer.parseInt(request.getParameter("accBal"));
		
		//set value to model class
		SignUp sObj=new SignUp(username, email, phoneno, password, accBal);
		List<SignUp> lstreg=new ArrayList<SignUp>();
	    lstreg.add(sObj);
	    
	    PrintWriter pw=response.getWriter();
	    //Dao Connection
	    ApplicationDao adao=new ApplicationDaoImpl();
	    int i=adao.create(lstreg);
	    HttpSession session=request.getSession();
	    
	    if(i>0) {
	    	response.sendRedirect("SignIn.jsp");
	    }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
