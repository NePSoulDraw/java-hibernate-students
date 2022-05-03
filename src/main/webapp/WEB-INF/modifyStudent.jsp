<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Editar alumno
        </title>
    </head>
    <body>
        
        <h1>
            Editar alumno
        </h1>
        
        <form name="form1" 
              action="${pageContext.request.contextPath}/ServletModify?studentId=${student.studentId}"
              method="POST">
            
            Nombre: <input type="text" name="name" value="${student.name}" />
            
            <br />
            
            Apellido: <input type="text" name="surname" value="${student.surname}" />
            
            <br />
            <br />
            
            Datos de domicilio:

            <br />
            
            Calle: <input type="text" name="street" value="${student.address.street}" />
            
            <br />
            
            No. calle: <input type="number" name="streetNumber" value="${student.address.streetNumber}" />
            
            <br />
            
            País: <input type="text" name="country" value="${student.address.country}" />
            
            <br />
            <br />
            
            Datos de contacto:
            
            <br />
            
            Email: <input type="email" name="email" value="${student.contact.email}" />
            
            <br />
            
            Teléfono: <input type="number" name="phone" value="${student.contact.phone}" />
            
            <br />
            <br />
            
            <input type="submit" value="Actualizar alumno" name="modify" />
            <input type="submit" value="Eliminar alumno" name="delete" />
                
        </form>
        
    </body>
</html>