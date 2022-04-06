package com.zensar.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.zensar.bean.Employee;
import com.zensar.bean.Gender;

public class UIModules {
	
	public void addInfo() {
		System.out.println("\t\t ADD NEW EMPLOYEE \n\n");
		System.out.println("\t\t -------------------------------");
		
		String name=InputPrompter.promptInputForString("Enter Name ");
		double basic=InputPrompter.promptInputForDouble("Enter Basic Salary ");
		char grade=InputPrompter.promptInputForChar("Enter Grade ");
		String cityName=InputPrompter.promptInputForString("Enter City Name ");		
		LocalDate doj=InputPrompter.promptForDateInput("Enter Date of Join", "dd-MM-yyyy");
		Gender gender=InputPrompter.promptForGenderInput("Enter Gender 1.Male 2.Female ");
		
		Employee employee;
		employee=new Employee(name, basic, grade, cityName, doj, gender);
		// store in dB
		
	}
	
	public void searchInfo() {
		System.out.println("\t\t SEARCH EMPLOYEE \n\n");
		
		int id=InputPrompter.promptInputForInt("Enter Search ID ");
		
		//load from DB
		
		
	}

	public void editInfo() {
		System.out.println("\t\t EDIT EMPLOYEE \n\n");
		
		int id=InputPrompter.promptInputForInt("Enter ID ");
		String name=InputPrompter.promptInputForString("Enter Name ");
		double basic=InputPrompter.promptInputForDouble("Enter Basic Salary ");
		char grade=InputPrompter.promptInputForChar("Enter Grade ");
		String cityName=InputPrompter.promptInputForString("Enter City Name ");		
		LocalDate doj=InputPrompter.promptForDateInput("Enter Date of Join", "dd-MM-yyyy");
		Gender gender=InputPrompter.promptForGenderInput("Enter Gender 1.Male 2.Female ");
	
		// update db
	}
	
	public void listInfo() {
		System.out.println("\t\t LIST EMPLOYEES \n\n");
		
		//load all Employee Records and display
	}
	
	public void deleteInfo() {
		System.out.println("\t\t DELETE EMPLOYEE \n\n");
		
		int id=InputPrompter.promptInputForInt("Enter ID to Delete ");
		
		// delete from db
	}
	
	public void exit() {
		System.out.println("\t\t Exiting...Thank you... \n\n");
		System.exit(0);
	}




}
