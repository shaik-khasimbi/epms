package com.epms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.epms.entity.Nurse;
import com.epms.service.NurseService;

@RestController
public class NurseController {
	
	@Autowired
	private NurseService nurseService;
	
	@GetMapping("/fetchAllNurseInfo")
	public List<Nurse> getAllPNurseInformation() {
		return nurseService.getAllNurseInfo();

	}

	@PostMapping("/saveNurse")
	public void createNurse(@RequestBody Nurse nurse) {
		nurseService.createNurse(nurse);

	}

	@GetMapping("/getNurse/{nurseId}")
	public Nurse getNurseInfoById(@PathVariable int nurseId) {
		return nurseService.getNurseById(nurseId);

	}

	@DeleteMapping("/deleteNurse/{nurseId}")
	public void deleteNurseInfoById(Nurse nurse) {
		nurseService.deleteNurse(nurse.getNurseId());

	}

}
