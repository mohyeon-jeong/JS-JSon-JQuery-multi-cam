package main;

import db.DBConnection;
import jdbc.JDBCTest;

public class MainClass {

	public static void main(String[] args) {
		DBConnection.initConnection();
		
		JDBCTest jt = new JDBCTest();
		
//		String id = "id2";
//		String name = "name2";
//		int age = 22;
//		
//		boolean b = jt.insert(id, name, age);
//		if (b == true) {
//			System.out.println("added successfully");
//		}
		
		String id = "id2";
		String name = "name3";
		int age = 23;
		
		boolean b1 = jt.update(id, name, age);
		if (b1 == true) {
			System.out.println("updated successfully");
		}
	}

}
