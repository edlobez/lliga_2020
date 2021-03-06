<%-- 
    Document   : home
    Created on : 28-Nov-2019, 07:47:25
    Author     : edlobez-vbox
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security</title>
        <style type="text/css">
            .logout-link {
                background-color: #009688;
                color: whitesmoke;
                border-radius: 5px;
                text-decoration: none;
                padding: 5px 20px;
            }
        </style>
    </head>
    <body>
        <h1>Spring Security</h1>
        <h2>Tutorial 1 - Seguridad HTTP Básica</h2>

        <h4>USERNAME: ${nombre_usuario}</h4>
        <h4>AUTHORITY: ${auth_usuario}</h4>
        
        <p>Estás en la página <b>HOME</b></p>
        
        <a class="logout-link" href="${pageContext.servletContext.contextPath}/ventas">ventas</a> 
        <a class="logout-link" href="${pageContext.servletContext.contextPath}/logout">logout</a>
    </body>
</html>