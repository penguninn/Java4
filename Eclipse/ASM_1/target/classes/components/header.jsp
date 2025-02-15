<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Locale" %>

<header class="border-bottom py-3">
    <%
        String uname = (String) session.getAttribute("username");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("vi", "VN"));
        String formattedDate = now.format(formatter);
    %>
    <c:url value="/admin" var="admin" />
    <c:url value="/tieupham" var="tieupham" />
    <c:url value="/user" var="user" />
    <div class="container d-flex justify-content-between align-items-center">
        <div>
            <a href="${tieupham}" class="text-danger fw-bold fs-4 text-decoration-none">Online Entertainment</a>
        </div>

        <div class="d-flex align-items-center">
            <div class="border-end px-3 text-muted fw-bold">
                <%= formattedDate %>
            </div>

            <span href="favorite"
               class="d-none px-3 text-muted text-decoration-none border-end d-flex align-items-center gap-2">
                Favorite
            </span>

            <a href="${admin}"
               class="px-3 text-muted text-decoration-none border-end d-flex align-items-center gap-2">
                Admin
            </a>

            <% if (uname == null) { %>
            <span href="${path}/login" class="d-none px-3 text-muted text-decoration-none d-flex align-items-center gap-2">
                <ion-icon name="person-outline"></ion-icon>
                Đăng nhập
            </span>
            <% } else { %>
            <div class="dropdown px-3">
                <a href="#" class="text-muted text-decoration-none d-flex align-items-center gap-2 dropdown-toggle"
                   id="userMenu" data-bs-toggle="dropdown" aria-expanded="false">
                    <ion-icon name="person-outline"></ion-icon>
                    <%= uname %>
                </a>
                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="userMenu">
                    <li><a class="dropdown-item" href="${user}/profile">Xem Hồ Sơ</a></li>
                    <li><a class="dropdown-item" href="${user}/change-password">Đổi Mật Khẩu</a></li>
                    <li><a class="dropdown-item" href="${user}/logout">Đăng Xuất</a></li>
                </ul>
            </div>
            <% } %>
        </div>
    </div>
</header>
