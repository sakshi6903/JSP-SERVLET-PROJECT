<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN IN PAGE</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
	<section class="header">
		<nav>
			<div class="nav-links" id="navLinks">
				<i class="fa-solid fa-xmark" onclick="hideMenu()"></i>
				<ul>
					<li><a href="Home.html">HOME</a></li>
					<li><a href="SignUp.jsp">SIGN UP</a></li>
					<li><a href="SignIn.jsp">SIGN IN</a></li>
					<li><a href="Contact.html">CONTACT US</a></li>
				</ul>
			</div>
			<i class="fa-solid fa-bars" onclick="showMenu()"></i>
		</nav>
		<div class="signup-form">
			<form action="SignInController">
				<label for="username">Username:</label> <input type="text"
					id="username" name="username" required> <label
					for="password">Password:</label> <input type="password"
					id="password" name="password" required> <input
					type="submit" value="Sign In">
			</form>
			<%!String str=null;%>
			<%
			if (!session.isNew()) {
				str = (String) session.getAttribute("msg");
				session.invalidate();
			%>
			<h3 style="color: black"><%=str%></h3>
			<%
			}
			%>
		</div>

	</section>
</body>
</html>