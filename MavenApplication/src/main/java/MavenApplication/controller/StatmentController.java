package MavenApplication.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import MavenApplication.dao.ApplicationDao;
import MavenApplication.dao.ApplicationDaoImpl;
import MavenApplication.model.Recharge;
import MavenApplication.model.Transaction;

/**
 * Servlet implementation class StatmentController
 */
@WebServlet("/StatmentController")
public class StatmentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatmentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		Recharge recharge = new Recharge(userName);
		ApplicationDao dao=new ApplicationDaoImpl();
		List<Transaction> transactionList=dao.statement(userName);
		HttpSession session = request.getSession();
		session.setAttribute("data", transactionList);
		response.sendRedirect("Statment.jsp");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
