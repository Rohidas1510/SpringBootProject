package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Model.Patient;



public interface PatientRepository extends JpaRepository<Patient,Integer>{
	//Customize Method
List<Patient>findByid(int id);
//List<Patient> findByname(String name);
}