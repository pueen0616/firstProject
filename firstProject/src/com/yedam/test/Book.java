package com.yedam.test;

public class Book {

	private int bNo;          //도서번호
    private String bTitle;		 //도서제목
    private String bAuthor;      //도서저자
    
	public Book(int bNo, String bTitle, String bAuthor) {
		super();
		this.bNo = bNo;
		this.bTitle = bTitle;
		this.bAuthor = bAuthor;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	@Override
	public String toString() {
		return "도서정보 [도서번호=" + bNo + ", 도서제목=" + bTitle + ", 도서저자=" + bAuthor + "]";
	}

	
    
}
