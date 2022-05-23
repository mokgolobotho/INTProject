/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.web;

import com.ehealthcare.business.LoginDetailsFacadeLocal;
import com.ehealthcare.entities.LoginDetails;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Thabang
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet.do"})
public class LoginServlet extends HttpServlet {
    @EJB
    private LoginDetailsFacadeLocal loginDetailsFacade;



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session = request.getSession(true);
       String username = request.getParameter("username").trim();
       String password = request.getParameter("password");
       String place="wrong_details.jsp";
       boolean found= false;
       List <LoginDetails> loginDetails =loginDetailsFacade.findAllDetails();
       LoginDetails login = null;
       
        System.out.println(loginDetails.get(0));
        System.out.println(password);
        
       for(int i=0;i<loginDetails.size();i++)
       {
           if(loginDetails.get(i).getUsername().trim().equalsIgnoreCase(username))
           {
               found = true;
               login = loginDetails.get(i);
               break;
           }
           System.out.println(found);
           
       }
       
       if(found==true){
       if(login.getPassword().trim().equalsIgnoreCase("password")){
           place="patient_menu.jsp";
       
       }
       }
       
       RequestDispatcher disp = request.getRequestDispatcher(place);
       disp.forward(request, response);
    }


}
