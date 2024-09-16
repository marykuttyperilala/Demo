package com.demo;

public class Employee {
	
	String name;
	int age;
	double salary;
	String dept;
	int id;
	String gender;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + ", id=" + id
				+ ", gender=" + gender + "]";
	}
	public Employee(String name, int age, double salary, String dept, int id, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.id = id;
		this.gender = gender;
	}
	
	

}
