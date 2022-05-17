/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Address;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thabang
 */
@Local
public interface AddressFacadeLocal {
    
    void createAddress (Address address);
    
    void editAddress (Address address);
    
    void removeAddress (Address address);
    
    Address findAddress (Long id);
    
    

//    void create(Address address);
//
//    void edit(Address address);
//
//    void remove(Address address);
//
//    Address find(Object id);
//
//    List<Address> findAll();
//
//    List<Address> findRange(int[] range);
//
//    int count();
    
}
