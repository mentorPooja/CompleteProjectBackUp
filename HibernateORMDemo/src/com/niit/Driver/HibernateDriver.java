package com.niit.Driver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.niit.Model.EmployeeInfo;
import com.niit.Utility.HibernetUtility;

public class HibernateDriver {

	public static void main(String[] args) {
		
			
		// Write the Student_Info object into the database
		EmployeeInfo employee = new EmployeeInfo();
		employee.setEmpName("Tasmay Kudale");
		employee.setEmpId(111);
		
		SessionFactory sessionFactory = HibernetUtility.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(employee);
		System.out.println("3");

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		// TODO Auto-generated method stub

	}

}
