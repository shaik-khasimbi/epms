package com.epms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epms.entity.Patient;
import com.epms.repostiory.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public void createPatient(Patient patient) {
		patientRepository.save(patient);

	}
	
	public List<Patient> getAllPatientInfo() {
		return patientRepository.findAll();

	}
	
	public Optional<Patient> getPatientById(int patientId) {
		return patientRepository.findById(patientId);

	}
	
	public void deletePatient(int patientId) {
		patientRepository.deleteById(patientId);

	}
	
	public void updatePatient(Patient patient) {
		patientRepository.save(patient);

	}

}
