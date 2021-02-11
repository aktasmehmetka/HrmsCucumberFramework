package com.hrms.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Task {

// Create connection to db and retrieve all job titles and store them inside arraylist

	String dbUsername = "syntax_hrm";

	String dbUserPassword = "syntaxhrm123";

	// jdbc:type driver:host:port/name of the database
	String dbUrl = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";

	@Test
	public void getAllTitle() throws SQLException {

		List<String> job_titles = new ArrayList<>();

		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbUserPassword);

		Statement st = connection.createStatement();

		ResultSet rset = st.executeQuery("select * from ohrm_job_title");

		while (rset.next()) {
			job_titles.add(rset.getObject("job_title").toString());

		}
		rset.close();
		st.close();
		connection.close();

		System.out.println(job_titles);
	}
}
