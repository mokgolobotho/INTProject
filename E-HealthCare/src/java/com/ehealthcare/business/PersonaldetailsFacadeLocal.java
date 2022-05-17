/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Personaldetails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thabang
 */
@Local
public interface PersonaldetailsFacadeLocal {

    void createPersonalDetails(Personaldetails personaldetails);

    void editPersonalDetails(Personaldetails personaldetails);

    void removePersonalDetails(Personaldetails personaldetails);

    Personaldetails findPersonalDetails(Long id);

    List<Personaldetails> findAllPersonalDetails();

//    List<Personaldetails> findRange(int[] range);

//    int countPersonalDetails();
    
}
