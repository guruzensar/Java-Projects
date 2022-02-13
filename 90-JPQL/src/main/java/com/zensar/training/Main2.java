package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.JPAUtil;

public class Main2 {
	
	static void test1() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query=em.createNamedQuery("findAll", Doctor.class);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}
	
	static void test2() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query=em.createNamedQuery("findById", Doctor.class);
		query.setParameter("did", 1);
		Doctor doctor=query.getSingleResult();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test2();

	}

}
 