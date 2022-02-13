package com.zensar.training;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.Department;
import com.zensar.training.bean.pack3.Employee;
import com.zensar.training.bean.pack3.Gender;

import com.zensar.training.util.JPAUtil;



public class Main3 {

	private static void insertTesting() {
		
		
		Department department=new Department( "HR");
		department.addEmployee(new Employee("Rashmi", 'A', Gender.FEMALE));
		department.addEmployee(new Employee("Anitha", 'B', Gender.FEMALE));
		department.addEmployee(new Employee("Udhay", 'A', Gender.MALE));
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(department);
		em.getTransaction().commit();
		System.out.println("\t\t !>>>>>>>>>>> Department Saved <<<<<<<<<<<<<<!");
	}

	private static void loadTesting() {
		
		

	}

	private static void editTesting() {
		

	}

	private static void deleteTesting() {
		

	}

	private static void loadAllTesting() {

		

	}

	public static void main(String[] args) {
		insertTesting();

	}

}
