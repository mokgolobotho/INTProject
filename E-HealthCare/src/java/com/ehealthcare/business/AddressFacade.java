/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Address;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thabang
 */
@Stateless
public class AddressFacade extends AbstractFacade<Address> implements AddressFacadeLocal {
    @PersistenceContext(unitName = "E-HealthCarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AddressFacade() {
        super(Address.class);
    }

    @Override
    public void createAddress(Address address) {
        create(address);
    }

    @Override
    public void editAddress(Address address) {
        edit(address);
    }

    @Override
    public void removeAddress(Address address) {
        remove(address);
    }

    @Override
    public Address findAddress(Long id) {
        return find(id);
    }
    
}
