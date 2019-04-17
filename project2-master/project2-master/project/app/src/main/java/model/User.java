
package model;
import dao.ConnectorUtility;

public class User {
	private int User_id;
	private String Username;
	private String First_name;
	private String Last_name;
	private String Email;
	private String password;

	public User() {
		super();
	}

	public User(int user_id, String username, String first_name, String last_name, String email, String password) {
		
		this.User_id = user_id;
		this.Username = username;
		 this.First_name = first_name;
		this.Last_name = last_name;
		this.Email = email;
		this.password = password;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}

	public String getUser_name() {
		return Username;
	}

	public void setUser_name(String username) {
		this.Username = username;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		this.First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		this.Last_name = last_name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [User_id=" + User_id + ", User_name=" + Username + ", First_name=" + First_name + ", Last_name="
				+ Last_name + ", Email=" + Email + ", password=" + password + "]";
	}

}
