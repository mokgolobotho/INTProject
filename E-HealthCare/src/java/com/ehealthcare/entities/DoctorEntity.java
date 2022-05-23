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
public class DoctorEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String licenseNum;
    private String speciality;
    private Long idNum;
    private String name;
    private String surname;
    private String email;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Address address;
    private String dob;
    private String gender;
    private String ethnicity;
    
    
}
