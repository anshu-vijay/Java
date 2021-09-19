<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
The student is confirmed : ${param.firstname } ${param.lastname }
The selected country : ${param.country }
<br>
Firstname: <%= request.getParameter("firstname") %>
<br>
Lastname: <%= request.getParameter("lastname") %>
<br>
Country: <%= request.getParameter("country") %>
</body>
</html>