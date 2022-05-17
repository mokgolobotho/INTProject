/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.LoginDetails;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Thabang
 */
@Local
public interface LoginDetailsFacadeLocal {

    void storeLogDetails(LoginDetails loginDetails);

    void editLogDetails(LoginDetails loginDetails);

    void removeLogDetails(LoginDetails loginDetails);

    LoginDetails findLogDetails(String username);

    
}
