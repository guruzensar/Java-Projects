package com.zensar.training;

import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack2.Country;
import com.zensar.training.util.JPAUtil;



public class Main2 {

	private static void insertTesting() {
		
		
		Country country=new Country();
		country.setCountryName("INDIA");
		Set<String> cityNames=new TreeSet<String>();
		cityNames.add("Delhi");
		cityNames.add("Mumbai");
		cityNames.add("Chennai");
		country.setCityNames(cityNames);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(country);
		em.getTransaction().commit();
		
		
		
		System.out.println("\t\t !>>>>>>>>>>> Country Data Saved <<<<<<<<<<<<<<!");
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
