package com.epms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epms.entity.Nurse;
import com.epms.repostiory.NurseRepository;

@Service
public class NurseService {
	
	@Autowired
	private NurseRepository nurseRepository;
	
	public void createNurse(Nurse nurse) {
		nurseRepository.save(nurse);

	}
	
	public List<Nurse> getAllNurseInfo() {
		return nurseRepository.findAll();

	}
	
	public Nurse getNurseById(int nurseId) {
		return nurseRepository.getReferenceById(nurseId);

	}
	
	public void deleteNurse(int nurseId) {
		nurseRepository.deleteById(nurseId);

	}

}
