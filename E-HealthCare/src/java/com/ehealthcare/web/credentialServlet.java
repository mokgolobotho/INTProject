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
import com.ehealthcare.entities.Address;
import com.ehealthcare.entities.Client;
import com.ehealthcare.entities.Doctor;
import com.ehealthcare.entities.LoginDetails;
import com.ehealthcare.entities.Personaldetails;
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
      
        HttpSession session = request.getSession();
        
        String which = (String) session.getAttribute("which");
        
        // address for both client and doctor
        Address address = createAddress(session); 
        
        Personaldetails personal = createPersonalDetails(address, session);
        //adding to database
        
        personaldetailsFacade.createPersonalDetails(personal);
        
        if ( which.equals("client")) {
            
            Client client = createClient(personal, address, session);
            
            // adding to database
            clientFacade.createClient(client);
        } else {
            
            Doctor doctor = createDoctor(address, session);
            
            // adding to database
            doctorFacade.createDoctor(doctor);
        }
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("re-password");
        String choice  = request.getParameter("client");
         
           loginDetailsFacade.storeLogDetails(new LoginDetails(username,password));
          
           RequestDispatcher  disp = request.getRequestDispatcher("patient_menu.jsp");
           disp.forward(request, response);
         
        
    }

    private Client createClient(Personaldetails personal, Address address, HttpSession session) {
        
        Client client = new Client();
        
        client.setIdNum((Long)session.getAttribute("id"));
        
        return client;
    }

    private Address createAddress(HttpSession session) {
        String streetName = (String) session.getAttribute("streetName");
        String town = (String)session.getAttribute("town");
        String province = (String)session.getAttribute("province");
        Integer postalCode = (Integer) session.getAttribute("postalCode");
        
        Address address = new Address();
        address.setPostalCosde(postalCode);
        address.setProvance(province);
        address.setStrtName(streetName);
        address.setTown(town);
        
        return address;
    }

    private Doctor createDoctor(Address address, HttpSession session) {
        Long id = (Long) session.getAttribute("id");
        String licNum = (String)session.getAttribute("licNum");
        String specialization = (String)session.getAttribute("specialization");
        
        Doctor doctor = new Doctor();
        
        doctor.setIdNum(id);
        doctor.setSpeciality(specialization);
        doctor.setLicenseNum(licNum);
        return doctor;
    }

    private Personaldetails createPersonalDetails(Address address, HttpSession session) {
        Personaldetails details = new Personaldetails();
        
        Long id = (Long) session.getAttribute("id");
        String name = (String)session.getAttribute("name");
        String surname = (String)session.getAttribute("surname");
        String email = (String)session.getAttribute("email");
        String gender = (String)session.getAttribute("gender");
        String ethnicity = (String)session.getAttribute("ethnicity");
        String dob = (String) session.getAttribute("dob");
        
        details.setAddress(address);
        details.setDob(dob);
        details.setEmail(email);
        details.setEthnicity(ethnicity);
        details.setGender(gender);
        details.setIdNum(id);
        details.setName(name);
        details.setSurname(surname);
        
        return details;
    }


    

}
