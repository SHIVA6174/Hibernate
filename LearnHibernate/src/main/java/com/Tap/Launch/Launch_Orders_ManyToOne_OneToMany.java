package com.Tap.Launch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tap.ManyToOne_OneToMany.Orders;
import com.Tap.OneToOne.Customers;
import com.Tap.OneToOne.CustomersDetails;

public class Launch_Orders_ManyToOne_OneToMany {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Orders.class);
		cfg.addAnnotatedClass(Customers.class);
		cfg.addAnnotatedClass(CustomersDetails.class);
		SessionFactory sF = cfg.buildSessionFactory();
		Session s = sF.openSession();
		Transaction t = s.beginTransaction();
		
//		Orders chickenBiryani = new Orders(100,"chicken Biryani",899);
//		Orders muttonBiryani = new Orders(101,"mutton Biryani",999);
//		Orders gobiRice = new Orders(102,"gobi Rice",150);
//		
//		Customers vandana = s.get(Customers.class, 400);
//		
//		chickenBiryani.setCustomer(vandana);
//		muttonBiryani.setCustomer(vandana);
//		gobiRice.setCustomer(vandana);
//		
//		s.persist(chickenBiryani);
//		s.persist(muttonBiryani);
//		s.persist(gobiRice);
		
		
		//new Customer:= 
		
//		Customers customer = new Customers(401,"Vandana Reddy");
//		CustomersDetails customersDetails = new CustomersDetails(4882,"vandana@gmail.com","2085545903",95000);
//		customer.setCustID(customersDetails);
		
		//orders:=
		
//		Orders noodles = new Orders(103,"Noodles",399);
//		Orders eggRice = new Orders(104,"Egg Rice",199);
//		Orders eggRoast = new Orders(105,"Egg Roast",299);
//		
//		noodles.setCustomer(customer);                                     
//		eggRice.setCustomer(customer);                                     
//		eggRoast.setCustomer(customer);                                    
//		                                                                   
//		s.persist(noodles);                                                
//		s.persist(eggRice);                                                
//		s.persist(eggRoast);                                               
		                                                                   
		                                                                   
		//get complete Details:= ManyToOne                                 
		                                                                   
//		Orders order = s.get(Orders.class, 104);                           
//		System.out.println(order);                                         
//		                                                                   
//		Customers cust = order.getCustomer();
//		System.out.println(cust);
//		
//		CustomersDetails custDetails = cust.getCustID();
//		System.out.println(custDetails);
		
		
		// oneToMany:=
		
		Customers customer = s.get(Customers.class, 401);
		List<Orders> customerOrders = customer.getOrders();
		for (Orders orderDetails : customerOrders) {
			System.out.println(orderDetails);
		}
		
		

		t.commit();
	}
}
