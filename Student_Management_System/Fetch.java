package Com.Sms.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Com.Sms.Helper;

public class Fetch {
	//fetching employee details in the database(display)
    public void fetchMenuDriven() throws SQLException{
    	Connection conn=Helper.con();
    	Statement stmt=conn.createStatement();
    	ResultSet rs=stmt.executeQuery("select * from MenuDriven");
    	//iteration
    	while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
    }
}