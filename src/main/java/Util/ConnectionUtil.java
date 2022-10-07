package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class ConnectionUtil {
        private static Connection conn;
        public static Connection getConnection() throws SQLException {
            if(conn == null){
                try{
                    String url = "jdbc:sqlserver://localhost:3306;TrustServerCertificate=True";
                    String username = "root";
                    String password = "Password@1";
                    conn = DriverManager.getConnection(url, username, password);
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }

            return conn;
        }
    }

