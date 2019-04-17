package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Post;

public class PostDAOImpl implements PostDAO {
	private static Connection con;

	static {
		try {
			con=ConnectorUtility.getCon();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into post (Title,Body,User_id) values(?,?,?)");
			System.out.println("post insertion");
			pst.setString(1, post.getTitle());
			pst.setString(2, post.getBody());
			pst.setInt(3, post.getUser_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	public int update(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update post set Title = ?, Body = ? where Post_id = ?");
			System.out.println("post updated");
			pst.setString(1, post.getTitle());
			pst.setString(2, post.getBody());
			pst.setInt(3, post.getPost_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int delete(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from post where Post_id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public List<Post> view() throws SQLException {

		ArrayList<Post> list = new ArrayList<Post>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from post");
		while (rs.next()) {
			list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}

		return list;
	}

	public List<Post> view(int id) {
		ArrayList<Post> post = new ArrayList<Post>();
		System.out.println("VIEWING POSTS");
		try {
			PreparedStatement pst = con.prepareStatement("select * from post where Post_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				post.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return post;
	}

}
