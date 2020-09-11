package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		list.add(new Board("제목1", "제목2"));
		list.add(new Board("제목2", "제목2"));
		list.add(new Board("제목3", "제목3"));
		return list;
	}
	
}
