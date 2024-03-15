package com.hospital.HospitalDemo.service;

import com.hospital.HospitalDemo.entities.Patient;

public interface PatientService {
	Patient addPatient(Patient patient,Integer doctorId);
	boolean checkPatient(String patientName);
	

}
