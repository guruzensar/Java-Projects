package com.zensar.training.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	LocalDate dateOfBirth;
	Gender gender;
	boolean elgible;
	double salary;
	char profession;
	public Person(String name, LocalDate dateOFBirth, Gender gender, boolean elgible, double salary, char profession) {
		super();
		this.name = name;
		this.dateOfBirth = dateOFBirth;
		this.gender = gender;
		this.elgible = elgible;
		this.salary = salary;
		this.profession = profession;
	}
	public Person(int id, String name, LocalDate dateOFBirth, Gender gender, boolean elgible, double salary,
			char profession) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOFBirth;
		this.gender = gender;
		this.elgible = elgible;
		this.salary = salary;
		this.profession = profession;
	}
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOFBirth) {
		this.dateOfBirth = dateOFBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public boolean isElgible() {
		return elgible;
	}
	public void setElgible(boolean elgible) {
		this.elgible = elgible;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getProfession() {
		return profession;
	}
	public void setProfession(char profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dateOFBirth=" + dateOfBirth + ", gender=" + gender
				+ ", elgible=" + elgible + ", salary=" + salary + ", profession=" + profession + "]";
	}
	
	
}
