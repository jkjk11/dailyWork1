package exam_01_composition;

import java.util.ArrayList;

public class BookService {

	//Business Logic을 처리하는 method  
	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		
		//로직처리->x
		//DB처리
		//서비스 객체가 자신의 method내에서 다른 객체(DAO)를 생성해서 사용.
		//Composition관계에 있음.
		//두 개의 객체가 강하게 결합할 수 밖에 없음. (service객체는 DAO객체가 있어야 함) =tightly coupled
		//클래스를 재사용하기가 힘듬 => 클래스간 연결고리가 묶여있기 때문에 유지보수 힘듬. 
		//우리가 하려는 객체지향 프로그램과 상반되는 현상. 
		
		BookDAO dao=new BookDAO();
		ArrayList<BookEntity> list=dao.selectAll(keyword);
		return list;
	}

}
