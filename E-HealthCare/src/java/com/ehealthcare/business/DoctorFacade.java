/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ehealthcare.business;

import com.ehealthcare.entities.Doctor;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Thabang
 */
@Stateless
public class DoctorFacade extends AbstractFacade<Doctor> implements DoctorFacadeLocal {
    @PersistenceContext(unitName = "E-HealthCarePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DoctorFacade() {
        super(Doctor.class);
    }

    @Override
    public void createDoctor(Doctor doctor) {
        create(doctor);
    }

    @Override
    public void editDoctor(Doctor doctor) {
        edit(doctor);
    }

    @Override
    public void removeDoctor(Doctor doctor) {
        remove(doctor);
    }

    @Override
    public Doctor findDoctor(Long id) {
        return find(id);
    }

    @Override
    public List<Doctor> findAllDoctors() {
        return findAll();
    }

    @Override
    public int countDoctors() {
        return count();
    }
    
}
