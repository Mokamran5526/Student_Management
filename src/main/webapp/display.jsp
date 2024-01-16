<%@page import="servlet_test_project.dto.Student"%>
<%@page import="java.util.List"%>
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
	StudentDao dao = new StudentDao();
	List<Student> students = dao.getAllStudentsDao();
	%>

	<table border="2">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>email</th>
			<th>gender</th>
			<th>phone</th>
			<th>delete</th>
			<th>edit</th>
		</tr>
		<%
		for (Student student : students) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getEmail()%></td>
			<td><%=student.getGender()%></td>
			<td><%=student.getPhone()%></td>
			<td style="background-color: red"><a href="deletecontroller?id=<%=student.getId()%>">Delete</a></td>
			<td><a href="edit.jsp?id=<%=student.getId()%>">Edit</a></td>
			
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>