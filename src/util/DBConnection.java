package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/employee_db";
        String username = "root";
        String password = "root123";

        try {

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password
            );

            return con;

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}