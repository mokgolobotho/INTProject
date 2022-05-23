<%-- 
    Document   : patient_menu
    Created on : May 16, 2022, 11:42:13 PM
    Author     : Thabang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Menu Page</title>
    </head>
    <body>
        <%
        String name = (String)session.getAttribute("name");
            
        %>
       
        <h1>Welcome <%=name%> </h1>
        
        <ul>
            <li> <a href="clientProfileServlert.do">Profile </a> </li>  
            <li> <a href="client_request.jsp">Get request </a> </li> 
            <li> <a href="previous_consultation.jsp">Previous consultations </a> </li> 
            <li> <a href="read_article.html">Read Articles </a> </li> 
        </ul>
        
     
        <button onclick="logout()"> Logout</button>
    </body>
</html>
