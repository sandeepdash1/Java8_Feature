package com.stream.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.streamDemo.RealTimeEmployee;
import com.streamDemo.RealTimeEmployeeDAO;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(12);
		list.add(2);
		list.add(24);

		/*
		 * Collections.sort(list); System.out.println(list);
		 */

		// list.stream().sorted().forEach(t -> System.out.println(t));
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		List<RealTimeEmployee> employees = RealTimeEmployeeDAO.getListEmployee();
		
		//using comparator logic
		employees.stream().sorted((o1,o2)->(int) (o2.getSalary()-o1.getSalary())).forEach(System.out::println);
		
		System.out.println("*********************************");
		//using comparator method
		System.out.println(employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).collect(Collectors.toList()));
		System.out.println("##################################");
		//using comparator method and method refference
		employees.stream().sorted(Comparator.comparing(RealTimeEmployee::getSalary)).forEach(System.out::println);
	}

}
