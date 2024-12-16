package day6;

interface Anony1{
	void test1();
}

interface Anony2{
	void test2();
}

class TwoInterfaceInner{
	//익명 내부 클래스 = anonymous inner class
	Anony1 an1 = new Anony1(){public void test1(){
		System.out.println("Anony1의 test1 overriding");
	}};
	Anony2 an2 = new Anony2(){public void test2(){
		System.out.println("Anony2의 test2 overriding");
	}};
	
	//멤버변수 생성자 메소드 추가
}

public class InnerClassTest {

	public static void main(String[] args) {
		TwoInterfaceInner inner = new TwoInterfaceInner();
		inner.an1.test1();
		inner.an2.test2();

	}

}
