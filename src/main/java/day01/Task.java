package day01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Task {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","123456");
    }
}
