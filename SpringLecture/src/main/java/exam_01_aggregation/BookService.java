package exam_01_aggregation;

import java.util.ArrayList;

public class BookService {
	private DAO dao; //인터페이스는 개인 간의 관계를 끊어버림 
	
	public BookService(BookDAO dao) {
		this.dao=dao;
	}

	//Business Logic을 처리하는 method  
	public ArrayList<BookEntity> getListByKeyword(String keyword) {

		ArrayList<BookEntity> list=dao.selectAll(keyword);
		return list;
	}

}
