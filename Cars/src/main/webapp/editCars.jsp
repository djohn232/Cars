<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit A Current Car</title>
</head>
<body>

<form action = "editCarServlet" method="post">
Make: <input type ="text" name = "make" value="${itemToEdit.make}">
Model: <input type = "text" name = "item" value= "${itemToEdit.model}">
<input type = "hidden" name = "id" value="${itemToEdit.id}">
<input type = "submit" value="Save Edited Item">
</form>

<a href = "index.html">Add New Instead</a>

</body>
</html>