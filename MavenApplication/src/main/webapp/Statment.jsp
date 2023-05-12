<%@page import="MavenApplication.model.Transaction"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>STATMENTS</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
<style type="text/css">
form input[type="submit"] {
	padding: 10px;
	background-color: #f44336;
	color: #fff;
	border: none;
	margin-top: 10px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	display: block; /* make the button a block-level element */
	margin: 0 auto; 
}

form input[type="submit"]:hover {
	background-color: #d32f2f;
}
table {
  margin-top: 20px;
  margin-left: auto;
  margin-right: auto;
  border-collapse: collapse;
  width: 80%;
}
th, td {
	text-align: center;
	font-size:20px;
	padding: 8px;
	border: 1px solid #ffffff;
	color:#ffffff;
}

th {
	background-color: #333;
	color: white;
}
</style>
</head>
<body>
	<section class="header">
		<nav>
			<div class="nav-links" id="navLinks">
				<i class="fa-solid fa-xmark" onclick="hideMenu()"></i>
				<ul>
					<li><a href="Dashboard.jsp">HOME</a></li>
					<li><a href="Recharge.jsp">RECHARGE</a></li>
					<li><a href="Statment.jsp">STATEMENT</a></li>
				    <li><a href="LogOut.jsp">LOGOUT</a></li>
				</ul>
			</div>
			<i class="fa-solid fa-bars" onclick="showMenu()"></i>
		</nav>
		<div class="signup-form">
			<form action="StatmentController">
				<label for="userName">UserName:</label> <input type="text"
					id="userName" name="userName" required>
					<input type="submit" value="Display All Statment">
			</form>
			<%
			List<Transaction> transactionList = (List<Transaction>) session.getAttribute("data");
			%>
			<table>
				<thead>
					<tr>
						<th>User Name</th>
						<th>Phone Number</th>
						<th>Amount</th>
						<th>Service Provider</th>
						<th>Transaction Date</th>
					</tr>
				</thead>
				<tbody>
					<%
					if (transactionList != null) {
					%>
					<%
					for (int i = 0; i < transactionList.size(); i++) {
					%>
					<tr>
						<td><%=transactionList.get(i).getUserName()%></td>
						<td><%=transactionList.get(i).getPhoneNumber()%></td>
						<td><%=transactionList.get(i).getAmount()%></td>
						<td><%=transactionList.get(i).getServiceProvider()%></td>
						<td><%=transactionList.get(i).getTransactionDate()%></td>
					</tr>
					<%
					}
					%>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</section>
</body>
</html>