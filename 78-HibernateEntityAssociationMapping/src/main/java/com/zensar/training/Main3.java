package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.ContactInfo;
import com.zensar.training.bean.pack3.Person;
import com.zensar.training.util.HibernateUtil;

public class Main3 {
	static void test1() {
		Person person=new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);
		
		ContactInfo contactInfo=new ContactInfo("John@gmail.com", "9764736738", null);
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		
		
	}
	
	static void test2() {
		Person person=new Person(102,"Jeya", LocalDate.of(2002, 2, 12), 'F', null);
		
		
		
	}
	
	static void test3() {
		ContactInfo contactInfo=new ContactInfo("Jeya2001@gmail.com", "8765819103", null);
		
		
		
	}

	static void test4() {
		
		
		
		
	}
	
	static void test5() {
		
		
		
		
	}
	
	static void test6() {
		
		
		
		
	}
	
	static void test7() {
		
		
		
		
	}
	


	public static void main(String[] args) {
		

	}

}
