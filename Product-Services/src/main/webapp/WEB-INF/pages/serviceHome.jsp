<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Service</title>
</head>
<body>
    <div align="center">
        <h1>Service List</h1>
        <h3>
            <a href="newService">New Service</a>
        </h3>
        <table border="1">

            <th>service_id</th>
            <th>service_name</th>
            <th>Action</th>


            <c:forEach var="service" items="${listService}">
                <tr>

                    <td>${service.id}</td>
                    <td>${service.name}</td>


                    <td> <a href="editService?id=${service.id}">Edit</a>

                         <a href="deleteService?id=${member.id}">Delete</a>
                    </td>

                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
