package com.yedam.Hompage;

public class HomePageGET {
	
	private String id;
	private String pwd;
	private int gnu;	
	private String title;
	private String user1;
	private String contents;
	
	public HomePageGET(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}
	
	public HomePageGET(String id, String pwd, int gnu, String title, String user1, String contents) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.gnu = gnu;
		this.title = title;
		this.user1 = user1;
		this.contents = contents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getGnu() {
		return gnu;
	}

	public void setGnu(int gnu) {
		this.gnu = gnu;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
}
