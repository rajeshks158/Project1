package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectorUtility {
	private static Connection con;

	public static Connection getCon() {
		return con;
	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("connected");

			con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
