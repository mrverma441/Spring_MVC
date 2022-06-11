<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<h1>Student name is ${student.name }</h1>
<h1>Student id is ${student.id }</h1>
<h1>Student dob is ${student.date }</h1>
<h1>Courses select by students are ${student.courses }</h1>
<h1>Student gender is ${student.gender }</h1>
<h1>Student type is ${student.type }</h1>
<hr>
<h1>Address Street is ${student.address.street }</h1>
<h1>Address city is ${student.address.city }</h1>
</body>
</html>