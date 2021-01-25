import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AssignClass {
	
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://remotemysql.com:3306/sMkXvyYxZM";
		String uname="sMkXvyYxZM";
		String pass="8h9tWhCKws";
		String databasename="sMkXvyYxZM";
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = (Connection)DriverManager
			    .getConnection("jdbc:mysql://remotemysql.com:3306/" + databasename + "?useSSL=false", uname, pass);
		
		
		String query1="select * from number_table";
		String query2="UPDATE number_table SET number_id=(number_id*2) WHERE MOD(number_id,5) = 0;";


		String query3="create table number_table (number_id int,name varchar(255));";
		String query4 = "INSERT INTO number_table VALUES (123, 'Zara')";
		String query5 = "INSERT INTO number_table VALUES (124, 'Ram')";
		String query6 = "INSERT INTO number_table VALUES (127, 'Aman')";
		String query7 = "INSERT INTO number_table VALUES (1253, 'Rohit')";
		String query8 = "INSERT INTO number_table VALUES (1550, 'Raj')";
		String query9 = "INSERT INTO number_table VALUES (1260, 'Akash')";
		String query10 = "INSERT INTO number_table VALUES (200, 'Mohit')";
		String query11 = "INSERT INTO number_table VALUES (550, 'Mohit')";
	
				
		Statement st=con.createStatement();
		st.executeUpdate(query3);
		st.executeUpdate(query4);
		st.executeUpdate(query5);
		st.executeUpdate(query6);
		st.executeUpdate(query7);
		st.executeUpdate(query8);
		st.executeUpdate(query9);
		st.executeUpdate(query10);
		st.executeUpdate(query11);
		
		
		System.out.print("yes working right");

		
		ResultSet rs1=st.executeQuery(query1);
		while(rs1.next())
		{
			int number=rs1.getInt("number_id");
			if(number%5!=0)
			{
				// print multiple of 5
				System.out.println(number);
			}
			else
			{
				break;
			}
		}
		
		
		System.out.println(".............................");
		
		// multiplying multiple of 5 by 2
		st.executeUpdate(query2);
		ResultSet rs2=st.executeQuery(query1);
		while(rs2.next())
		{
			int number=rs2.getInt("number_id");
			System.out.println(number);
		}
		
		
		st.close();
		con.close();
	}

}
