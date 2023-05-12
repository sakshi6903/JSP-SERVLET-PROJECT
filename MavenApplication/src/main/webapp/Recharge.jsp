<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RECHARGE</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
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
			<form action="RechargeController">
			    <label for="userName">User Name:</label> <input type="text"
					id="userName" name="userName" required>
				<label for="phoneNumber">Phone Number:</label> <input type="tel"
					id="phoneNumber" name="phoneNumber" placeholder="Enter phone number"
					required> <label for="amount">Amount:</label> <input
					type="number" id="amount" name="amount" placeholder="Enter amount"
					required> <label for="serviceProvider">Service
					Provider:</label> <select id="serviceProvider" name="serviceProvider"
					required>
					<option value="">Select service provider</option>
					<option value="Airtel">Airtel</option>
					<option value="Vodafone">Vodafone</option>
					<option value="Idea">Idea</option>
					<option value="Jio">Jio</option>
				</select> <input type="submit" value="Recharge" action="Confirmation.jsp">
			</form>
		</div>
		</section>	
</body>
</html>