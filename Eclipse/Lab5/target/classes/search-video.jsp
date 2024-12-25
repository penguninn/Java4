<%--
  Created by IntelliJ IDEA.
  User: coole
  Date: 11/7/2024
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<c:if test="${!empty sessionScope.user}">${sessionScope.user.fullname}</c:if>
<p>Visitor Count: ${applicationScope.visitors}</p>
<div class="container">
    <div class="row">
        <form class="row" method="GET" action="${pageContext.request.contextPath}/search">
            <div class="col-md-6">
                <label for="inputEmail4" class="form-label">Từ khóa</label>
                <input type="text" class="form-control" id="inputEmail4" name="keyword" required>
            </div>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Tìm kiếm</button>
            </div>
        </form>
    </div>
    <div class="row mt-4">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Video title</th>
                <th>Số lượt thích</th>
                <th>Hiệu lực</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="v" items="${videos}">
                <tr>
                    <td>${v.title}</td>
                    <td>${v.favorites.size()}</td>
                    <td>
                        <c:choose>
                            <c:when test="${v.active == true}">Còn hiệu lực</c:when>
                            <c:otherwise>Hết hiệu lực</c:otherwise>
                        </c:choose>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
