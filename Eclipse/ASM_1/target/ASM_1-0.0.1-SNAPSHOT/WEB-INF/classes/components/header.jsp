<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Locale" %>
<header class="flex justify-center items-center border-b-2 w-screen py-5">
	<c:url value="/video" var="video"></c:url>
	<c:url value="/user" var="path"></c:url>
	<c:url value="/assets" var="assets" />
	<c:url value="/Management" var="manage"></c:url>
	<%
		String uname = (String) session.getAttribute("username");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("vi", "VN"));
    	String formattedDate = now.format(formatter);
	%>
	<div class="flex justify-between items-center w-full max-w-screen-2xl text-neutral-400 font-bold">
		<div class="flex flex-shrink-0 items-center ">
			<a href="${video}/home">
				<span class="text-rose-500 font-bold text-xl">Online Entertainment</span>
			</a>
		</div>
		<div class="flex items-center">
			<div class="border-r-2 px-4"> <%= formattedDate %> </div>
			<a href="${video}/favorite" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Favorite</a>
			<a href="./admin.jsp" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Admin</a>
			<% if(uname == null) { %>
				<a href="${path}/login" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500"> <ion-icon name="person-outline"></ion-icon>Đăng nhập</a>
			<%} else {%>
				<div class="relative inline-block px-4 flex items-center gap-2 hover:text-rose-500 cursor-pointer group">
					<ion-icon name="person-outline"></ion-icon> <%= uname %>
					<div class="absolute right-2 top-[calc(105%)] z-50 w-40 h-auto hidden group-hover:block bg-white text-black rounded border">
						<a href="${path}/profile" class="block px-4 py-2 hover:bg-gray-200">Xem Hồ Sơ</a>
						<a href="${path}/change_password" class="block px-4 py-2 hover:bg-gray-200">Đổi Mật Khẩu</a>
						<a href="${path}/logout" class="block px-4 py-2 hover:bg-gray-200">Đăng Xuất</a>
					</div>
				</div>
			<%}%>
		</div>
	</div>
</header>