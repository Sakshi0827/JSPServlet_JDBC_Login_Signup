<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee | Login Form</title>
<link rel="stylesheet" href="assets/css/main.css" type="text/css" />  
</head>
<body>

	<form method="get" action="getEmployee">
		<div class="box">
			<h1>Login</h1>
			
			<input type="number" name="eid" placeholder="Enter your Employee ID" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			  
			<input type="password" name="epass" placeholder="Enter your password" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			  
			<input class="btn" type="submit" value = "Sign in">
			
		  
		</div> <!-- End Box -->
	  
	</form>
	<p>Don't have an account? <a href="registration.jsp" style="color:#f1c40f;">Click Here!</a></p>     
</body>
</html>