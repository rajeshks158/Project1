package model;
import dao.ConnectorUtility;
public class Post {
	private int Post_id;
	private String Title;
	private String Body;
	private int User_id;

	public Post() {

	}

	public Post(int post_id, String title, String body, int user_id) {

		this.Post_id = post_id;
		this.Title = title;
		this.Body = body;
		this.User_id = user_id;
	}

	public int getPost_id() {
		return Post_id;
	}

	public void setPost_id(int post_id) {
		this.Post_id = post_id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		this.Body = body;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		this.User_id = user_id;
	}

	@Override
	public String toString() {
		return "Post [Post_id=" + Post_id + ", Title=" + Title + ", Body=" + Body + ", User_id=" + User_id + "]";
	}

}
