<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unsuccesful</title>
</head>
<body>
<%
	//response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
	//response.setHeader("pragma", "no-cache");
	//response.setHeader("Expires", "0");
	
	//String err = (String) request.getAttribute("error");
	//out.print(err);
%>
	<h3>Sorry an exception occured!</h3>  
  	Exception is: <%= request.getAttribute("error") %>  
  	
  	<br><h1><a href="registration.jsp">Go Back to Sign Up</a></h1>
</body>
</html>