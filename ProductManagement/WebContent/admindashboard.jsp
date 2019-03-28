<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>

<jsp:include page="adminheader.jsp" />

<table align="center" border="0">
		
		<tr>
			<td>ID</td>
			<td>Title</td>
			<td>Price</td>
			<td>Catagory</td>
			<td>Update</td>
			<td>Delete</td>
		</tr>
			<c:forEach items="${products}" var="pm">
			<tr>
				<td>${pm.productId}</td>
				<td>${pm.title}</td>
				<td>${pm.productPrice}</td>
				<td>${pm.productCatagory}</td>
				<td><a href="/ProductManagement/admin?action=update&id=${pm.productId}">Update</a></td>
				<td><a href="/ProductManagement/admin?action=delete&id=${pm.productId}">Delete</a></td>
				</tr>
			</c:forEach>
	</table>
${products}

</body>
</html>