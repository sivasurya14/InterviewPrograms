package employeeData;

import java.util.ArrayList;
import java.util.List;

    public class UseEmployee {
	
    	 public static List<Employee> getEmployees() {
    		 
 	        ArrayList<Employee> employees = new ArrayList<>();
 	        // Generating and adding example data to the ArrayList
 	        employees.add(new Employee(1, "John Doe", 30, "Male", "IT", 50000));
 	        employees.add(new Employee(2, "William Anderson G", 28, "Female", "HR", 45000));
 	        employees.add(new Employee(3, "Michael Johnson S", 35, "Male", "Finance", 60000));
 	        employees.add(new Employee(4, "Emily Williams", 32, "Female", "Marketing", 52000));
 	        employees.add(new Employee(5, "Robert Brown", 40, "Male", "Operations", 55000));
 	        employees.add(new Employee(6, "Sophia Lee", 29, "Female", "IT", 48000));
 	        employees.add(new Employee(7, "Daniel Martinez", 31, "Male", "HR", 47000));
 	        employees.add(new Employee(8, "Olivia Davis", 27, "Female", "Finance", 58000));
 	        employees.add(new Employee(9, "William Anderson D", 33, "Male", "Marketing", 51000));
 	        employees.add(new Employee(10, "Ava Thomas", 34, "Female", "Operations", 54000));
 	        employees.add(new Employee(11, "James Wilson", 29, "Male", "IT", 52000));
 	        employees.add(new Employee(12, "Lily Clark", 30, "Female", "HR", 49000));
 	        employees.add(new Employee(13, "Alexander Hall", 36, "Male", "Finance", 62000));
 	        employees.add(new Employee(14, "Sofia Allen", 31, "Female", "Marketing", 53000));
 	        employees.add(new Employee(15, "Ethan Scott", 28, "Male", "Operations", 56000));
 	        return employees;
 	        // Sophia Lee, Sofia Allen
 	        
 }
		 		
}
