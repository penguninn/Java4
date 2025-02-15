<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
</head>
<%@ include file="../components/header.jsp" %>
<body>
<c:url value="/admin" var="admin"/>
<div class="container mt-4">
    <div class="row">
        <div class="col-md-12">
            <h4 class="mb-3">Video Management</h4>
            <div>
                <h5>Create/Update Video</h5>
                <form action="${admin}/insert" method="post">
                    <div class="mb-3">
                        <label for="id" class="form-label">ID</label>
                        <input type="text" class="form-control" id="id" name="id" value="${tp.id}" readonly>
                    </div>
                    <div class="mb-3">
                        <label for="youtubeId" class="form-label">Youtube ID</label>
                        <input type="text" class="form-control" id="youtubeId" name="youtubeId"
                               value="${tp.linkVideo}" required>
                    </div>
                    <div class="mb-3">
                        <label for="videoTitle" class="form-label">Video Title</label>
                        <input type="text" class="form-control" id="videoTitle" name="videoTitle" value="${tp.tieuDe}"
                               required>
                    </div>
                    <div class="mb-3">
                        <label for="viewCount" class="form-label">View Count</label>
                        <input type="number" class="form-control" id="viewCount" name="viewCount" value="${tp.luotXem}"
                               required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Status</label>
                        <div>
                            <input type="radio" id="active" name="status" value="true" ${tp.trangThai ? 'checked' : ''}>
                            <label for="active">Active</label>
                            <input type="radio" id="inactive" name="status"
                                   value="false" ${!tp.trangThai ? 'checked' : ''}>
                            <label for="inactive">Inactive</label>
                        </div>
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Description</label>
                        <textarea class="form-control" id="description" name="moTa" rows="3">${tp.moTa}</textarea>
                    </div>
                    <button type="submit" class="btn btn-success" formaction="${admin}/insert">Create
                    </button>
                    <button type="submit" class="btn btn-warning" formaction="${admin}/update">Update
                    </button>
                    <button type="submit" class="btn btn-danger" formaction="${admin}/delete">Delete
                    </button>
                    <button type="submit" class="btn btn-secondary" formaction="${admin}/new">Reset</button>
                </form>

            </div>

            <!-- Video List Section -->
            <div class="mt-4">
                <h5>Video List</h5>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>Youtube ID</th>
                        <th>Video Title</th>
                        <th>View Count</th>
                        <th>Status</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="item" items="${tieuPhams}">
                        <tr>
                            <td>${item.linkVideo}</td>
                            <td>${item.tieuDe}</td>
                            <td>${item.luotXem}</td>
                            <td>${item.trangThai ? "Active" : "Inactive"}</td>
                            <td><a href="${admin}/edit?id=${item.id}" class="btn btn-warning">Edit</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

                <!-- Pagination -->
                <nav class="mt-4">
                    <ul class="pagination justify-content-center">
                        <li class="page-item <c:if test='${currentPage == 1}'>disabled</c:if>">
                            <a class="page-link" href="${admin}?page=${currentPage - 1}" tabindex="-1">Previous</a>
                        </li>

                        <c:forEach var="page" begin="1" end="${totalPages}">
                            <li class="page-item <c:if test='${page == currentPage}'>active</c:if>">
                                <a class="page-link" href="${admin}?page=${page}">${page}</a>
                            </li>
                        </c:forEach>

                        <li class="page-item <c:if test='${currentPage == totalPages}'>disabled</c:if>">
                            <a class="page-link" href="${admin}?page=${currentPage + 1}">Next</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</div>
</body>
</html>
