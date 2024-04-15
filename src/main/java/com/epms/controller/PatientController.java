package com.epms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epms.entity.Patient;
import com.epms.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/fetchAllPatientInfo")
	public List<Patient> getAllPatientInformation() {
		return patientService.getAllPatientInfo();

	}

	@PostMapping("/savePatient")
	public void createPatient(@RequestBody Patient patient) {
		patientService.createPatient(patient);

	}

	@GetMapping("/getPatient/{patientId}/")
	public Optional<Patient> getPatientInfoById(@PathVariable int patientId) {
		return patientService.getPatientById(patientId);

	}

	@DeleteMapping("/deletePatient/{patientId}/")
	public void deletePatientInfoById(Patient patient) {
		patientService.deletePatient(patient.getPatientId());

	}
	
	
	  @PutMapping("/updatePatient") 
	  public void patchPatientInfoById(@RequestBody Patient patient) {
	  patientService.updatePatient(patient);
	  
	  }
	 

}
