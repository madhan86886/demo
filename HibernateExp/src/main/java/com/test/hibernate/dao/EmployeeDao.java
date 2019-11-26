package com.test.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.test.hibernate.bean.Employee;
import com.test.hibernate.utility.DbConnection;

public class EmployeeDao {

	

	public void createEmployee() {

		Employee emp = new Employee();
		emp.setId(18);
		emp.setFirstName("madhan");
		emp.setLastName("bellamkonda");
		emp.setSalary(300);

		SessionFactory factory = DbConnection.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(emp);

		session.getTransaction().commit();
		System.out.println("employee Created");
	}
	public void getValues(){
		SessionFactory factory = DbConnection.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		List<Employee> list =session.createQuery("From Employee").list();
		System.out.println(list);
		
		for (Employee employee : list) {
			
			System.out.println("Employee Id    "+employee.getId());
			System.out.println("Employee fname   "+employee.getId());
			System.out.println("Employee lname    "+employee.getId());
			System.out.println("Employee sal     "+employee.getId());
		}
		session.getTransaction().commit();
		System.out.println("employee from database");
	}
	public void deleteEmp(int id){
		SessionFactory factory = DbConnection.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Employee emp =(Employee) session.get(Employee.class, id);
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("employee deleted");
	}
	public void update(int id,String firstName){
		SessionFactory factory = DbConnection.getSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		Employee emp =(Employee) session.get(Employee.class, id);
		emp.setFirstName(firstName);
		session.update(emp);
		
		session.getTransaction().commit();
		System.out.println("employee updated");
	}
	
}
