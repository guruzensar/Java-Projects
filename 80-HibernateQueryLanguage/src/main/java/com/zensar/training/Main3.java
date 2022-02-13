package com.zensar.training;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main3 {
	
	static void read1() {
		String str = "select d from Doctor d where d.gender='MALE'";

		
	}
	
	
	static void read2() {
		String str = "select d from Doctor d order by d.fees";

		
	}

	static void read3() {
		
	}
	
	static void read4() {
		
	}
	public static void main(String[] args) {
		read4();

	}

}
