package com.hospital.HospitalDemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.HospitalDemo.entities.Doctor;
import com.hospital.HospitalDemo.entities.Patient;
import com.hospital.HospitalDemo.repositories.DoctorRepo;
import com.hospital.HospitalDemo.repositories.PatientRepo;
import com.hospital.HospitalDemo.service.PatientService;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo patientRepo;
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public Patient addPatient(Patient patient, Integer doctorId) {
		Doctor doc = doctorRepo.findById(doctorId)
				.orElseThrow(() -> new RuntimeException("doctor not found"));
		patient.setDoctor(doc);
		Patient patient2 =patientRepo.save(patient);
		return patient2;
	
	}
		
	@Override
	public boolean checkPatient(String patientName) {
		
		return false;
	}

}
