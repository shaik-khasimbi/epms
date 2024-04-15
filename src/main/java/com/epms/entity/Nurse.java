package com.epms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Nurse {
	
	@Id
	@GeneratedValue
	private int nurseId;
	private String nurseName;
	private String mobileNumber;
	
	/*
	 * @OneToMany(mappedBy = "Nurse")
	 * 
	 * @JsonIgnore private List<Patient> patient;
	 */
	public Nurse() {
	}

	public Nurse(int nurseId, String nurseName, String mobileNumber) {
		super();
		this.nurseId = nurseId;
		this.nurseName = nurseName;
		this.mobileNumber = mobileNumber;
	}

	public int getNurseId() {
		return nurseId;
	}

	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}

	public String getNurseName() {
		return nurseName;
	}

	public void setNurseName(String nurseName) {
		this.nurseName = nurseName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Nurse [nurseId=" + nurseId + ", nurseName=" + nurseName + ", mobileNumber=" + mobileNumber + "]";
	}
	
	/*
	 * public List<Patient> getPatient() { return patient; }
	 * 
	 * public void setPatient(List<Patient> patient) { this.patient = patient; }
	 */

}
