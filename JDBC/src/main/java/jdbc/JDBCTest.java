package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBClose;
import db.DBConnection;
import dto.User;

public class JDBCTest {

	// insert
	public boolean insert(String id, String name, int age) {
		String sql = "insert into user(id, name, age, joindate) "
				+ "values(?, ?, ?, now())";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, name);
			psmt.setInt(3, age);
			count = psmt.executeUpdate();
			
			System.out.println("added successfully");
		} catch (SQLException e) {
			System.out.println("add failed");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);
		}
		
		return count > 0 ? true : false;
	}
	
	// delete
	
	
	// select
//	public User search(String id) {
//		String sql = "select id, name, age, joindate"
//				+ "from user"
//				+ "where id = ?";
//		
//		Connection conn = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		try {
//			conn = DBConnection.getConnection();
//			
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, id);
//			
//			rs = psmt.executeQuery();
//					if (rs.next()) {
//						
//					}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
	
	// update
	public boolean update(String id, String name, int age) {
		String sql = "update user set name=?, age=? where id=?";
		Connection conn = null;
		PreparedStatement psmt = null;
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setInt(2, age);
			psmt.setString(3, id);
			count = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count > 0;
	}
	
}

















