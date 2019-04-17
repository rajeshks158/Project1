package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comment;
import model.User;

public interface UserDAO {

	boolean login(String username,String password);

	boolean signUp(User user);

}