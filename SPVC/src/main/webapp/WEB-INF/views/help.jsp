<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${marks1 }

<h1>This is Help jsp page</h1>
<%
String name=(String)request.getAttribute("name");
Integer roll_no=(Integer)request.getAttribute("roll_number");
%>
<h1><%=name %></h1>
<h1><%=roll_no %></h1>
<hr>
</body>
</html>