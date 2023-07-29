package com.lamdaexpression.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerEmployeExample {

	static Consumer<Employee> con1 = (emp) -> System.out.println(emp);
	static Consumer<Employee> con2 = (emp) -> System.out.println(emp.getName().toUpperCase());
	static List<Employee> list = EmployeeRepository.getAllEmploye();

	public static void main(String[] args) {

//	list.forEach(con2);
		// list.forEach(con1);
 //    getwithCondtion();
	
		
	}
  static void getwithCondtion() {
	  
		list.forEach((per) -> {
			if (per.getGender().equalsIgnoreCase("male") && per.getAge() > 21) {
				con1.accept(per);
			}
		});

	}
}
