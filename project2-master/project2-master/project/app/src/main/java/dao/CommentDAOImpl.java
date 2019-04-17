package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Comment;
import model.Post;

public class CommentDAOImpl implements CommentDAO {
	private static Connection con;


	static {
		try {
			con=ConnectorUtility.getCon();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int insert(Comment comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into comment (User_id,Post_id,Com_body) values (?,?,?)");
			pst.setInt(1, comment.getUser_id());
			pst.setInt(2, comment.getPost_id());
			pst.setString(3, comment.getCom_body());
	

			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	public int update(Comment comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update comment set Com_body = ? where C	_id = ?");
			pst.setString(1, comment.getCom_body());
			pst.setInt(2, comment.getC_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int delete(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from comment where C_id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public List<Comment> view() throws SQLException {

		ArrayList<Comment> list = new ArrayList<Comment>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from comment");
		while (rs.next()) {
			list.add(new Comment(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}

		return list;
	}

	public List<Comment> view(int id) {
		ArrayList<Comment> post = new ArrayList<Comment>();
		System.out.println("VIEWING COMMENTS");
		try {
			PreparedStatement pst = con.prepareStatement("select * from comment where C_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				post.add(new Comment(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return post;
	}

}
