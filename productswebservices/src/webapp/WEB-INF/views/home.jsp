<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
    <head>

        <meta http-equiv ="Content-Type" content = "text/html: charset=UTF-8">
        <title> Home </title>

        </head>
      <body>
        <div align ="center">
            <h1> Products List </h1>
            <h3><a href ="/add"> New Product </a> </h3>
            <table border="1">
                <th> Id </th>
                <th> Name </th>
                <th> Description </th>
                <th> Image </th>
                <th> Brand </th>

                <c: forEach var ="products" items = "${getProducts}" varStatus ="status">
                <tr>
                    <td> ${status.index +1 } </td>
                    <td> $ { products.Id} </td>
                    <td> ${ products.Name} </td>
                     <td> ${ products.Description} </td>
                     <td> ${ products.Image} </td>
                     <td> ${ products.Brand } </td>


                     <td>
                     <a href = "/remove?id = ${products.Id">Remove </a>
                     </td>

                <tr>
                </c:forEach>
                </table>
                </div>
                </body>
                </html>

