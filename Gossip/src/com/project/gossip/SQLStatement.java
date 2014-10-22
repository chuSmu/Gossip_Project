package com.project.gossip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import android.database.SQLException;

public class SQLStatement {
	Connection con = null;
	Statement stmt = null;
	String query;
	String connection = "jdbc:mysql://gossip.bplaced.de:3306/gossip";

	public SQLStatement(String query) {
		super();
		this.query = query;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(connection, "root", "");
			stmt = con.createStatement();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean run() {
		try {
			ResultSet rs = stmt.executeQuery(query);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (stmt != null) {

				try {
					stmt.close();
				} catch (java.sql.SQLException e) {
					System.out.println(e.getMessage());
				}

			}
		}
		return true;
	}
}
