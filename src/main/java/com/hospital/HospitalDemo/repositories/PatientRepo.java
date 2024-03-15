package com.hospital.HospitalDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.HospitalDemo.entities.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
