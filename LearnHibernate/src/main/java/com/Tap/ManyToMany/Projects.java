package com.Tap.ManyToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {

	@Id
	@Column(name = "pID")
	private int pID;
	@Column(name = "project_name")
	private String pName;

	//fetch = FetchType.EAGER   &      fetch = FetchType.LAZY
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(name = "emp_project_details", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private List<Employee> employee;

	public Projects() {

	}

	public Projects(int pID, String pName) {
		super();
		this.pID = pID;
		this.pName = pName;
	}

	public int getpID() {
		return pID;
	}

	public void setpID(int pID) {
		this.pID = pID;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Projects [" + pID + " " + pName + "]";
	}
}
