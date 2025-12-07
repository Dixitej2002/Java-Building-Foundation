# 📌 Employee Management System (Java + JDBC)

A simple **Console-Based Employee Management System** built using **Core Java, JDBC, and MySQL**.  
This mini-project demonstrates CRUD operations (Create, Read, Update, Delete) with proper JDBC implementation.

---

## 🚀 Features

- Add New Employee  
- View All Employees  
- Search Employee by ID  
- Update Employee Details  
- Delete Employee  
- JDBC MySQL Connectivity  
- Clean Menu-Driven Program  

---

## 🛠️ Tech Stack

| Technology | Description |
|-----------|-------------|
| **Java** | Core Java, OOP |
| **JDBC** | Database Connectivity |
| **MySQL** | Data Storage |
| **Eclipse / IntelliJ** | IDE (optional) |

---

## 📂 Project Structure
EmployeeManagement/
-│
-├── src/
-│ ├── DBConnection.java
-│ ├── Employee.java
-│ ├── EmployeeService.java
-│ └── Main.java

---

## 🗄️ Database Structure

**Table Name:** `emp_details`

| Column Name | Type |
|-------------|------|
| empId | INT PRIMARY KEY |
| empName | VARCHAR(100) |
| empMob | VARCHAR(15) |
| empDes | VARCHAR(50) |

---
## 🤝 Contributing

Pull requests are welcome!
If you find bugs or want improvements, open an issue.

## 📜 License

This project is open-source under the MIT License.

## ⚙️ How to Run the Project

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/your-username/EmployeeManagement.git
cd EmployeeManagement

CREATE DATABASE employee_db;

USE employee_db;

CREATE TABLE emp_details(
  empId INT PRIMARY KEY,
  empName VARCHAR(100),
  empMob VARCHAR(15),
  empDes VARCHAR(50)
);
String url = "jdbc:mysql://localhost:3306/employee_db";
String user = "root";
String pass = "your_password";


---


