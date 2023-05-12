<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RECHARGE</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
<style type="text/css">
.text-box {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	padding: 20px;
	border-radius: 10px;
}

.text-box h1 {
	font-size: 40px;
	font-weight: bold;
	margin-bottom: 30px;
}

.text-box ul {
	list-style: none;
	margin: 0;
	padding: 0;
	text-align: center;
}

.text-box li {
	font-size: 25px;
	margin-bottom: 30px;
	
}

form input[type="submit"] {
	padding: 10px;
	background-color: #f44336;
	color: #fff;
	border: none;
	margin-top: 10px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 16px;
	display: block;
	margin: 0 auto; 
}

form input[type="submit"]:hover {
	background-color: #d32f2f;
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


		<div class="text-box">
			<h1>Recharge Confirmation</h1>
			<ul>
				<li>User Name: <%=request.getParameter("userName")%></li>
				<li>Phone Number: <%=request.getParameter("phoneNumber")%></li>
				<li>Amount: <%=request.getParameter("amount")%></li>
				<li>Service Provider: <%=request.getParameter("serviceProvider")%></li>
			</ul>
			<form action="SuccessfulRecharge.jsp">
				<input type="submit" value="Confirm" class="button-link">
			</form>
		</div>
	</section>
</body>
</html>