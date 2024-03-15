package com.hospital.HospitalDemo.service;

import java.util.List;

import com.hospital.HospitalDemo.entities.Doctor;

public interface DoctorService {
	Doctor addDoctor(Doctor doctor);
	List<Doctor> allDoctor();

}
