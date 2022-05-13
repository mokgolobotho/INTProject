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
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String strtName, Town, provance;
    private int postalCosde;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStrtName() {
        return strtName;
    }

    public void setStrtName(String strtName) {
        this.strtName = strtName;
    }

    public String getTown() {
        return Town;
    }

    public void setTown(String Town) {
        this.Town = Town;
    }

    public String getProvance() {
        return provance;
    }

    public void setProvance(String provance) {
        this.provance = provance;
    }

    public int getPostalCosde() {
        return postalCosde;
    }

    public void setPostalCosde(int postalCosde) {
        this.postalCosde = postalCosde;
    }
    
}
