<%-- 
    Document   : patient_profile
    Created on : 22 May 2022, 10:29:54 PM
    Author     : stile
--%>

<%@page import="com.ehealthcare.business.ClientFacade"%>
<%@page import="com.ehealthcare.entities.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
    </head>
    <body>
        <%
        Long id = Long.parseLong((String)session.getAttribute("id"));
        String name = (String)session.getAttribute("name");
        String surname =(String) session.getAttribute("surname");
        String email =(String) session.getAttribute("email");
        String gender =(String) session.getAttribute("gender");
        String ethnicity = (String)session.getAttribute("ethnicity");
        String dob = (String)session.getAttribute("dob");
        
        
        %>
        <h1>Welcome <%=name%> </h1>
        
        
        <table>
            
            <tr>
                <td>Name:</td>
                <td> <%=name%> </td>
            </tr>
            <tr>
                <td>Surname:</td>
                <td> <%=surname%> </td>
            </tr>
            <tr>
                <td>Id number:</td>
                <td> <%=id%> </td>
            </tr>
            <tr>
                <td>Date of birth:</td>
                <td> <%=dob%> </td>
            </tr>
            <tr>
                <td>Gender:</td>
                <td> <%=gender%> </td>
            </tr>
            <tr>
                <td>Ethnicity:</td>
                <td> <%=ethnicity%> </td>
            </tr>
            <tr>
                <td>Email:</td>
                <td> <%=email%> </td>
            </tr>
            
            
            
            
        </table>
        
            
            <p> Click <a href="patient_menu.jsp" >here</a> to go back to the main menu. </p>
    </body>
</html>
