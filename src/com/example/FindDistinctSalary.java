package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Write a query for below SQL statement,
There is a table A with 5 columns: firstname,lastname, address, city and salary. 
Write a query to print the distinct salaries from the table without using distinct in the query.*/

public class FindDistinctSalary {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			/* String query = "select salary from user"; */
			 String query = "select salary from user group by salary";
			 
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {

				Double salary = rs.getDouble("Salary");

				System.out.format("%s\n", salary);
			}
			st.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
