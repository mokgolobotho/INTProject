/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.web;

import com.ehealthcare.business.AddressFacadeLocal;
import com.ehealthcare.business.ClientFacadeLocal;
import com.ehealthcare.business.PersonaldetailsFacadeLocal;
import com.ehealthcare.entities.Address;
import com.ehealthcare.entities.Client;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author stile
 */
public class clientProfileServlert extends HttpServlet {


    @EJB
    private ClientFacadeLocal clientFacade;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        HttpSession session = request.getSession();
        
         String strId = session.getAttribute("id").toString().trim();
         
         Long id  = Long.parseLong(strId);
         
         Client client = clientFacade.findClient(id);
         
         setClientAttributes(session, client);
        
         RequestDispatcher disp = request.getRequestDispatcher("patient_profile.jsp");
         disp.forward(request, response);
         
    }
    
    public static void setClientAttributes(HttpSession session,Client client)
    {
        String surname = client.getSurname();
        String name = client.getName();
        String gender = client.getGender();
        Long id = client.getIdNum();
        String dob = client.getDob();
        String email = client.getEmail();
        String ethnicity = client.getEthnicity();
       // Address address = client.getAddress();
        
        session.setAttribute("name", name);
        session.setAttribute("gender", gender);
        session.setAttribute("id", id);
        session.setAttribute("dob", dob);
        session.setAttribute("email", email);
        session.setAttribute("ethnicity", ethnicity);
        session.setAttribute("surname", surname);
        //session.setAttribute("name", name);
    }

    
}
