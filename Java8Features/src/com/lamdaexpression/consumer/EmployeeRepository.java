package com.lamdaexpression.consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EmployeeRepository {
	
		
	public static List<Employee> getAllEmploye(){

	Employee e1 = new Employee(1, "siva", 21, "female", "HR", 22000);
	Employee e2 = new Employee(2, "dinesh", 21, "male", "qa", 12000);
	Employee e3 = new Employee(3, "siva", 21, "male", "Developer", 28000);
	Employee e4 = new Employee(4, "Guru", 25, "male", "manager", 22000);
	Employee e5 = new Employee(5, "Anu", 18, "female", "fresher", 18000);
	Employee e6 = new Employee(6, "arun", 26, "male", "BA", 41000);
	Employee e7 = new Employee(7, "Vicky", 28, "male", "qa", 41000);
	Employee e8 = new Employee(8, "Viji", 27, "female", "HR", 41000);
	
	return Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8);
	
	
	
	
	
	
}
}
