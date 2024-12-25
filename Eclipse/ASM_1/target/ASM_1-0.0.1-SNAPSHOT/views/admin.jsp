<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<script src="https://cdn.tailwindcss.com"></script>
<script type="module"
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule
	src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</head>
<%@ include file="../components/header_admin.jsp"%>
<body class="overflow-x-hidden">
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	    response.setHeader("Pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
	%>
	<c:url value="/assets" var="assets"></c:url>
	<c:url value="/news" var="news"></c:url>
	
	<div class="w-screen flex flex-col items-center">
		<div class="w-full max-w-screen-2xl flex justify-start items-center mt-5">
			<span class="text-3xl text-neutral-500 font-bold">Trang Admin</span>
		</div>
		<div class="flex h-auto w-full max-w-screen-2xl my-5 gap-5 border-t-2 pt-5">
			<div class="flex flex-grow flex-col gap-5">
				
			</div>
		</div>
	</div>
</body>
</html>