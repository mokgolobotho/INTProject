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
public class Doctor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long licenseNum;
    private String speciality;

    public Doctor() {
    }

    public Doctor(Long licenseNum, String speciality) {
        this.licenseNum = licenseNum;
        this.speciality = speciality;
    }

    public Long getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(Long licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    
    
}
