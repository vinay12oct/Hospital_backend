package com.hospital.HospitalDemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.HospitalDemo.entities.Doctor;
import com.hospital.HospitalDemo.repositories.DoctorRepo;
import com.hospital.HospitalDemo.service.DoctorService;
@Service
public class DoctorServiceimpl implements DoctorService {
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		Doctor doctor2 = doctorRepo.save(doctor);
		return doctor2;
	}

	@Override
	public List<Doctor> allDoctor() {
		List<Doctor> all = doctorRepo.findAll();
		return all;
	}

}
