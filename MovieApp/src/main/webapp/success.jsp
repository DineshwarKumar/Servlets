<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Java code -->
<%
String username=(String)request.getAttribute("username");
out.print("Welcome "+username);

%>
<form action="movieServlet">
Select Language <select name="language">
<option value="select">---Select---</option>
<option value="english">English</option>
<option value="tamil">Tamil</option>
<option value="kannada">Kannada</option>
<option value="hindi">Hindi</option>
<option value="malayalam">Malayalam</option>
</select>

<input type="submit" value="showmovies">
</form>
</body>
</html>