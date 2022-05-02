<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de alumnos</title>
    </head>
    <body>
        
        <h1>Listado de alumnos</h1>
        
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.name} ${student.surname}</td>
                    <td>${student.address.street} ${student.address.streetNumber} ${student.address.country}</td>
                    <td>${student.contact.email}</td>
                    <td>${student.contact.phone}</td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>
