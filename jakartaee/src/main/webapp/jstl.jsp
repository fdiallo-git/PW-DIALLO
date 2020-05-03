<%-- 
    Document   : jspl
    Created on : 1-mag-2020, 20.57.35
    Author     : Fatimatou Diallo
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <div>
            <h1>Test JakartaEE.....</h1>
            <p>funziona ogni tanto...</p>
            <ul>
                <c:forEach begin="1" end="10" var="x">
                    <li>
                        <c:out value="${x}"/>
                    </li>
                </c:forEach>
            </ul>

        </div>
    </body>
</html>
