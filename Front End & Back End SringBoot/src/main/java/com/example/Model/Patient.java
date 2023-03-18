package com.example.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Patient {
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String name, String address, String dieases) {
		super();
		this.id = id;
		Name = name;
		Address = address;
		Dieases = dieases;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String Name;
	private String Address;
	private String Dieases;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDieases() {
		return Dieases;
	}

	public void setDieases(String dieases) {
		Dieases = dieases;
	}



}
