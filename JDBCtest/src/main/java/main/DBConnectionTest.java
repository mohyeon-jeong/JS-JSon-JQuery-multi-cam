package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	Connection conn = null;

	public void initConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot find DB Driver");
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "1234");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Cannot connect to DB");
			e.printStackTrace();
		}
		return conn;
	}

	public int insert(String id, String name, int age) {
		String spl = " insert into user(id, name, age, joindate) "
				+ " values('" + id + "', '" + name + "', " + age + ", now()) ";

		Connection conn = getConnection();
		Statement psmt = null;
		int count = 0;

		try {
			psmt = conn.createStatement(); // init connection
			count = psmt.executeUpdate(spl); // execute sql
			System.out.println("adding data success");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) // close db
					conn.close();
				if (psmt != null)
					psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return count;
	}

//	public int delete() {
//
//	}
//
//	public void select() {
//
//	}
//
//	public int update() {
//
//	}

}
