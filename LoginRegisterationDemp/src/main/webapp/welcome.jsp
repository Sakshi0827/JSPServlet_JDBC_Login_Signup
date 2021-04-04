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
<body>
<%
	
		response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
		response.setHeader("pragma", "no-cache");
		response.setHeader("Expires", "0");
		if(session.getAttribute("eid") == null){
			response.sendRedirect("login.jsp");
		}
	%>


	<div class="topnav">
	  <a class="active" href="welcome.jsp">Home</a>
	  <a href="updateProfile.jsp">Update Profile</a>
	  <a href="videos.jsp">Videos</a>
	  <a href="http://localhost:8080/LoginRegisterationDemp/logout">Logout</a>
	</div>
	<br>
	<h1 align="center"><b><u>EMPLOYEE DETAILS</u></b></h1>
	<br>
	<div style="padding-left:16px">
	  <table id="emp">
	  <%Employee e = (Employee)session.getAttribute("Employee"); %>
		  <tr>
		    <td>Employee ID</td>
		    <td><% out.print(e.getEid()); %></td>
		  </tr>
		  <tr>
		    <td>Name</td>
		    <td><% out.print(e.getEname()); %></td>
		  </tr>
		  <tr>
		    <td>Email ID</td>
		    <td><% out.print(e.getEemail()); %></td>
		  </tr>
		  <tr>
		    <td>Phone Number</td>
		    <td><% out.print(e.getEphone()); %></td>
		  </tr>
		</table>
	</div>
	
	
       
    </ul>
  </div>
</nav>

</body>
</html>