package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static  Connection connection;

    private static final String URL = "jdbc:MySQL://localhost:3306/database";
    private static final String USER = "root";
    private static final String PASSWORD = "root1";


    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("trouble while getting connection");
        }
        return connection;
    }

}
