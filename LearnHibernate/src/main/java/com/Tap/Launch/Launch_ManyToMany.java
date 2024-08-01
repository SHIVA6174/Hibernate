package com.Tap.Launch;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Tap.ManyToMany.Employee;
import com.Tap.ManyToMany.Projects;

public class Launch_ManyToMany {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Projects.class);
		SessionFactory sF = cfg.buildSessionFactory();
		Session s = sF.openSession();
		Transaction t = s.beginTransaction();

		Employee radha = new Employee(21, "Radha");
		Employee krishna = new Employee(22, "Krishna");

		Projects p1 = new Projects(4881, "Free Fire Game");
		Projects p2 = new Projects(4882, "PuBg");

		ArrayList<Projects> listOfProjects = new ArrayList<Projects>();
		listOfProjects.add(p1);
		listOfProjects.add(p2);

		radha.setProjects(listOfProjects);
		krishna.setProjects(listOfProjects);

		s.persist(radha);
		s.persist(krishna);

		t.commit();

	}

}

/** Hibernate New Methods:= 
 * 
 * save()   :->    #persist(String, Object)
 * update() :->    #merge(Object)
 * delete() :->    #remove(Object)
 * load()   :->    #get()
 * 
 * load()                                 get()
 * supports lazy & eager loading           supports lazy & eager loading 
 * if object not found it will be          if object not found it will be  give `null`
 * give `object not foundException`
 * 
 *  
 *  life cycle of hibernate:= 
 *             
 *           object in session       object saved in session
 *                ^                            ^
 *                |                            |
 *            new Employee()                 save()                     programe termination
 *     start ----------------> transient ----------------> persistent  ------------------------> stop
 *                                            persist()       /       \
 *                                                           / close() \    delete()
 *                                                          / clear()   \   remove()
 *                                                         /  detach()   \
 *                                                        \/              \
 *                                                  ditached              \/      
 *                                                     |                 remove
 *                                                     \/   
 *                                          object removed from session
 *                                          
 *                                          
 *                                          
 *                                          
 *                __state__           __object in session__        __object in database__ 
 *              
 *                 transient                 yes                         no
 *                 persistent                yes                         yes 
 *                 ditached                  no                          yes 
 *                 remove                    yes                         no
 *                 
 *                                                             
 * */
