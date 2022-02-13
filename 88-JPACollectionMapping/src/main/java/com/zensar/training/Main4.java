package com.zensar.training;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.IPLTeam;
import com.zensar.training.bean.pack4.Player;
import com.zensar.training.util.JPAUtil;



public class Main4 {

	private static void insertTesting() {
		
		IPLTeam iplTeam=new IPLTeam("Kolkata Knight Riders", "Kolkata", null);
		Player player1=new Player("Dinesh Karthick", "Wicket Keeper", 28);
		Player player2=new Player("Venkatesh Iyer","All rounder", 26);
		Set<Player> players=new HashSet<>();
		players.add(player1);
		players.add(player2);
		iplTeam.setPlayers(players);
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(iplTeam);
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
