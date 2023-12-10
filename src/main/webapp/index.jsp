<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="controller.procesador" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Registro Inventario</title>
    </head>
    
    <body>
    
        <h1>Registro Inventario</h1>
        <h2>Introduzca la información requerida</h2>
            
            <form action="procesador" method="post">
                Nombre del usuario:
                <br>
                <input type="text" name="upn" value=""><br>
                
                Número a asignar:
                <br>
                <input type="text" name="did" value=""><br>
                
                SKU:
                <br> 
                <input type="text" name="sku" value=""><br>
                
                Nombre de la compañía:
                <br> 
                <input type="text" name="companyname" value=""><br>
                
                Ticket#:
                <br> 
                <input type="text" name="ticket" value=""><br>
                
                <input type="submit" value="Generar">
                                
            </form>
           
    </body>
    
</html>