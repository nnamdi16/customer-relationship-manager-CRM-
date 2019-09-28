package com;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestDbServlet {
  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
    String user = "springstudent";
    String pass = "springstudent";
//    String driver = "com.mysql.jdbc.Driver";
    
    try {
//      Class.forName(driver);
      System.out.println("Connecting to the database " + jdbcUrl);
      Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
      System.out.println("Connection Successful");
      myConn.close();
      
    } catch (Exception exc) {
      exc.printStackTrace();
    }
  }
}
