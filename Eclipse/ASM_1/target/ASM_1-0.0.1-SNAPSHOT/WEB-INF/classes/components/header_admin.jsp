<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.util.Locale" %>
<header class="flex justify-center items-center border-b-2 w-screen py-5">
	<c:url value="/video" var="video"></c:url>
	<c:url value="/admin" var="admin"></c:url>
	<c:url value="/assets" var="assets" />
	<%
		String uname = (String) session.getAttribute("username");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("vi", "VN"));
    	String formattedDate = now.format(formatter);
	%>
	<div class="flex justify-between items-center w-full max-w-screen-2xl text-neutral-400 font-bold">
		<div class="flex flex-shrink-0 items-center ">
			<a href="${admin}/home">
				<span class="text-rose-500 font-bold text-xl">Administration Tool</span>
			</a>
		</div>
		<div class="flex items-center">
			<div class="border-r-2 px-4"> <%= formattedDate %> </div>
			<a href="${admin}/home" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Home</a>
			<a href="${admin}/videos" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Videos</a>
			<a href="${admin}/users" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Users</a>
			<a href="${admin}/reports" class="px-4 flex justify-cneter items-center gap-2 hover:text-rose-500 border-r-2">Reports</a>
		</div>
	</div>
</header>