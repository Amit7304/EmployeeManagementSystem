package dao;

import model.Employee;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDAO {

    public void addEmployee(Employee emp) {

        String sql = "INSERT INTO employees(id, name, department, salary) VALUES (?, ?, ?, ?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getDepartment());
            ps.setDouble(4, emp.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully!");
            } else {
                System.out.println("Employee Not Added!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}