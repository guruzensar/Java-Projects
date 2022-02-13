package com.zensar.training;

import java.util.Map;
import java.util.TreeMap;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack5.TeamMember;
import com.zensar.training.util.JPAUtil;




public class Main5 {

	private static void insertTesting() {
		
		TeamMember teamMember=new TeamMember("Dinesh");
		
		Map<String, Integer> skillMap=new TreeMap<>();
		skillMap.put("HTML", 8);
		skillMap.put("Angular", 6);
		
		teamMember.setSkillDetails(skillMap);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(teamMember);
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
