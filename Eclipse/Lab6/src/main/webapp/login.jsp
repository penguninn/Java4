<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <c:url var="url" value="/login" />
    <i>${message}</i>
    <form action="${url}" method="post">
        <label>Username:</label><br>
        <input name="username"><br>
        <label>Password:</label><br>
        <input name="password" type="password"><hr>
        <button>Login</button>
    </form>
</body>
</html>
