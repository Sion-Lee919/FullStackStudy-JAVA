package day4;

import java.util.Arrays;

class B {
	//[m] 리턴타입 이름 ([매개변수]){} 매개변수 : 테이터타입 변수명
	void m0() {
		m1();//자기자신 클래스에 있기때문에 그냥 m1()써도 호출됨
	}
	void m1() { //리턴 값이 없다 = void
		System.out.println("B클래스의 m1호출");
	}
	int m2() {
		return 10*10; // 마지막 문장 reuturn 변수나 데이터; 문장
		
	}
	String m3() {
		return "method test";
	}
	double[] m4(){
		return new double[] {1.0, 2.2, 3.3};
	}
	MultiEmployee m5(){
		return new MultiEmployee(); //staticMain 에있는 클래스명
	}
	void m6() {
		System.out.println("m6메소드시작");
		if(true) {
			System.out.println("m6메소드중단");
			return; //메소드중단. 복귀
		}
		System.out.println("m6메소드종료");  //return있어서 실행안됨 
	}
}

public class ReturnTypeMain {

	public static void main(String[] args) {
		B b1 = new B(); // 메모리 heap영역 m1() 메소드 할당
		b1.m1();
		
		b1.m2();
		
		int result = b1.m2();
		System.out.println(result);
		
		String result3 = b1.m3();
		System.out.println(b1.m3());
		System.out.println(result3);
		
		System.out.println(Arrays.toString(b1.m4()));//배열 Arrays.toString(배열명)
		System.out.println(b1.m5().companyName);//staticMain에있는 클래스객체
		
		b1.m6();
	}

}
