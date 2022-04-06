package com.zensar.bean;

import java.time.LocalDate;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private String cityName;
	private LocalDate dateOfJoin;
	private Gender gender;
	
	public Employee(int id, String name, double basicSalary, char grade, String cityName, LocalDate dateOfJoin,
			Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
		this.cityName = cityName;
		this.dateOfJoin = dateOfJoin;
		this.gender = gender;
	}

	public Employee(String name, double basicSalary, char grade, String cityName, LocalDate dateOfJoin, Gender gender) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
		this.cityName = cityName;
		this.dateOfJoin = dateOfJoin;
		this.gender = gender;
	}

	public Employee() {
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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade
				+ ", cityName=" + cityName + ", dateOfJoin=" + dateOfJoin + ", gender=" + gender + "]";
	}

	
	
	
	
	

}
