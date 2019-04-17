package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Comments;
import model.Post;

public class CommentsDAOImpl implements CommentsDAO {
	private static Connection con;

	static {
		try {

			con = ConnectorUtility.getCon();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public int insertComment(Comments comments) {
		System.out.println("cvb");
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into comments(cbody,uid,pid) values(?,?,?)");

			pst.setString(1, comments.getCbody());
			pst.setInt(2, comments.getUid());
			pst.setInt(3, comments.getPid());
			res = pst.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	public int updateComment(Comments comments) {

		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update Comments set  cbody = ? where cid = ?");

			pst.setString(1, comments.getCbody());
			pst.setInt(2, comments.getPid());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public int deleteComment(int cid) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from Comments where cid = ?");
			pst.setInt(1, cid);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<Comments> view() throws SQLException {

		ArrayList<Comments> list = new ArrayList<Comments>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Comments order by cid desc");
		while (rs.next()) {
			list.add(new Comments(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}

		return list;
	}

	@Override
	public List<Comments> searchComments(int pid) {
		System.out.println("inside dao");
		ArrayList<Comments> list = new ArrayList<Comments>();

		try {
			PreparedStatement pst = con.prepareStatement("select * from comments where pid = ?");
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Comments(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
