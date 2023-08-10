package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCUtil
{
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://localhost/policiesIOT?useSSL=false";
  static final String USER = "root";
  static final String PASS = "root";
  
  public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
    
    return DriverManager.getConnection("jdbc:mysql://localhost/policiesIOT?useSSL=false", "root", "root");
  }
}