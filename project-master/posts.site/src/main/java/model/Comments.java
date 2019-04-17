package model;

public class Comments {
	private int cid;

	private String cbody;

	private int uid;
	private int pid;

	public Comments() {
		
	}

	public Comments(int cid, String cbody, int uid, int pid) {
		super();
		this.cid = cid;
		this.cbody = cbody;
		this.uid = uid;
		this.pid = pid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCbody() {
		return cbody;
	}

	public void setCbody(String cbody) {
		this.cbody = cbody;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "Comments [cid=" + cid + ", cbody=" + cbody + ", uid=" + uid + ", pid=" + pid + "]";
	}
	
	

}
