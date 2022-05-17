/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Client;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thabang
 */
@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeLocal {
    @PersistenceContext(unitName = "E-HealthCarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }

    @Override
    public void createClient(Client client) {
        create(client);
    }

    @Override
    public void editClient(Client client) {
        edit(client);
    }

    @Override
    public void removeClient(Client client) {
        remove(client);
    }

    @Override
    public Client findClient(Object id) {
        return find(id);
    }

    @Override
    public List<Client> findAllClients() {
        return findAll();
    }

    @Override
    public int countClients() {
        return count();
    }
    
}
