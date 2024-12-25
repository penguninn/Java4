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
<div class="container">
    <form class="row g-3" method="POST" action="${pageContext.request.contextPath}/check-login">
        <div class="col-md-6">
            <label for="inputEmail4" class="form-label">ID or email</label>
            <input type="text" class="form-control" id="inputEmail4" name="idOrEmail" required>
        </div>
        <div class="col-md-6">
            <label for="inputPassword4" class="form-label">Password</label>
            <input type="password" class="form-control" id="inputPassword4" name="password" required>
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
    </form>
    <span>${message}</span>
</div>
</body>
</html>
