package com.hospital.HospitalDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.HospitalDemo.entities.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
