<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>
<h1>This is home page</h1>
<h2>Called by home controller</h2>
<%
/*String name=(String)request.getAttribute("name");
Integer id=(Integer)request.getAttribute("id");*/
%>
<h1>${name } ${id}
</h1>
<hr><h1>${marks1 }
</h1>

</body>
</html>