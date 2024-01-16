<%@page import="servlet_test_project.dto.Student"%>
<%@page import="servlet_test_project.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		int id=Integer.parseInt(request.getParameter("id"));

		StudentDao dao = new StudentDao();
		Student student=dao.getByIdStudentDao(id);
	%>
	<form action="editStudent" method="post">
		<h1>this page is edit page</h1>
		  <label>ID:</label>
		<input type="text" placeholder="ID" name="myId" value="<%=student.getId()%>" readonly="true"><br>
		<label>MyName</label>
		<input type="text" placeholder="myName" name="myName" value="<%=student.getName()%>"><br>
		<label>Phone</label>
		<input type="tel" placeholder="phone" name="myPhone" value="<%=student.getPhone()%>"><br>
		<label>Email</label>
		<input type="email" placeholder="email" name="myEmail" value="<%=student.getEmail()%>"><br>
		<label>Gender</label>
		<input type="radio" name="myGender" value="Male" >Male<% %>
		<input type="radio" name="myGender" value="Female" >Female
		<input type="radio" name="myGender" value="Other" >Others<br>
		<input type="submit" value="UPDATE">
	</form>
</body>
</html>