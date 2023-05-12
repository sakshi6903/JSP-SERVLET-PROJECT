<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DASHBOARD</title>
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
		<div class="text-box">
			<h1>Welcome to your Dashboard!</h1>
			<p>Here you can manage your account details and transactions.</p>
		</div>
	</section>
</body>
</html>