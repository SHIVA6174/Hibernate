package com.Tap.OneToOne;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customersdetails")
public class CustomersDetails {

	@Id
	@Column(name="cID")
	private int custID;
	@Column(name="cEmail")
	private String cEmail;
	@Column(name="cPhoneNumber")
	private String cPhoneNumber;
	@Column(name="cBalance")
	private double cBalance;
	
	
	@OneToOne(mappedBy = "custID",cascade = CascadeType.ALL)
	private Customers customers;

	public CustomersDetails() {

	}

	public CustomersDetails(int custID, String cEmail, String cPhoneNumber, double cBalance) {
		super();
		this.custID = custID;
		this.cEmail = cEmail;
		this.cPhoneNumber = cPhoneNumber;
		this.cBalance = cBalance;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcPhoneNumber() {
		return cPhoneNumber;
	}

	public void setcPhoneNumber(String cPhoneNumber) {
		this.cPhoneNumber = cPhoneNumber;
	}

	public double getcBalance() {
		return cBalance;
	}

	public void setcBalance(double cBalance) {
		this.cBalance = cBalance;
	}
	
	

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomersDetails [ " + custID + " " + cEmail + " " + cPhoneNumber
				+ " " + cBalance + "]";
	}

}
