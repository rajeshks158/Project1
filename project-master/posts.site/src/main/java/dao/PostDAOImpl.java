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

			con = ConnectorUtility.getCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insert(Post post) {
		System.out.println("inside post dao");
		boolean res = false;
		try {
			PreparedStatement pst = con.prepareStatement(" insert into post(title,body,uid)values(?,?,3)");
			pst.setString(1, post.getTitle());
			pst.setString(2, post.getBody());

			res = (pst.executeUpdate() == 1) ? true : false;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int update(Post post) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update post set title = ?, body = ? where pid = ?");
			pst.setString(1, post.getTitle());
			pst.setString(2, post.getBody());
			pst.setInt(3, post.getPid());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int delete(int pid) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from post where pid = ?");
			pst.setInt(1, pid);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Post> view() throws SQLException {
		System.out.println("Inside Impl");

		ArrayList<Post> list = new ArrayList<Post>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from post order by pid desc");
		while (rs.next()) {
			list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
		}
		System.out.println(list);
		return list;
	}

	@Override
	public List<Post> search(String title) {
		System.out.println("PostDAOImpl");
		ArrayList<Post> list = new ArrayList<Post>();
		try {
			PreparedStatement pst = con.prepareStatement("select * from post where title like ?");
			pst.setString(1, "%" + title + "%");
			ResultSet rs = pst.executeQuery();
			System.out.println(rs);
			while (rs.next()) {
				list.add(new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}