package Com.Sms.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Com.Sms.Helper;

public class Insert {
	 Scanner sc=new Scanner(System.in);
	    int e_id,eage,esalary;
	    String ename,ecity;
	    //saving employee details in database
	    public void saveMenuDriven() throws SQLException{
	    	System.out.println("enter Employee id: ");
	    	e_id=sc.nextInt();
	    	System.out.println("enter Employee name: ");
	    	ename=sc.next();
	    	System.out.println("enter Employee age: ");
	    	eage=sc.nextInt();
	    	System.out.println("enter Employee city: ");
	    	ecity=sc.next();
	    	System.out.println("enter Employee salary: ");
	    	esalary=sc.nextInt();
	    	Connection conn=Helper.con();
	    	PreparedStatement stmt=conn.prepareStatement("insert into MenuDriven values(?,?,?,?,?)");
	    	stmt.setInt(1, e_id);
	    	stmt.setString(2, ename);
	    	stmt.setInt(3, eage);
	    	stmt.setString(4, ecity);
	    	stmt.setInt(5, esalary);
	    	stmt.executeUpdate();
	    	ResultSet rs=stmt.executeQuery("select * from MenuDriven");
	    	//iteration
	    	while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
	    }
}