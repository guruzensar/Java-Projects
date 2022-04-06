package com.zensar.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.bean.Person;
import com.zensar.bean.Student;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context;
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1,s2,s3;
		s1=(Student) context.getBean("stud1");
		System.out.println(s1);
		
		s2=(Student) context.getBean("stud2");
		System.out.println(s2);
		
		String cmp=(String) context.getBean("company");
		System.out.println(cmp);
		
		Double ms=(Double) context.getBean("min-salary");
		System.out.println(ms);
		
		s3=(Student) context.getBean("stud3");
		System.out.println(s3);
		
		Person person=(Person) context.getBean("personBean");
		System.out.println(person);
	}

}
