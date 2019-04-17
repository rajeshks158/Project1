package dao;


import java.sql.SQLException;
import java.util.List;

import model.Post;

public interface PostDAO {
	boolean insert(Post post);
	int update(Post post);
	int delete(int pid);
	List<Post> search(String title);
	List<Post> view() throws SQLException;
	

}
