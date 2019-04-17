package model;

public class Post {
	private int pid;
	private String title;
	private String body;
	private int uid;

public Post() {
	// TODO Auto-generated constructor stub
}

public Post(int pid, String title, String body, int uid) {
	
	this.pid = pid;
	this.title = title;
	this.body = body;
	this.uid = uid;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getBody() {
	return body;
}

public void setBody(String body) {
	this.body = body;
}

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

@Override
public String toString() {
	return "Post [pid=" + pid + ", title=" + title + ", body=" + body + ", uid=" + uid + "]";
}
}
