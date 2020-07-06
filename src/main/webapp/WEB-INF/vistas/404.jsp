<%-- 
    Document   : 403
    Created on : 25-Mar-2020, 12:02:46
    Author     : edlobez
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="ca">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>edfileshare</title>
    </head>
    <body>

        <h1>Acceso denegado</h1>

        <p>No tienes permiso para ver este contenido.</p>
        
        <c:choose>
            <c:when test="${error=='time'}">
                <p>El tiempo entre descargas es demasiado corto.</p>                
            </c:when>
            <c:when test="${error=='inactiva'}">
                <p>Descarga inactiva.</p>                
            </c:when>
            <c:when test="${error=='limite'}">
                <p>Limite de descarga superado</p>                
            </c:when>  
            <c:when test="${error=='password'}">
                <p>Contraseña incorrecta</p>                
            </c:when>  
        </c:choose>
        
        <c:url value="/login" var="loginUrl"/>
        <form action="${loginUrl}" method="post">
            <input type="submit" value="Volver"/>
           <!-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>-->
        </form>

    </body>
</html>
