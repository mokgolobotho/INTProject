/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.web;

import com.ehealthcare.business.ClientFacadeLocal;
import com.ehealthcare.business.DoctorFacadeLocal;
import com.ehealthcare.business.LoginDetailsFacadeLocal;
import com.ehealthcare.business.PersonaldetailsFacadeLocal;
import com.ehealthcare.entities.LoginDetails;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Thabang
 */
public class credentialServlet extends HttpServlet {
    @EJB
    private PersonaldetailsFacadeLocal personaldetailsFacade;
    @EJB
    private ClientFacadeLocal clientFacade;
    @EJB
    private DoctorFacadeLocal doctorFacade;
    @EJB
    private LoginDetailsFacadeLocal loginDetailsFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String re_password = request.getParameter("re-password");
        
        String location = "patient_menu.jsp";
        
        
        
         loginDetailsFacade.storeLogDetails(new LoginDetails(username, password));
                    
        RequestDispatcher disp = request.getRequestDispatcher(location);
        disp.forward(request, response);
        
        
    }
    
}