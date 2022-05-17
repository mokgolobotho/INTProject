/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Personaldetails;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thabang
 */
@Stateless
public class PersonaldetailsFacade extends AbstractFacade<Personaldetails> implements PersonaldetailsFacadeLocal {
    @PersistenceContext(unitName = "E-HealthCarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaldetailsFacade() {
        super(Personaldetails.class);
    }

    @Override
    public void createPersonalDetails(Personaldetails personaldetails) {
        create(personaldetails);
    }

    @Override
    public void editPersonalDetails(Personaldetails personaldetails) {
        edit(personaldetails);
    }

    @Override
    public void removePersonalDetails(Personaldetails personaldetails) {
        remove(personaldetails);
    }

    @Override
    public Personaldetails findPersonalDetails(Long id) {
        return find(id);
    }

    @Override
    public List<Personaldetails> findAllPersonalDetails() {
        return findAll();
    }
    
}
