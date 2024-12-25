<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chi Tiết Tiểu Phẩm</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<%@ include file="../components/header.jsp" %>
<body>
<div class="container mt-4">
    <div class="row">
        <!-- Phần Video và Mô tả -->
        <div class="col-md-8">
            <div class="card mb-4">
                <div class="card-body text-center">
                    <div class="mb-3" style="height: 450px; background-color: #f0f0f0;">
                        <iframe width="100%" height="100%"
                                src="https://www.youtube.com/embed/${tieuPham.linkVideo}"
                                frameborder="0" allowfullscreen></iframe>
                    </div>
                </div>
                <div class="card-footer text-muted">
                    <h5>${tieuPham.tieuDe}</h5>
                    <p>${tieuPham.tieuDe}</p>
                    <button class="btn btn-primary">Like</button>
                    <button class="btn btn-warning">Share</button>
                </div>
            </div>
        </div>

        <!-- Phần Danh sách Tiểu Phẩm (Poster) -->
        <div class="col-md-4">
            <div class="list-group">
                <c:forEach var="item" items="${tieuPhams}">
                    <a href="?id=${item.id}" class="list-group-item list-group-item-action">
                        <div class="d-flex justify-content-between gap-3">
                            <iframe width="200px" height="100px"
                                    src="https://www.youtube.com/embed/${item.linkVideo}"
                                    frameborder="0" allowfullscreen></iframe>
                            <span>${item.tieuDe}</span>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
</body>
</html>

