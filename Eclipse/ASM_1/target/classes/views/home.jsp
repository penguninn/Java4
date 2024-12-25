<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<style>

</style>
<head>
    <meta charset="UTF-8">
    <title>Trang chủ</title>
    <script type="module"
            src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule
            src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>

</head>
<%@ include file="../components/header.jsp" %>
<body>
<c:url value="/admin" var="admin" />
<c:url value="/tieupham" var="tieupham" />
<div class="container mt-4">
    <div class="row mb-4">
        <div class="col">
            <h1 class="text-start">Danh Sách Tiểu Phẩm</h1>
        </div>
    </div>

    <div class="row g-4">
        <c:forEach var="item" items="${tieuPhams}">
            <div class="col-md-4">
                <a href="?id=${item.id}" class="page-link text-reset text-decoration-none">
                    <div class="card h-100 shadow-sm">
                        <div class="card-body h-100">
                            <iframe width="100%" height="200"
                                    src="https://www.youtube.com/embed/${item.linkVideo}"
                                    frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="card-footer bg-transparent text-end">
                            <h5 class="card-title">${item.tieuDe}</h5>
                            <p class="card-text">${fn:substring(item.moTa, 0, 100)}...</p>
                        </div>
                    </div>
                </a>
            </div>
        </c:forEach>
    </div>

    <nav class="mt-4">
        <ul class="pagination justify-content-center">
            <li class="page-item <c:if test='${currentPage == 1}'>disabled</c:if>">
                <a class="page-link" href="?page=${currentPage - 1}" tabindex="-1">Previous</a>
            </li>

            <c:forEach var="page" begin="1" end="${totalPages}">
                <li class="page-item <c:if test='${page == currentPage}'>active</c:if>">
                    <a class="page-link" href="?page=${page}">${page}</a>
                </li>
            </c:forEach>

            <li class="page-item <c:if test='${currentPage == totalPages}'>disabled</c:if>">
                <a class="page-link" href="?page=${currentPage + 1}">Next</a>
            </li>
        </ul>
    </nav>

</div>
</body>
</html>