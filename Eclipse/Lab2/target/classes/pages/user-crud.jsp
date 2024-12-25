<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User CRUD</title>
</head>
<body>
	<i>${message}</i>
	<c:url var="url" value="/user/crud" />
	<form method="post">
		<label>ID</label>
		<input name="id" value="${user.id}"><br> 
		<label>Password</label>
		<input
			name="password" type="password" value="${user.password}"><br>
		<label>Fullname</label>
		<input name="fullname" value="${user.fullname}"><br>
		<label>Email</label>
		<input	name="email" value="${user.email}"><br> 
		<label>Gender</label>	
		<input name="gender" type="radio" value="true" ${user.admin?'checked':''}>
		Male <input name="gender" type="radio" value="false"
			${user.admin?'':'checked'}> Female
		<hr>
		<button formaction="${url}/create">Create</button>
		<button formaction="${url}/update">Update</button>
		<button formaction="${url}/delete">Delete</button>
		<button formaction="${url}/reset">Reset</button>
	</form>
	<hr>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Password</th>
				<th>Fullname</th>
				<th>Email</th>
				<th>Role</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="u" items="${users}">
				<tr>
					<td>${u.id}</td>
					<td>${u.password}</td>
					<td>${u.fullname}</td>
					<td>${u.email}</td>
					<td>${u.admin?'Admin':'User'}</td>
					<td><a href="${url}/edit/${u.id}">Edit</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>