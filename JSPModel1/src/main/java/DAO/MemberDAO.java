package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBClose;
import db.DBConnection;
import dto.MemberDTO;

public class MemberDAO {

	private static MemberDAO dao = null;
	
	private MemberDAO() {
		DBConnection.initConnection();
	}
	
	public static MemberDAO getInstance() {
		if (dao == null) {
			dao = new MemberDAO();
		}
		return dao;
	}
	
	public boolean getId(String id) {
		String sql = " select id "
				+ " from member "
				+ " where id=?";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		boolean findId = false;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("1/3 getId success");
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			System.out.println("2/3 getId success");
			
			rs = psmt.executeQuery();
			System.out.println("3/3 getId success");
			
			if (rs.next()) {
				findId = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, rs);
		}
		
		return findId;
	}
	
	public boolean addMember(MemberDTO dto) {
		String sql = " insert into member(id, pwd, name, email, auth) "
				+ " values(?, ?, ?, ?, 3)";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		int count = 0;
		
		try {
			conn = DBConnection.getConnection();
			System.out.println("addMem 1/3");
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getEmail());
			System.out.println("addMem 2/3");
			
			count = psmt.executeUpdate();
			System.out.println("addMem 3/3");
		} catch (SQLException e) {
			System.out.println("addMember failed");
			e.printStackTrace();
		} finally {
			DBClose.close(conn, psmt, null);
		}
		
		return count > 0;
	}
	
}



















