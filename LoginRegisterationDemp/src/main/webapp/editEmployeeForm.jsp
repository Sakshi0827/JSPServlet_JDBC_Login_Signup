<%@page import="com.employee.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/logged.css" type="text/css" /> 
</head>
<body class ="profile">
<%! Employee e;
	String eeemail;
	String eephone;
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
		e = (Employee)session.getAttribute("editE"); 
		System.out.println("IN jSP---------- " + e.getEemail());
		eeemail = e.getEemail();
		eephone = e.getEphone();
	}
%>

	<div class="topnav">
	  <a href="welcome.jsp">Home</a>
	  <a href="updateProfile.jsp">Update Profile</a>
	  <a href="videos.jsp">Videos</a>
	  <a class="active" href="EmployeesList?page=1">Employees List</a>
	  <a href="http://localhost:8080/LoginRegisterationDemp/logout">Logout</a>
	</div>
<br>
<form method="post" action="updateEmp">
		<div class="box">
			<h1>Update Employee</h1>
			
			<table id="emp">
			    <td>Update Email ID</td>
			    <td><input type="email" name="eeemail" value= <%=eeemail%> onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br></td>
			  </tr>
			  <tr>
			    <td>Update Phone Number</td>
			    <td><input type="tel" name="eephone" value =<%=eephone %>  pattern="[789][0-9]{9}" onFocus="field_focus(this, 'email');" onblur="field_blur(this, 'email');" class="email" /><br></td>
			  </tr>
			</table> 
			<input class="btn" type="submit" value = "Update">
			
		  
		</div> <!-- End Box -->
	  
	</form>
</body>

</html>