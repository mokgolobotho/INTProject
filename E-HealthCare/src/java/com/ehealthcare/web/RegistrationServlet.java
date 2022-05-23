/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.web;


import com.ehealthcare.business.ClientFacadeLocal;
import com.ehealthcare.business.DoctorFacadeLocal;
import com.ehealthcare.business.PersonaldetailsFacadeLocal;
import com.ehealthcare.entities.Client;
import com.ehealthcare.entities.Doctor;
import com.ehealthcare.entities.Personaldetails;
import java.io.IOException;
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
 * @author Student
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/RegistrationServlet.do"})
public class RegistrationServlet extends HttpServlet {

    @EJB
    private ClientFacadeLocal clientFacade;

    @EJB
    private PersonaldetailsFacadeLocal personaldetailsFacade;

    @EJB
    private DoctorFacadeLocal doctorFacade;
    

   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
       
        Long id = Long.parseLong(request.getParameter("id"));
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String ethnicity = request.getParameter("ethnicity");
        String dob = (String)request.getParameter("dob");
        String licNum = request.getParameter("licNum");
        String specialization = request.getParameter("specialization");
        
        
        session.setAttribute("name", name);
        session.setAttribute("id", id);
        if(specialization == null){
             //save client
            System.out.println("There was a pro"+ specialization);
            doctorFacade.createDoctor(new Doctor(id, name, surname, email, dob, gender, ethnicity, licNum, specialization));
          
         
        }else{
          
         clientFacade.createClient(new Client(id, name, surname, email, dob, gender, ethnicity));
       }

        RequestDispatcher dis = request.getRequestDispatcher("add_address.html");
        dis.forward(request, response);
    }

    private void addToSession(HttpSession session ,
            Long id, String name, String surname,
            String email, String gender,
            String ethnicity, String dob, String which) {
        session.setAttribute("id", id);
        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
        session.setAttribute("email", email);
        session.setAttribute("gender", gender);
        session.setAttribute("ethnicity", ethnicity);
        session.setAttribute("dob", dob);
        session.setAttribute("which", which);
    }

    private void addToSessionDoc(HttpSession session, 
            Long id, String name, String surname, 
            String email, String gender, String ethnicity,
            String dob, String licNum, String specialization, String which) {
        
        session.setAttribute("id", id);
        session.setAttribute("name", name);
        session.setAttribute("surname", surname);
        session.setAttribute("email", email);
        session.setAttribute("gender", gender);
        session.setAttribute("ethnicity", ethnicity);
        session.setAttribute("dob", dob);
        session.setAttribute("licNum", licNum);
        session.setAttribute("specialization", specialization);
        session.setAttribute("which", which);
    }
}