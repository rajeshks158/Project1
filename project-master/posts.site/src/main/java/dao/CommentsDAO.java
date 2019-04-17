package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comments;

public interface CommentsDAO {
	int  insertComment(Comments comments);
	int updateComment(Comments comments);
	int deleteComment(int cid);
	List< Comments> view() throws SQLException;
	List<Comments> searchComments(int pid);
}
