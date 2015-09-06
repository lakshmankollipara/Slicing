<%-- 
    Document   : productsDimensions
    Created on : Dec 7, 2012, 11:23:25 AM
    Author     : user
--%>

<%@page import="nn.WebNN"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%       
            
            String[] args = {""};
            out.println(WebNN.someMain(args));
%>
    </body>
</html>
