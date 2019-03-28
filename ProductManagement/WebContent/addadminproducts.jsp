<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Products</title>
</head>
<body>
<jsp:include page="adminheader.jsp" />
<form action="/ProductManagement/addadminproducts" method="post">
	<table >
		<tr>
			<td>Product ID</td>
			<td><input type="text" value="${productmodel.productId }"></td>
		</tr>
		<tr>
			<td>Product Title</td>
			<td><input type="text" value="productmodel.title"></td>
		</tr>
		<tr>
			<td>Product Catagory</td>
			<td><input type="text" value="productmodel.productPrice"></td>
		</tr>
		<tr>
			<td>Product Price</td>
			<td><input type="text" value="productmodel.productCatagory"></td>
		</tr>
		
		<tr>
			<td>Product Description</td>
			<td><textarea rows="4" cols="50" name="productDescription"></textarea></td>
		</tr>
		
		
		<tr>
			<td>Product Image</td>
			<td><input type="file" value=""></td>
		</tr>
		<tr>
		<td>${action}</td>
		<td>
		<c:if test="${action=='addadminproducts'}">
			<input type="hidden" value="addadminproducts" name="action">	
		</c:if>
		<input type="submit" value="Submit"></td>
		
		</tr>
	</table>
	</form>
</body>
</html>