package com.lamdaexpression.consumer;

public class Employee {
	
		private int id;
		private String name;
		private int age;
		private String gender;
		private String role;
		private int salary;

		
		public Employee(int id, String name, int age, String gender, String role, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.role = role;
			this.salary = salary;
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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", role=" + role
					+ ", salary=" + salary + "]";
		}

	}

