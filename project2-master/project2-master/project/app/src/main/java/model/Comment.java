package model;

import dao.ConnectorUtility;

public class Comment {
	private int C_id;
	private String Com_body;
	private int User_id;
	private int Post_id;

	public Comment() {

	}

	public Comment(int c_id, String com_body, int user_id, int post_id) {
		super();
		this.C_id = c_id;
		this.Com_body = com_body;
		this.User_id = user_id;
		this.Post_id = post_id;
	}

	public int getC_id() {
		return C_id;
	}

	public void setC_id(int c_id) {
		this.C_id = c_id;
	}

	public String getCom_body() {
		return Com_body;
	}

	public void setCom_body(String com_body) {
		this.Com_body = com_body;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}

	public int getPost_id() {
		return Post_id;
	}

	public void setPost_id(int post_id) {
		this.Post_id = post_id;
	}

	@Override
	public String toString() {
		return "Comment [C_id=" + C_id + ", Com_body=" + Com_body + ", User_id=" + User_id + ", Post_id=" + Post_id
				+ "]";
	}

}
