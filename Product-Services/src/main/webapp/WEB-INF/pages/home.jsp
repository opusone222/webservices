<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product</title>
</head>
<body>


    <div align="center">
        <h1>Product List</h1>
        <h3>
            <a href="newProduct">New Product</a>
        </h3>
        <table border="1">

            <th>ProductId</th>
            <th>ProductName</th>
            <th>Description</th>
            <th>ProductImage</th>
            <th>ProductBrand</th>
            <th>ProductStyle</th>
            <th> Action <th>



            <c:forEach var="product" items="${listProduct}">
                <tr>

                    <td>${product.id}</td>
                    <td>${product.product_name}</td>
                    <td>${product.description}</td>
                    <td>${product.product_image}</td>
                    <td>${product.product_brand}</td>
                    <td> ${product.product_style} </td>
                    <td><a href="editProduct?id=${product.id}">Edit</a>

                       <a href="deleteProduct?id=${product.id}">Delete</a></td>

                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
