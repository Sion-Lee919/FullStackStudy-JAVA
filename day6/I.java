package day6;

import exception2.A;

interface I {
	void ma();
	//인터페이스 구현 하위클래스들 다수개 사용중 상황에서 mb 추가-구현상태 제공
	// jdk 8 이후 (jdk 17)
	default void mb() {//default 쓰면 오버라이딩 해도되고 안해도됨
		System.out.println("추가되어도 기존 설계 변경 없음-선택적 오버라이딩");
	}
	//인터페이스 구현 하위클래스들 다수개 사용중 상황에서 mc 추가-구현상태 제공-모든 하위클래스들 공통
	// jdk 8 이후 (jdk 17)
	static void mc() {
		System.out.println("추가되어도 기존 설계 변경 없음- 구현 상태(하위클래스 동일) -오버라이딩불가");
	}
}

class A implements I{
	public void ma() {
		System.out.println("A클래스 ma 메소드 오버라이딩");
	}
	//MB() 오버라이드 가능. MC 오버라이드 불가능
}
class InterfaceTest2 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.ma();
		a1.mb();
		I.mc();

	}
}
