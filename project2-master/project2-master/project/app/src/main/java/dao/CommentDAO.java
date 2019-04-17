 package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comment;

public interface CommentDAO {
	int insert(Comment comment);

	int update(Comment comment);

	int delete(int id);

	List<Comment> view() throws SQLException;

	List<Comment> view(int id);
}
