package MavenApplication.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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

/**
 * Servlet implementation class RechargeController
 */
@WebServlet("/RechargeController")
public class RechargeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RechargeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String phoneNumber = request.getParameter("phoneNumber");
		int amount = Integer.parseInt(request.getParameter("amount"));
		String serviceProvider = request.getParameter("serviceProvider");

		Recharge recharge = new Recharge(userName ,phoneNumber, amount, serviceProvider);
		//        List<Recharge> rechargeList = new ArrayList<Recharge>();
		//        rechargeList.add(recharge);
		PrintWriter pw =response.getWriter();
		ApplicationDao dao = new ApplicationDaoImpl();
		int i = dao.saveRecharge(recharge);
		

			if (i > 0) {
		    request.getRequestDispatcher("SuccessfulRecharge.jsp").forward(request, response);
			}
			else {
				request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
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
