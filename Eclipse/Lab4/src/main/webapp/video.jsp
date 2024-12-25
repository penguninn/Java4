<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
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
