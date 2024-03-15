package com.hospital.HospitalDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.HospitalDemo.entities.Doctor;
import com.hospital.HospitalDemo.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doctor) {
		Doctor addDoctor = doctorService.addDoctor(doctor);
		return addDoctor;
		
	}

}
