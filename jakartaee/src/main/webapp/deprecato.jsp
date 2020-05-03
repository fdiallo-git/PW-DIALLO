<%-- 
    Document   : deprecato
    Created on : 1-mag-2020, 20.47.39
    Author     : Fatimatou Diallo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
        <meta charset="UTF.8">
        <meta name="viewport" content="width=divice-width, initial-scale=1.0">
    </head>
    <body>
        <div
        <h1>JSP Scriplet deprecato....</h1>
        <ul>
            <%
                for (int i = 1; i <= 10; i++) {
            %>
            <li><%=i%></li>
                <%

                    }
                %>

        </ul>
    </div>
    
    </body>
</html>
