<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
The student is confirmed : ${param.firsname } ${param.lastname }
<br>
Firstname: <%= request.getParameter("firstname") %>
<br>
Lastname: <%= request.getParameter("lastname") %>
<br>
Selected programming language: 
<br>
<% 
String[] langs = request.getParameterValues("favLanguage");
for(String selectedLang: langs){
out.println("<li>" + selectedLang+ "</li>");
}
%>
</body>
</html>