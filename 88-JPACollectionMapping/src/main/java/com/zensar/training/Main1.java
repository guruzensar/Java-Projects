package com.zensar.training;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack1.Product;

import com.zensar.training.util.JPAUtil;



public class Main1 {

	private static void insertTesting() {
		
		
		Product product=new Product("Park Avenue");
		List<Double> plannedOfferPrices=new LinkedList<Double>();
		plannedOfferPrices.add(158.00);
		plannedOfferPrices.add(212.00);
		plannedOfferPrices.add(104.00);
		product.setPlannedOffersPrices(plannedOfferPrices);

		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(product);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();
		
		
		
		
		System.out.println("\t\t !>>>>>>>>>>> Product Saved <<<<<<<<<<<<<<!");
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
