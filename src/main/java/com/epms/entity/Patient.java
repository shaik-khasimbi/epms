package com.epms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue
	private int patientId;
	private String patientName;
	private int age;
	private String location;
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY) private Nurse nurse;
	 */
	
	public Patient() {
	}

	public Patient(int patientId, String patientName, int age, String location) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.location = location;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", Age=" + age + ", location="
				+ location + "]";
	}
	
	/*
	 * public Nurse getNurse() { return nurse; }
	 * 
	 * public void setNurse(Nurse nurse) { this.nurse = nurse; }
	 */
}
