package day2;

public class ReturnTest {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		test(1);
		System.out.println("메인 종료");

	}

	public static void test(int condition) {
		System.out.println("test메소드 시작");
		if(condition==1) {
			return;
		}
		System.out.println("test메소드 종료");
	}
}
