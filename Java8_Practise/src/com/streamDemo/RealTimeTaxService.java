package com.streamDemo;

import java.util.List;
import java.util.stream.Collectors;

public class RealTimeTaxService {

	public static List<RealTimeEmployee> taxEvaluation(String input) {
		/*
		 * if (input.equalsIgnoreCase("tax")) { return
		 * RealTimeEmployeeDAO.getListEmployee().stream().filter(emp -> emp.getSalary()
		 * > 500000) .collect(Collectors.toList()); } else { // return null; return
		 * RealTimeEmployeeDAO.getListEmployee().stream().filter(emp -> emp.getSalary()
		 * <= 500000) .collect(Collectors.toList()); }
		 */

		// using ternarry operator
		return (input.equalsIgnoreCase("tax"))
				? RealTimeEmployeeDAO.getListEmployee().stream().filter(emp -> emp.getSalary() > 500000)
						.collect(Collectors.toList())
				: RealTimeEmployeeDAO.getListEmployee().stream().filter(emp -> emp.getSalary() <= 500000)
						.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(RealTimeTaxService.taxEvaluation("tax"));
	}

}
