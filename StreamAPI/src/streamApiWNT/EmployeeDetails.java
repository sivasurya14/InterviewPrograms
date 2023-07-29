package streamApiWNT;

public class EmployeeDetails {
	private String name;
	private int age;
	private String position;
	private String department;
	private double salary;

	public EmployeeDetails(String name, int age, String position, String department, double salary) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", age=" + age + ", position=" + position + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
	

}
