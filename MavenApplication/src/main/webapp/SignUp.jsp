<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN UP PAGE</title>
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
			<form action="SignUpController">
				<label for="username">Username:</label> <input type="text"
					id="username" name="username" required> <label for="email">Email:</label>
				<input type="email" id="email" name="email" required> <label
					for="phoneno">Phone No:</label> <input type="tel" id="phoneno"
					name="phoneno" required> <label for="password">Password:</label>
				<input type="password" id="password" name="password" required>
				<label for="accBal">Account Balance:</label> <input type="accBal"
					id="accBal" name="accBal" required> <input type="submit"
					value="Sign Up">
			</form>
		</div>

	</section>
</body>
</html>