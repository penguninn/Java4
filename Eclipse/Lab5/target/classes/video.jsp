<%--
  Created by IntelliJ IDEA.
  User: coole
  Date: 11/7/2024
  Time: 3:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>User Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<c:if test="${!empty sessionScope.user}">${sessionScope.user.fullname}</c:if>
<p>Visitor Count: ${applicationScope.visitors}</p>
<div class="container mt-4">
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>Video title</th>
            <th>Số lượt chia sẻ</th>
            <th>Ngày chia sẻ đầu tiên</th>
            <th>Ngày chia sẻ cuối cùng</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="v" items="${videodtos}">
            <tr>
                <td>${v.title}</td>
                <td>${v.shares}</td>
                <td>${v.firstShareDate}</td>
                <td>${v.lastShareDate}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
