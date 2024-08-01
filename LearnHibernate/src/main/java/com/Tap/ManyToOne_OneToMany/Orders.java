package com.Tap.ManyToOne_OneToMany;

import com.Tap.OneToOne.Customers;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@Column(name="orderID")
	private int orderID;
	@Column(name="itemName")
	private String itemName;
	@Column(name="itemPrice")
	private int itemPrice;
	
	
	//ManyToOne:= 
	
//	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})  --> used when delete 1 order execept customer and customerdetails.
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cID")
	private Customers customer;
	
	public Orders() {
		
	}

	public Orders(int orderID, String itemName, int itemPrice) {
		super();
		this.orderID = orderID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	
	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [ " + orderID + " " + itemName + " " + itemPrice + "]";
	}

	
}
