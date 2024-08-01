package com.Tap.Launch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tap.OneToOne.Customers;
import com.Tap.OneToOne.CustomersDetails;

public class Launch_Customers_OneToOne {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customers.class);
		cfg.addAnnotatedClass(CustomersDetails.class);
		SessionFactory sF = cfg.buildSessionFactory();
		Session s = sF.openSession();
		Transaction t = s.beginTransaction();
		
		//OneToOne:= 
		
		Customers c = new Customers(400,"Radha");
		CustomersDetails cd = new CustomersDetails(4881, "radha2002@gmail.com", "4210129698", 228900.00);
		c.setCustID(cd);
		s.persist(c);
		
		//get Customers Data:=
		
		Customers customer = s.get(Customers.class, 400);		
		System.out.println(customer + "\n");
		System.out.println(customer.getcID());
		System.out.println(customer.getcName());
		System.out.println();
		
		//get Customers Details Data:=
		
		CustomersDetails customersDetails = customer.getCustID();
		System.out.println(customersDetails + "\n");
		System.out.println(customersDetails.getCustID());
		System.out.println(customersDetails.getcEmail());
		System.out.println(customersDetails.getcPhoneNumber());
		System.out.println(customersDetails.getcBalance());
		
		
		CustomersDetails cd1 = s.get(CustomersDetails.class, 4881);		
		System.out.println(cd1);
		
		Customers c1 = cd.getCustomers();
		System.out.println(c1);
		
		t.commit();

	}
}
