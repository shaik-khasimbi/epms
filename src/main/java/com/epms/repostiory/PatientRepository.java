package com.epms.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epms.entity.Patient;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Integer>{

}
