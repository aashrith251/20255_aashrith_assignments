package com.sonata.emp.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
		Connection connection;
		public Connection getConnection()
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudydb","root","Aashrith251@");
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e);
			}
			catch(SQLException s)
			{
				System.out.println(s);
			}
			return connection;
		}
		public void closeConnection()
		{
			try
			{
				if(connection !=null)
				{
					connection.close();
				}
			}
			catch(SQLException sqle)
			{
				sqle.printStackTrace();
			}
		}
}