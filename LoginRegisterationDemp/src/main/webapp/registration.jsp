<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee | Registration</title>
<link rel="stylesheet" href="assets/css/main.css" type="text/css" />
</head>
<body>
 <form method="post" action="addEmployee">
		<div class="box">
			<h1>Registration</h1>
			
			<input type="number" name="eid" placeholder="Enter your Employee ID" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			
			<input type="text" name="ename" placeholder="Enter your name" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			  
			<input type="email" name="eemail" placeholder="Enter your Email" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			
			<input type="tel" name="ephone" placeholder="Enter your phone number" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			
			<input type="password" name="epass" placeholder="Enter Password" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br>
			  
			<input class="btn" type="submit" value = "Sign Up">
			
		  
		</div> <!-- End Box -->
	  
	</form>
	<p>Already have an account? <a href="login.jsp" style="color:#f1c40f;">Click Here!</a></p>

</body>
</html>