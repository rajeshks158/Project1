package dao;

import java.sql.SQLException;
import java.util.List;

import model.User;

public interface UserDAO {
	boolean signIn(String email,  String password);
	boolean signUp(User user);
	List<User> view() throws SQLException;
}
