package test12;

import java.sql.*;

public class Test12 {
    public static void main(String[] args) throws SQLException {
        Connection a = DriverManager.getConnection("url", "user", "pass");
        PreparedStatement b = a.prepareStatement("sql statement");
        ResultSet c = b.executeQuery();

    }
}
