<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>
</head>
<body>
    <div align="center">
        <h1>Member List</h1>
        <h3>
            <a href="newMember">New Member</a>
        </h3>
        <table border="1">

            <th>id</th>
            <th>first_name</th>
            <th>last_name</th>
            <th>email</th>
            <th>gender</th>
            <th>tele_phone </th>
            <th>userid </th>
            <th>Action</th>


            <c:forEach var="member" items="${listMember}">
                <tr>

                    <td>${member.id}</td>
                    <td>${member.first_name}</td>
                    <td>${member.last_name}</td>
                    <td>${member.email}</td>
                    <td>${member.gender}</td>
                    <td> ${member.tele_phone} </td>
                    <td>${member.userid}</td>

                    <td> <a href="editMember?id=${member.id}">Edit</a>

                         <a href="deleteMember?id=${member.id}">Delete</a>
                    </td>

                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
