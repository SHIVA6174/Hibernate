package com.Tap.Launch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Tap.CRUD.Employees;

public class Launch_Employees_CRUD {

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employees.class);
		SessionFactory sF = cfg.buildSessionFactory();
		Session s = sF.openSession();
		Transaction t = s.beginTransaction();

		// Insertion:=

		Employees E1 = new Employees(20,"Vandana","vandana2002@gmail.com",865000,"Software Tester");
//		s.save(E1);
		s.persist(E1);		
		Employees E2 = new Employees(21,"Radha","krishna@gmail.com",456000,"Web Developer");
		s.persist(E2);		
		Employees E3 = new Employees(22,"Krishna","radha@gmail.com",435000,"UI & UX Designer");
		s.persist(E3);		
		Employees E4 = new Employees(23,"Chandra Mohan","chandra@gmail.com",563000,"Android Developer");
		s.persist(E4);		
		Employees E5 = new Employees(24,"Aravind","aravind@gmail.com",365000,"IOS Developer");
		s.persist(E5);

		// Retrive The Data:=

		Employees emp = s.get(Employees.class, 20);
		System.out.println(emp);

		// Updation:=

		Employees emp2 = s.get(Employees.class, 20);
		emp2.seteSalary(1000000);
		s.update(emp2);

		// Delation:=

		Employees del = s.get(Employees.class, 24);
		s.delete(del);

		// GetAll Employees:=

		Query query = s.createQuery("FROM Employees e");
		List listOfEmp = query.getResultList();
		
		for (Object emp3 : listOfEmp) {
			System.out.println(emp3);
		}

		// updation using HQL :=

		Query query1 = s.createQuery("UPDATE Employees e SET e.eSalary = e.eSalary-10000 WHERE e.eID = 23");
		System.out.println(query1.executeUpdate());

		// Delation using HQL:=

		Query query2 = s.createQuery("DELETE FROM Employees e WHERE e.eID = 23");
		System.out.println(query2.executeUpdate());

		t.commit();
	}

}
