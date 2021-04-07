<%@page import="java.util.List"%>
<%@page import="com.employee.web.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri ="http://java.sun.com/jstl/core" prefix ="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee | Employees List</title>
<link rel="stylesheet" href="assets/css/logged.css" type="text/css" /> 
</head>
<%!
	int noOfPages =0, currentPage =0;
	List<Employee> list;
%>
<body>
<%
	response.setHeader("cache-control", "no-cache, no-store, must-revalidate");
	response.setHeader("pragma", "no-cache");
	response.setHeader("Expires", "0");
	if(session.getAttribute("eid") == null){
		response.sendRedirect("login.jsp");
	} 
	else{
		noOfPages = (Integer) request.getAttribute("noOfPages");
		currentPage = (Integer) request.getAttribute("currentPage");
		List<Employee> list = (List)request.getAttribute("employeesList");
	
	%>
	<div class="topnav">
	  <a href="welcome.jsp">Home</a>
	  <a href="updateProfile.jsp">Update Profile</a>
	  <a href="videos.jsp">Videos</a>
	  <a class="active" href="EmployeesList?page=1">Employees List</a>
	  <a href="http://localhost:8080/LoginRegisterationDemp/logout">Logout</a>
	</div>
	<br>
	<h1 align="center"><b><u>EMPLOYEE DETAILS</u></b></h1>
	<br>
	<div style="padding-left:25px; padding-right: 25px;">
	<table id="emp" border="1" cellpadding ="5" cellspacing="5">
		<tr>
			<th>Employee ID</th>
			<th>Employee ID Name</th>
			<th>Employee Email</th>
			<th>Employee Phone No</th>
		</tr>
		<% for(Employee e: list) {%>
		<tr>
			<td> <%= e.getEid() %> </td>
			<td> <%= e.getEname() %> </td>
			<td> <%= e.getEemail() %> </td>
			<td> <%= e.getEphone() %></td>
		</tr>
		 <% } %>	
	</table>
	
	
	
	
	
	<!-- For Displaying Page numbers -->
	<table border="1" cellpadding="5" cellspacing="5">
		<tr>
			<!-- For Displaying previous link except for the 1st page -->
			<c:if test="${ currentPage!=1 }">
				<td><a href="EmployeesList?page=<%=currentPage - 1%>">Previous</a></td>
			</c:if>
			<c:forEach var = "i" begin ="1" end="${ noOfPages }">
			
				<c:choose>
					<c:when test=" ${currentPage eq i }">
						<td><c:out value="${ i }"></c:out></td>
					</c:when>
					<c:otherwise>
						<td><a href="EmployeesList?page=<c:out value = "${i}"/>"><c:out value = "${i}"/></a></td>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<!-- For Displaying next Link-->
			<c:if test="${ currentPage lt noOfPages}">
				<td><a href="EmployeesList?page=<%=currentPage + 1 %>">Next</a></td>
			</c:if>
		</tr>
	</table>
	
	<div class="pagination">
  <a href="#">&laquo;</a>
  <a href="#">1</a>
  <a href="#" class="active">2</a>
  <a href="#">3</a>
  <a href="#">4</a>
  <a href="#">5</a>
  <a href="#">6</a>
  <a href="#">&raquo;</a>
</div>
	
</body>
<%} %>
</body>
</html>