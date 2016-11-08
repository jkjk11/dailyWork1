package dailyWork1;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//입력받은 keyword를 이용해서 책의 제목과 저자를 출력
		//만약 comment가 존재하면 같이 출력
		
		System.out.print("keyword 입력: ");
		Scanner s=new Scanner(System.in);
		String keyword=s.nextLine(); //nextLine하면 공백포함해서 한 라인을 표준입력으로부터 다 받음
	
		//config 파일에 대한 경로를 문자열로 저장 
		String config="classpath:applicationCtx.xml";		
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config);
		
		BookService service=ctx.getBean("bookService", BookService.class); //IoC container에 의해 객체 직접 생성안해도 객체 가져와서 쓸 수 O
		//bookService: 빈에 대한 id에 해당 
		
		ArrayList<BookEntity> list=service.getListByKeyword(keyword);
		
		for(BookEntity entity:list){
			System.out.println(entity.getBtitle()+ " : "+ entity.getBauthor());
			
			ArrayList<ReviewEntity> list2=service.getRListByBisbn(entity.getBisbn());
			for(ReviewEntity entity2:list2){
				if(list2.size()!=0){
					System.out.println("===>" + entity2.getRcontent());
				}else{
					System.out.println("등록된 서평이 없습니다.");
				}
			}
		}
		
		ctx.close();
		s.close();
	}
}
