/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.LoginDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thabang
 */
@Stateless
public class LoginDetailsFacade extends AbstractFacade<LoginDetails> implements LoginDetailsFacadeLocal {
    @PersistenceContext(unitName = "E-HealthCarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LoginDetailsFacade() {
        super(LoginDetails.class);
    }

    @Override
    public void storeLogDetails(LoginDetails loginDetails) {
        create(loginDetails);
    }

    @Override
    public void editLogDetails(LoginDetails loginDetails) {
        edit(loginDetails);
    }

    @Override
    public void removeLogDetails(LoginDetails loginDetails) {
        remove(loginDetails);
    }

    @Override
    public LoginDetails findLogDetails(String username) {
        return find(username);
    }
    
}
