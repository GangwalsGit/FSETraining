package com.question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


 

public class TestMain {

    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;

    public Connection getConnection()  throws SQLException
    {
        Connection myinConn = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");  
        myinConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?characterEncoding=latin1&useConfigs=maxPerformance", "root" , "DataGuard432$");
        }catch (Exception exc) {
            exc.printStackTrace();
        }


        return myinConn;
    }

    public  void getAllGuests()throws SQLException  {

         myConn  = getConnection();
            try {
                TestMain obj = new TestMain();
                myConn = obj.getConnection();
                // 2. Create a statement
                myStmt = myConn.createStatement();

                // 3. Execute SQL query
                myRs = myStmt.executeQuery("select * from employee");

                // 4. Process the result set
                while (myRs.next()) {
                    System.out.println("ID:"+myRs.getString("idEmployee") + ", Name : " + myRs.getString("Emp_name") + ", Age: " + myRs.getString("emp_age"));
                }
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }
            finally {
                if (myRs != null) {
                    myRs.close();
                }

                if (myStmt != null) {
                    myStmt.close();
                }

                if (myConn != null) {
                    myConn.close();
                }
            }
    }

    public  void getAllGuestsByNames()throws SQLException  {

         myConn  = getConnection();
            try {
            	TestMain obj = new TestMain();
                myConn = obj.getConnection();
                // 2. Create a statement
                myStmt = myConn.createStatement();

                // 3. Execute SQL query
                myRs = myStmt.executeQuery("select * from employee");

                // 4. Process the result set
                while (myRs.next()) {
                    System.out.println( " Name : " + myRs.getString("Emp_name") );
                }
            }
            catch (Exception exc) {
                exc.printStackTrace();
            }
            finally {
                if (myRs != null) {
                    myRs.close();
                }

                if (myStmt != null) {
                    myStmt.close();
                }

                if (myConn != null) {
                    myConn.close();
                }
            }
    }
    public static void main(String[] args) throws SQLException  {

 

        
    	TestMain obj = new TestMain();
        obj.getAllGuests();
        obj.getAllGuestsByNames();
    }

 

}
