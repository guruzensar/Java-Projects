package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mysql.cj.xdevapi.SessionFactory;
import com.zensar.training.bean.Question;
import com.zensar.training.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);

	}

	private static void insertTesting() {
		Question question=new Question(1, "Is Java Platform Independent?");
		question.addChoice("YES");
		question.addChoice("NO");
		
		HibernateUtil.init();
		Session session  =HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(question);
		
		transaction.commit();
		
		System.out.println("Question Saved");
	}

	private static void loadTesting(int id) {
		
	}

	private static void loadAllTesting() {
		
	}

	private static void updateTesting(int id) {

		

	}

	private static void deleteTesting(int id) {
		

	}

}
