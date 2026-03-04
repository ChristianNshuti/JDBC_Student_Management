package student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/student_db_jdbc";
    private static final String USER= "enterprisedb";
    private static final String PASSWORD = "ncmmcn";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}