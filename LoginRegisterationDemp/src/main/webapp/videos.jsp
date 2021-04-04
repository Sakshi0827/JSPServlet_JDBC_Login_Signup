<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Video | MyWebsite</title>
<link rel="stylesheet" href="assets/css/logged.css" type="text/css" /> 
</head>
<body>

	<% 
	
		response.setHeader("cache-contorl", "no-cache, no-sotre, must-revalidate"); //HTTP 1.1
		response.setHeader("pragma", "no-cache"); //HTTP 1.0
		response.setHeader("Expires", "0"); //Proxies
	
		if(session.getAttribute("eid") == null){
			response.sendRedirect("login.jsp");
		} 
	%>
	
	<div class="topnav">
	  <a href="welcome.jsp">Home</a>
	  <a href="updateProfile.jsp">Update Profile</a>
	  <a class="active" href="videos.jsp">Videos</a>
	  <a href="http://localhost:8080/LoginRegisterationDemp/logout">Logout</a>
</div>
	<p align="center">
		<iframe width="600" height="500" src="https://www.youtube.com/embed/tgbNymZ7vqY">
		</iframe>
	</p>
</body>
</html>