package Util;

import java.sql.*;

public class ConnectionUtil {
        private static Connection conn;
        public static Connection getConnection() throws SQLException {
            if(conn == null){
                try{
                    String url = "jdbc:mysql://localhost:3306/crud";
                    String username = "root";
                    String password = "Password@1";
                    conn = DriverManager.getConnection(url, username, password);
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery("Select * from students");
                    while(rs.next()){
                        System.out.println(rs.getString("name"));
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }

            return conn;
        }
    }

