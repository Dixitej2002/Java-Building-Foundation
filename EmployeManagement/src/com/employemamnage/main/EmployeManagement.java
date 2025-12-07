package com.employemamnage.main;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.employemanage.DBCon.DBConnection;
import com.employemanage.employee.Employee;
import com.employemanage.listclass.EmployeManage;

public class EmployeManagement {
	

		public static void main(String... args) throws SQLException {
			
			EmployeManage em = new EmployeManage();
			
			Scanner sc = new Scanner(System.in);
			
			
			while(true) {
				
			
			System.out.println("##### Welcome to Employee Management System #####");
			
			System.out.println("PRESS 1 FOR ADD EMPLOYEE");
			System.out.println("PRESS 2 FOR DELETE EMPLOYEE");
			System.out.println("PRESS 3 FOR UPDATE EMPLOYEE");
			System.out.println("PRESS 4 FOR SEARCH EMPLOYEE");
			System.out.println("PRESS 5 FOR DISPLAY ALL EMPLOYEE");
			System.out.println("PRESS 6 FOR EXIT FROM MENU");
			
			System.out.print("Enter choice from menu: ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				// add employee
				System.out.print("Enter Emp id: ");
				int empId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Emp Name: ");
				String empName = sc.nextLine();
				System.out.print("Enter EmpMob: ");
				String emoMob = sc.nextLine();
				System.out.print("Enter Emp Designation: ");
				String empDes = sc.nextLine();
				
				Employee emp = new Employee(empId,empName,emoMob,empDes);
				
				em.addEmployee(emp);
				
				String query = "insert into emp_details (empId,empName,empMob,empDes) values (?,?,?,?)";
				
				PreparedStatement psmt = DBConnection.DbCon().prepareStatement(query);
				
				psmt.setInt(1, emp.getEmpId());
				psmt.setString(2, emp.getEmpName());
				psmt.setString(3, emp.getEmpMob());
				psmt.setString(4, emp.getEmpDesignation());
				
				int com = psmt.executeUpdate();
				if(com > 0) System.out.println("1 row affected");
				
				
				
				
			}
			else if(ch == 2) {
				// delete employee
				System.out.println("Enter empId:");
				int deleteId = sc.nextInt();
				em.deleteEmp(deleteId);
				
				String deleteQuery = "delete from emp_details where empId = ?";
				
				PreparedStatement psmt = DBConnection.DbCon().prepareStatement(deleteQuery);
				psmt.setInt(1, deleteId);
				psmt.executeUpdate();
				
			}
			else if(ch == 3) {
				// update employee
				System.out.print("Enter Emp id: ");
				int NempId = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Emp Name: ");
				String NempName = sc.nextLine();
				System.out.print("Enter EmpMob: ");
				String NemoMob = sc.nextLine();
				System.out.print("Enter Emp Designation: ");
				String NempDes = sc.nextLine();
				
				em.updateEmp(NempId, NempName, NemoMob, NempDes);
				String updateQuery = "update emp_details set empName = ?,empMob = ?,empDes = ? where empId=? " ;
				
				PreparedStatement psmt = DBConnection.DbCon().prepareStatement(updateQuery);
				psmt.setString(1, NempName);
				psmt.setString(2, NemoMob);
				psmt.setString(3, NempDes);
				psmt.setInt(4, NempId);
				
			int a=	psmt.executeUpdate();
				if(a>0) System.out.println("update success.");
				else System.out.println("Not updated");
				
			}
			else if(ch == 4) {
				// search employee
				System.out.println("Enter empId:");
				int searchId = sc.nextInt();
				em.searchEmploye(searchId);
				
				String searchQuery = "select * from emp_details where empId = ?";
				PreparedStatement p = DBConnection.DbCon().prepareStatement(searchQuery);
				
				p.setInt(1, searchId);
				
				ResultSet res = p.executeQuery();
				
				
				if(res.next()) {
					int id = res.getInt("empId");
					String name=res.getString("empName");
					String mob =res.getString("empMob");
					String desig =res.getString("empDes");
					
					System.out.println("[" + "Emp Id: "+ id +
							"Emp name: "+ name +
							"Emp mob: "+ mob +
							"Emp Designation: "+ desig);
					
				}
				
				
				
			}
			else if(ch == 5) {
				//display all employee
				
				em.listAll();
				String getAllQuery = "select * from emp_details";
				Statement st = DBConnection.DbCon().createStatement();
				
				ResultSet rs = st.executeQuery(getAllQuery);
				
				if(rs.next()) {
					int id = rs.getInt("empId");
					String name=rs.getString("empName");
					String mob =rs.getString("empMob");
					String desig =rs.getString("empDes");
					
					System.out.println("[" + "Emp Id: "+ id + " " +
							"Emp name: "+ name +  " " +
							"Emp mob: "+ mob +  " " +
							"Emp Designation: "+ desig);
					System.out.println("**************");
				}
				
				
			}
			else if(ch == 6) {
				break;
			}
			}
			
			
		}
}
