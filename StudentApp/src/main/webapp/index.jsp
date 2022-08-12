<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="registeredservlet">
Enter Name <input type="text" name="username" placeholder="Enter name">
StudentID <input type="text" name="studentid">
City <input type="text" name="city"> 
Language <select name="language">
<option value="select">----Select-----</option>
<option value="Java">Java</option>
<option value="Jsp">JSP</option>
<option value="Spring">Spring</option>
<option value="Hibernate">Hibernate</option>
</select>
Enter Hobby 
<input type="checkbox" value="music" name="hobby">Music
<input type="checkbox" value="cricket" name="hobby">Cricket
<input type="checkbox" value="dance" name="hobby">Dance
<input type="checkbox" value="pubg" name="hobby">Pubg
<input type="checkbox" value="singing" name="hobby">Singing

<input type="submit">

</form>
</body>
</html>