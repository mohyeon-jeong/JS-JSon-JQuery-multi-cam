package main;

public class MainClass {

	public static void main(String[] args) {
		/*
			JDBC : Java DataBase Connectivity
		 */
		
		DBConnectionTest dbtest = new DBConnectionTest();
		dbtest.initConnection();
		
		String id = "id1";
		String name = "name1";
		int age = 21;
		int count = dbtest.insert(id, name, age);
		if (count > 0) {
			System.out.println("added data");
		}
	}

}