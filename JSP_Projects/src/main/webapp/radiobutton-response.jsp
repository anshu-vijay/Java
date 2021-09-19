<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
The student is confirmed : ${param.firstname } ${param.lastname }
The selected programming language : ${param.favLanguage }
<br>
Firstname: <%= request.getParameter("firstname") %>
<br>
Lastname: <%= request.getParameter("lastname") %>
<br>
Selected programming language: 
<br>
<%= request.getParameter("favLanguage") %>
</body>
</html>