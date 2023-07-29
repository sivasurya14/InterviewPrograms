package streamApiWNT;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UseEmployeeDetails {

	public static void main(String[] args) {

		ArrayList<EmployeeDetails> employeeList = new ArrayList<>();

		// Adding random employee details to the ArrayList
		employeeList.add(new EmployeeDetails("John Smith", 30, "Software Engineer", "IT", 70000.0));
		employeeList.add(new EmployeeDetails("Emily Johnson", 28, "Marketing Specialist", "Marketing", 55000.0));
		employeeList.add(new EmployeeDetails("Michael Brown", 35, "Sales Manager", "Sales", 80000.0));
		employeeList.add(new EmployeeDetails("Jessica Lee", 42, "Senior Accountant", "Finance", 65000.0));
		employeeList.add(new EmployeeDetails("Daniel Wang", 25, null, "Creative", 45000.0));
		employeeList.add(new EmployeeDetails("Sarah Miller", 31, "Human Resources Manager", "HR", 75000.0));
		employeeList.add(new EmployeeDetails("william David", 29, "Data Analyst", "Analytics", 60000.0));
		employeeList.add(new EmployeeDetails("william David", 38, "Operations Director", "Operations", 95000.0));
		employeeList.add(new EmployeeDetails(null, 27, "Customer Support Specialist", "Customer Service", 50000.0));

		// Map<String, EmployeeDetails> map
		// =employeeList.stream().filter(x->x.getAge()>30).collect(Collectors.toMap(EmployeeDetails::getName,y->y));
		// map.forEach((k,v)->System.out.println(k+" "+v));

		employeeList.stream().forEach(System.out::println);

		System.out.println();

		Set<EmployeeDetails> emplist = new TreeSet<EmployeeDetails>();

		emplist = employeeList.stream().collect(Collectors.toSet());

		emplist.forEach(System.out::println);

		// Remove Null vaalues from List
		System.out.println();
		System.out.println("After Removing Null fields from List Of Objects:  ");

		List<EmployeeDetails> filterterdList = employeeList.stream().distinct()
				.filter(x -> x.getName() != null && x.getDepartment() != null && x.getPosition() != null)
				.collect(Collectors.toList());

		filterterdList.forEach(System.out::println);

		System.out.println();
		System.out.println("Using Iterator : ");

		Iterator<EmployeeDetails> iterator = employeeList.iterator();

		while (iterator.hasNext()) {

			System.out.println(iterator.next());
		}	
		System.out.println();
		System.out.println("Using Map Entry : ");

		
	}
}
