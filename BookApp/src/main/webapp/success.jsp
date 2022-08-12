<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Java Code inside html is jsp -->
<%
String title=(String)request.getAttribute("mytitle");
out.print("Title : "+title+ " <br>");
Integer bookId=(Integer)request.getAttribute("bookid");
out.print("Book ID : "+bookId+"<br>");
out.print("Author : "+request.getAttribute("author")+"<br>");
out.print("Category : "+request.getAttribute("category")+"<br>");
Double price=(Double)request.getAttribute("price");
out.print("Price : "+price+"<br>");

%>

</body>
</html>