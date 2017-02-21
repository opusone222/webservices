<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv ="Content-Type" content = "text/html; charset = UTF-8">

<title> New Product </title>
</head>
<body>
    <div align ="center">
            <h1> New Product </h1>
            <form:form action ="newProduct" method ="post" modelAttribute ="products">
            <table>
                <form:hidden path ="id/">
                <tr>
                    <td> Id: </td>
                    <td> <form:input path ="Id"/> </td>
                 </tr>
                <tr>
                    <td> Name: </td>
                    <td> <form:input path ="Name"/> </td>
                </tr>
                <tr>
                    <td> Description: </td>
                    <td> <form:input path ="Description"/> </td>
                 </tr>
                <tr>
                <td> Image: </td>
                    <td> <form:input path ="Image"/> </td>
                 </tr>
                <tr>
                    <td> Brand: </td>
                    <td> <form:input path ="Brand"/> </td>
                 </tr>

                 <tr>
                 <td colspan ="2" align ="center"><input type ="submit" value ="save"></td>
                  </tr>

                  </table>
                  </form:form>
                  </div>
                  </body>
                  </html>
