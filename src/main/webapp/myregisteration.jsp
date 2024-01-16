<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertStudent">
		<label>ID</label>
		<input type="text" placeholder="ID" name="myId"><br>
		<label>MyName</label>
		<input type="text" placeholder="myName" name="myName"><br>
		<label>Phone</label>
		<input type="tel" placeholder="phone" name="myPhone"><br>
		<label>Email</label>
		<input type="email" placeholder="email" name="myEmail"><br>
		<input type="radio" name="myGender" value="Male">Male
		<input type="radio" name="myGender" value="Female">Female
		<input type="radio" name="myGender" value="Others">Others<br>
		
		<input type="submit" value="submit">
	</form>
</body>
</html>