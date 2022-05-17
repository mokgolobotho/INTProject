/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Client;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thabang
 */
@Local
public interface ClientFacadeLocal {

    void createClient(Client client);

    void editClient(Client client);

    void removeClient(Client client);

    Client findClient(Object id);

    List<Client> findAllClients();

//    List<Client> findRange(int[] range);

    int countClients();
    
}
