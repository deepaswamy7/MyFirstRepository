package student;

import java.sql.*;  
import java.io.*; 

public class Test {

 
	public static void main(String args[])throws Exception{  
	//Class.forName("oracle.jdbc.driver.OracleDriver");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Deepika#7");  
	  
	PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");  
	  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	do{  
	 
	System.out.println("enter name:");  
	String name=br.readLine(); 
	System.out.println("enter id:");  
	int id=Integer.parseInt(br.readLine()); 
	System.out.println("enter email:");  
	String email=br.readLine();  
	System.out.println("enter pass:");  
	String pass=br.readLine();  
	System.out.println("enter confirm:");  
	String confirm=br.readLine();  
	  
	ps.setInt(1,id);  
	ps.setString(2,name);  
	ps.setString(3,email); 
	ps.setString(3,pass);
	ps.setString(3,confirm);
	int i=ps.executeUpdate();  
	System.out.println(i+" records affected");  
	  
	System.out.println("Do you want to continue: y/n");  
	String s=br.readLine();  
	if(s.startsWith("n")){  
	break;  
	}  
	}while(true);  
	  
	con.close();  
	}}  