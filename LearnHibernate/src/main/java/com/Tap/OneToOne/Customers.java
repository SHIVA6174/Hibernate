package com.Tap.OneToOne;

import java.util.List;

import com.Tap.ManyToOne_OneToMany.Orders;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {

	@Id 
	@Column(name="cID")
	private int cID;
	@Column(name="cName")
	private String cName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="custID")
	private CustomersDetails custID;
	
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	public Customers() {

	}

	public Customers(int cID, String cName) {
		super();
		this.cID = cID;
		this.cName = cName;
	}

	public int getcID() {
		return cID;
	}

	public void setcID(int cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public CustomersDetails getCustID() {
		return custID;
	}

	public void setCustID(CustomersDetails custID) {
		this.custID = custID;
	}
	

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customers [ " + cID + " " + cName + "]";
	}

}
