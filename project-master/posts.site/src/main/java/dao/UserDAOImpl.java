package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Post;
import model.User;

public class UserDAOImpl 
{
	private static Connection con;

	static {
		try {

			con = ConnectorUtility.getCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean signIn(String email, String password) {

		try {
			System.out.println("hdsagwher");
			PreparedStatement pst = con.prepareStatement("select * from user where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean signUp(User user) {
		boolean res = false;
		try {
			System.out.println("ggggg");
			PreparedStatement pst = con.prepareStatement("insert into user (username,email,password) values (?,?,?)");
			pst.setString(1, user.getUsername());
			
			pst.setString(2, user.getEmail());
			pst.setString(3, user.getPassword());
			
			
			
			res = (pst.executeUpdate() == 1) ? true : false ;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	public List<User> view() throws SQLException {

		ArrayList<User> list = new ArrayList<User>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from user");
		while (rs.next()) {
			list.add(new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
		}

		return list;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

