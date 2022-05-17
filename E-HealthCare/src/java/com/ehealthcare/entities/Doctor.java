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
public class Doctor extends Personaldetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long idNum;
    private String licenseNum;
    private String speciality;

    public Doctor(Long idNum, String name, String surname, String email,  String dob, String gender, String ethnicity,String licenseNum, String speciality) {
        super(idNum, name, surname, email, dob, gender, ethnicity);
        setLicenseNum(licenseNum);
        setSpeciality(speciality);
        setIdNum(idNum);
    }

    public Doctor(Long idNum, String licenseNum, String speciality) {
        this.idNum = idNum;
        this.licenseNum = licenseNum;
        this.speciality = speciality;
    }

    public Doctor() {
    }
    

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
