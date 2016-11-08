package exam_02_BookSearch_DI;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//입력받은 keyword를 이용해서 책의 제목과 저자를 출력
		//만약 comment가 존재하면 같이 출력
		/*
		System.out.print("keyword 입력: ");
		Scanner s=new Scanner(System.in);
		String keyword=s.nextLine(); //nextLine하면 공백포함해서 한 라인을 표준입력으로부터 다 받음
		*/
		//config 파일에 대한 경로를 문자열로 저장 
		String config="classpath:applicationCtx.xml";
		
		AbstractApplicationContext ctx=new GenericXmlApplicationContext(config);
		
		BookService service=ctx.getBean("bookService", BookService.class); //IoC container에 의해 객체 직접 생성안해도 객체 가져와서 쓸 수 O
		//bookService: 빈에 대한 id에 해당 
		
		ArrayList<BookEntity> list=service.getListByKeyword();
		
		for(BookEntity entity:list){
			System.out.println(entity.getBtitle()+ " : "+ entity.getBauthor());
		}
		
		ctx.close();
		//s.close();

	}

}
