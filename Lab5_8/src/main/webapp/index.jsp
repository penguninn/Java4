<%--
  Created by IntelliJ IDEA.
  User: coole
  Date: 11/28/2024
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Quan li phieu giam gia</title>
</head>
<body>
<h1>Quan Li Phieu Giam Gia</h1>
<form action="/add" method="post">
    Ma <input type="text" name="ma" id="ma"> <br>
    Loai Phieu Giam Gia
    <select name="loai" id="loai">
        <c:forEach items="${listLoaiPhieu}" var="item">
            <option value="${item.id}">${item.ten}</option>
        </c:forEach>
        <option value="1">1</option>
    </select> <br>
    Ten <input type="text" name="ten" id="ten"> <br>
    So luong <input type="text" name="soLuong" id="soluong"> <br>
    <button type="submit">Add</button>
</form>
<br>
<table>
    <thead>
        <tr>
            <td>#</td>
            <td>Ma Phieu</td>
            <td>Ten Phieu</td>
            <td>So Luong</td>
            <td>Action</td>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="item" varStatus="id">
            <tr>
                <td>${id.count}</td>
                <td>${item.ma}</td>
                <td>${item.ten}</td>
                <td>${item.soLuong}</td>
                <td>
                    <a href="/delete?id=${item.id}">
                        <button>Remove</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
