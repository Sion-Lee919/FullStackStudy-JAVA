package day5;

class Parent{
	int su=10;
	void pr() {
		System.out.println(su);
	}
	void parentMethod() {
		System.out.println("parent메소드");
	}
}

class Child1 extends Parent{
	int su=20;
	void pr() {//오버라이딩
		System.out.println(su);
	}
	void Child1Method() {
		System.out.println("Child1메소드");
	}
}

public class CastingMain {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.pr();
		p1.parentMethod();
		//p1.Child1Method(); 안됨 오류
		
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		c1.pr();
		c1.parentMethod();
		c1.Child1Method();
		
		Parent p2 = new Child1(); //자동형변환(캐스팅)
		System.out.println(p2.su);
		p2.pr(); //형변환 하면 오직 오버라이딩한 메소드 접근할 수있다 그래서 10이아니라 20
		p2.parentMethod();
		//p2.Child1Method(); 안됨 오류
		
		//Child1 c2 = (Child1)p2; //명시적 형변환
		//c2.Child1Method(); //가능
		
		((Child1)p2).Child1Method(); //바로 명시적 형변환
	}

}
