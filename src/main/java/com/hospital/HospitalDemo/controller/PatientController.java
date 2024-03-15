package com.hospital.HospitalDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.HospitalDemo.entities.Patient;
import com.hospital.HospitalDemo.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
    @Autowired
	private PatientService patientService;
    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient,@RequestParam Integer doctorId) {
    	
    	Patient addPatient = patientService.addPatient(patient, doctorId);
		return addPatient;
    	
    }
}
