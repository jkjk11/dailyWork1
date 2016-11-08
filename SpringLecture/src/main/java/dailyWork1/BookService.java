package dailyWork1;

import java.util.ArrayList;

public class BookService {
	
	private BookDAO dao;	
	
	//default Constructor
	public BookService(){
		//default constructor는 무조건 만드는 것이 좋음 
	}	
	
	public BookService(BookDAO dao){ //constructor injection (생성자를 통해 dao를 service에 넣는다.) 
		this.dao=dao;
	}
	
	//getter/setter 
	public BookDAO getDao() {
		return dao;
	}

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}

	//DAO 생성	
	//DAO method 호출 => 결과 받아서 return 
	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		return dao.selectAll(keyword);	
	}
	public ArrayList<ReviewEntity> getRListByBisbn(String bisbn) {
		return dao.selectrList(bisbn);	
	}

}
