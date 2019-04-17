package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.User;

public class UserDAOImpl implements UserDAO {

	private static Connection con;

	static {
		try {
			con=ConnectorUtility.getCon();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean login(String username, String password) {
		System.out.println("inside UserDAO");
		boolean res = false;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from user where User_name = ? and Password = ? ");
			System.out.println("user added:");
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				res = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;

	}

	public boolean signUp(User user) {
		boolean res = false;
		try {
			PreparedStatement pst = con.prepareStatement("insert into user (User_name,First_name,Last_name,Email,Password) values (?,?,?,?,?)");
			System.out.println("user added in login:");
			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getFirst_name());
			pst.setString(3, user.getLast_name());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getPassword());
			res = (pst.executeUpdate() == 1) ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}