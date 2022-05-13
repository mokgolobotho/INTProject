/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thabang
 */
@Entity
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long idNum;

    public Client() {
    }

    public Client(Long idNum) {
        this.idNum = idNum;
    }

    public Long getIdNum() {
        return idNum;
    }

    public void setIdNum(Long idNum) {
        this.idNum = idNum;
    }
    
    

}
