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
        <h2>Introduzca la informaci�n requerida</h2>
            
            <form action="procesador" method="post">
                Nombre del usuario:
                <br>
                <input type="text" name="nombre" value=""><br>
                
                N�mero a asignar:
                <br>
                <input type="text" name="base" value=""><br>
                
                SKU:
                <br> 
                <input type="text" name="altura" value=""><br>
                
                Nombre de la compa��a:
                <br> 
                <input type="text" name="altura" value=""><br>
                
                Ticket#:
                <br> 
                <input type="text" name="altura" value=""><br>
                
                <input type="submit" value="Calcular!">
                                
            </form>
           
    </body>
    
</html>