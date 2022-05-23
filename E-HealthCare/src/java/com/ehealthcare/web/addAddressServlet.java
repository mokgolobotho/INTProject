/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.web;

import com.ehealthcare.business.AddressFacadeLocal;
import com.ehealthcare.entities.Address;
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
public class addAddressServlet extends HttpServlet {

    @EJB
    private AddressFacadeLocal addressFacade;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String streetName = request.getParameter("streetName");
        String town = request.getParameter("town");
        String province = request.getParameter("province");
        Integer postalCode = Integer.parseInt(request.getParameter("postalCode")); 
        
        addressFacade.createAddress(new Address( streetName, town, province, postalCode));
        
        RequestDispatcher dis = request.getRequestDispatcher("create_username.html");
        dis.forward(request, response);
    }

    private void addToSession(HttpSession session, 
            String streetName, String town, 
            String province, Integer postalCode) {
        
        session.setAttribute("streetName", streetName);
        session.setAttribute("town", town);
        session.setAttribute("province", province);
        session.setAttribute("postalCode", postalCode);
    }

}
