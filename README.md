# Employee Management System

A simple Java console-based Employee Management System built using Java, JDBC, MySQL, and the DAO Design Pattern.

## Features

- Add Employee
- View Employee Details
- Update Employee
- Delete Employee
- MySQL Database Connectivity
- DAO Pattern
- JDBC PreparedStatement

## Technologies Used

- Java
- JDBC
- MySQL
- IntelliJ IDEA
- Git & GitHub

## Project Structure

```
src/
│
├── dao/
│   └── EmployeeDAO.java
│
├── model/
│   └── Employee.java
│
├── util/
│   └── DBConnection.java
│
└── Main.java
```

## Database

Create database:

```sql
CREATE DATABASE employee_db;
```

Create table:

```sql
CREATE TABLE employees(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);
```

## How to Run

1. Clone the repository.
2. Import the project into IntelliJ IDEA.
3. Add MySQL Connector JAR.
4. Update MySQL username and password in `DBConnection.java`.
5. Run `Main.java`.

## Future Improvements

- Search Employee
- Update Employee
- Delete Employee
- Menu Driven Application
- Input Validation
- Exception Handling

