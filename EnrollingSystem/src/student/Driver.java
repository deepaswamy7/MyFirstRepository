
package student;

import java.sql.*;
public class Driver {

		public static void main(String[] args) {  
		   Connection conn = null;
		   Statement stmt = null;
		   
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Deepika#7");

		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		    
		      ResultSet rs = stmt.executeQuery("select *from login");

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		        System.out.println("uname is--"+rs.getString("uname")+"id is---"+rs.getInt("id")+"email is---"+rs.getString("email")+
		        		"password is"+rs.getString("pass")+"confirm pwd is"+rs.getString("confirm"));
		      }
		    
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		 
		}//end main
		}//end FirstExample
	