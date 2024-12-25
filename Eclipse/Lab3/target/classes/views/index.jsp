<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>User Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-4">
	    <table class="table table-bordered">
	        <thead>
	        <tr>
	            <th>Video title</th>
	            <th>Người thích</th>
	            <th>Ngày thích</th>
	        </tr>
	        </thead>
	        <tbody>
	        <c:forEach var="f" items="${favorites}">
	            <tr>
	                <td>${f.video.title}</td>
	                <td>${f.user.fullname}</td>
	                <td>${f.likeDate}</td>
	            </tr>
	        </c:forEach>
	        </tbody>
	    </table>
	</div>
</body>
</html>