package exam_02_BookSearch_DI;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;	
	private String keyword;	
	
	//default Constructor
	public BookService(){
		//default constructor는 무조건 만드는 것이 좋음 
	}
	
	public BookService(BookDAO dao){ //constructor injection (생성자를 통해 dao를 service에 넣는다.) 
		this.dao=dao;
	}
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public ArrayList<BookEntity> getListByKeyword() {
		return dao.selectAll(keyword);
		//DAO 생성
		
		//DAO method 호출 => 결과 받아서 return 
	
	}

}
