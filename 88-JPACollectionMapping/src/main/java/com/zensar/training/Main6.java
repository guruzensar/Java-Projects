package com.zensar.training;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack6.Customer;
import com.zensar.training.bean.pack6.CustomerRating;

import com.zensar.training.util.JPAUtil;



public class Main6 {

	private static void insertTesting() {
		
		CustomerRating customerRating=new CustomerRating("Sridhar");
		
		
		Map<String, Customer> customerMap=new HashMap<>();
		customerMap.put("BEST", new Customer("Apollo Pharmacy", "Mumbai", 3000.00));
		customerMap.put("GOOD", new Customer("XYZ Medicals", "Chennai", 2000.00));
		customerMap.put("OK", new Customer("Health & Glow", "Bangalore", 4000.00));
		
		customerRating.setCustomerRating(customerMap);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(customerRating);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
		
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
