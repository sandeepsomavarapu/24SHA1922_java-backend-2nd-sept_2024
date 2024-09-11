package com.ericsson.collections;

import java.util.HashMap;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(124, "rajesh", 19000, "developer");
		HashMap<Long, Employee> emps = new HashMap<Long, Employee>();

		emps.put(949493493l, new Employee(123, "suresh", 9000, "developer"));
		emps.put(98665030l, emp1);
		emps.put(12312323l, new Employee(125, "kumar", 7899, "developer"));
		emps.put(92929292l, new Employee(126, "naresh", 58000, "trainer"));
		emps.put(83928322l, new Employee(127, "mahesh", 45000, "admin"));

		Set<Long> keys = emps.keySet();

		for (long key : keys) {
			Employee emp = emps.get(key);
			if (emp.getEmpSalary() > 35000)
				System.out.println(emp);
		}

	}

}
