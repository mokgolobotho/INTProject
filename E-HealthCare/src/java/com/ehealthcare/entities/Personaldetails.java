/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Thabang
 */
@Entity
public class Personaldetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long idNum;
    private String name;
    private String surname;
    private String email;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Address address;
    private String dob;
    private String gender;
    private String ethnicity;

    public Personaldetails() {
    }

    public Personaldetails(Long idNum, String name, String surname, String email, String dob, String gender, String ethnicity) {
        this.idNum = idNum;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.ethnicity = ethnicity;
    }
    
    

    public Long getIdNum() {
        return idNum;
    }

    public void setIdNum(Long idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    
}