package com.Tap.CRUD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	@Id
	@Column(name = "eID")
	private int eID;

	@Column(name = "eName")
	private String eName;

	@Column(name = "eEmail")
	private String eEmail;

	@Column(name = "eSalary")
	private int eSalary;

	@Column(name = "eDepartment")
	private String eDepartment;

	public Employees() {

	}

	public Employees(int eID, String eName, String eEmail, int eSalary, String eDepartment) {
		super();
		this.eID = eID;
		this.eName = eName;
		this.eEmail = eEmail;
		this.eSalary = eSalary;
		this.eDepartment = eDepartment;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public void seteDepartment(String eDepartment) {
		this.eDepartment = eDepartment;
	}

	public int geteID() {
		return eID;
	}

	public String geteName() {
		return eName;
	}

	public String geteEmail() {
		return eEmail;
	}

	public int geteSalary() {
		return eSalary;
	}

	public String geteDepartment() {
		return eDepartment;
	}

	@Override
	public String toString() {
		return eID + " " + eName + " " + eEmail + " " + eSalary + " " + eDepartment;
	}

}
