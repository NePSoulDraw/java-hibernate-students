<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            Agregar alumno
        </title>
    </head>
    <body>
        
        <h1>
            Agregar alumno
        </h1>
        
        <form name="form1" action="${pageContext.request.contextPath}/ServletAdd"
              method="POST">
            
            Nombre: <input type="text" name="name" />
            
            <br />
            
            Apellido: <input type="text" name="surname" />
            
            <br />
            <br />
            
            Datos de domicilio:

            <br />
            
            Calle: <input type="text" name="street" />
            
            <br />
            
            No. calle: <input type="number" name="streetName" />
            
            <br />
            
            País: <input type="text" name="country" />
            
            <br />
            <br />
            
            Datos de contacto:
            
            <br />
            
            Email: <input type="email" name="email" />
            
            <br />
            
            Teléfono: <input type="number" name="phone" />
            
            <br />
            <br />
            
            <input type="submit" value="Añadir alumno" name="add" />
                
        </form>
        
    </body>
</html>