package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDemo {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Varun", 20, 25000, "HR", 10023, "male"));
		list.add(new Employee("Swamy", 30, 45000, "IT", 10024, "male"));
		list.add(new Employee("Tarun", 34, 81000, "CS", 10025, "male"));
		list.add(new Employee("Vijay", 33, 62000, "IT", 10026, "male"));
		list.add(new Employee("Ravin", 41, 35000, "CS", 10027, "female"));
		list.add(new Employee("Praba", 19, 75000, "HR", 10027, "female"));
		list.add(new Employee("Kalya", 41, 95900, "CS", 10027, "male"));

		// get all employees sort by name
		System.out.println(list);
		List<Employee> list1 = list.stream().sorted(Comparator.comparing(e -> e.getName()))
				.collect(Collectors.toList());
		System.out.println(list1);

		//How many male and female employees are there in the organization?
		Map<Object, Long> object = list.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		System.out.println(object);

		// Print the name of all departments in the organization?
		list.stream().map(e -> e.getDept()).distinct().forEach(System.out::println);
		// What is the average age of male and female employees?
		Map<Object, Double> map = list.stream()
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.averagingDouble(e -> e.getAge())));
		System.out.println(map);
		// Get the details of highest paid employee in the organization?
		String em = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary()))).get()
				.getName();
		System.out.println(em);
		// Get the all employees whos salary more than 35000?
		list.stream().filter(e -> e.getSalary() > 35000).forEach(System.out::println);

		//// Get the names of all employees whos salary more than 35000?
		list.stream().filter(e -> e.getSalary() > 35000).map(e -> e.getName()).forEach(System.out::println);
		;
		// Count the number of employees in each department?
		Map<Object, Long> ma = list.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
		System.out.println(ma);

		// What is the average salary of each department?
		Map<Object, Double> dd = list.stream()
				.collect(Collectors.groupingBy(e -> e.getDept(), Collectors.averagingDouble(e -> e.getSalary())));
		System.out.println(dd);

		// Get the details of youngest male employee in the HR

		Employee s = list.stream().filter(e -> e.getDept().equals("HR"))
				.collect(Collectors.minBy(Comparator.comparing(e -> e.getAge()))).get();
		System.out.println(s);

		// List down the names of all employees in each department?")
		Map<Object, Long> x = list.stream().collect(Collectors.groupingBy(e -> e.getDept(), Collectors.counting()));
		System.out.println(x);

		// How many male and femal emp whose salary > 35000
		Map<Object, Long> ss = list.stream().filter(e -> e.getSalary() > 35000l)
				.collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
		// collect(Collectors.groupingBy(e -> e.getGender()))
		System.out.println(ss);

	}

}
