package com.employemanage.employee;

public class Employee {

	
	private int EmpId;
	private String EmpName;
	private String EmpMob;
	private String empDesignation;
	
	
	public Employee() {
		super();
	}


	public int getEmpId() {
		return EmpId;
	}


	public void setEmpId(int empId) {
		EmpId = empId;
	}


	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public String getEmpMob() {
		return EmpMob;
	}


	public void setEmpMob(String empMob) {
		EmpMob = empMob;
	}


	public String getEmpDesignation() {
		return empDesignation;
	}


	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}


	public Employee(int empId, String empName, String empMob, String empDesignation) {
		EmpId = empId;
		EmpName = empName;
		EmpMob = empMob;
		this.empDesignation = empDesignation;
	}


	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpMob=" + EmpMob + ", empDesignation="
				+ empDesignation + "]";
	}
	
	
	
	
	
}
