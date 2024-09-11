package com.ericsson.collections;

public class Employee {
	private int empId;
	private String empName;
	private float empSalary;
	private String empDesi;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesi() {
		return empDesi;
	}

	public void setEmpDesi(String empDesi) {
		this.empDesi = empDesi;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// setters and getters
	public Employee(int empId, String empName, float empSalary, String empDesi) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesi = empDesi;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empDesi=" + empDesi
				+ "]";
	}

}
