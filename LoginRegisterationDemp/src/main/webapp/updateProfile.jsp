<%@page import="com.employee.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee | Update Profile</title>
<link rel="stylesheet" href="assets/css/logged.css" type="text/css" /> 

</head>
<body class ="profile">
<%! Employee e;
	String peemail;
	String pephone;
%>
<%
	response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
	response.setHeader("pragma", "no-cache");
	response.setHeader("Expires", "0");
	if(session.getAttribute("eid") == null){
		e = null; 
		response.sendRedirect("login.jsp");
	} 
	
	else{
		e = (Employee)session.getAttribute("Employee"); 
		peemail = e.getEemail();
	    pephone = e.getEphone();
	}
%>

<div class="topnav">
	  <a  href="welcome.jsp">Home</a>
	  <a class="active" href="updateProfile.jsp">Update Profile</a>
	  <a href="videos.jsp">Videos</a>
	  <a href="EmployeesList?page=1">Employees List</a>
	  <a href="http://localhost:8080/LoginRegisterationDemp/logout">Logout</a>
</div>
<br>
<form method="post" action="updateProfile">
		<div class="box">
			<h1>Update Profile</h1>
			
			<table id="emp">
			    <td>Update Email ID</td>
			    <td><input type="email" name="eemail" value= <%=peemail%> onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br></td>
			  </tr>
			  <tr>
			    <td>Update Phone Number</td>
			    <td><input type="tel" name="ephone" value =<%=pephone %> onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br></td>
			  </tr>
			</table> 
			<input class="btn" type="submit" value = "Update">
			
		  
		</div> <!-- End Box -->
	  
	</form>
</body>
</html>