package hahaha;

public class Main {

	public static void main(String[] args) {
		
		//IS-A 관계 (Is-a relationship)
		//정의: subclass is a superclass(O) (역관계는 성립하지 않음. superClass is a subclass(X) )	
		//subclass의 type을 써야 하는 곳에 superclass의 type을  쓸 수 있음 
		
		Student a=new Student();
		Person b=new Student(); //객체를 다양한 타입의 형태로 쓸 수 있음 
		Object c=new Student(); //객체의 가장 큰 개념: object 
		
		
	}

}
