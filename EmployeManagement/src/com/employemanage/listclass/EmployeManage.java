package com.employemanage.listclass;

import java.util.ArrayList;

import com.employemanage.employee.Employee;

public class EmployeManage {
	
	ArrayList<Employee> employee = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		
		employee.add(emp);
		System.out.println("Employee add Successfully..");
	}
	
	public void deleteEmp(int id) {
		for(Employee e : employee) {
			if(e.getEmpId() == id) {
				employee.remove(id);
				System.out.println("Deleted...");
			}
			else {
				System.out.println("Not deleted");
			}
		}
		
	}
	
	public void searchEmploye(int id) {
		for(Employee e : employee) {
			if(e.getEmpId() == id) {
				
				System.out.println(e.getEmpName());
			}
		}
		
		
	}
	
	
	public void updateEmp(int id, String newEmpName,String EmpNewMob, String EmpDes ) {
		for(Employee e : employee) {
			if(e.getEmpId() == id) {
				e.setEmpName(newEmpName);
				e.setEmpMob(EmpNewMob);
				e.setEmpDesignation(EmpDes);
				
			}else {
				System.out.println("Not updated.");
			}
		}
		
		
	}
	
	public void listAll() {
		for(Employee e : employee) {
			System.out.println(e);
		}
	}
}
