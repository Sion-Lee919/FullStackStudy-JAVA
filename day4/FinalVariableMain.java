package day4;

class Circle{
	int radius;
	final double pi = 3.14; // final 수정 금지
	void area() {
		//원의 면적 구하기 메소드
		//반지름 * 반지름 * 원주율(3.14)
		System.out.println(radius * radius * pi);
		//pi = pi +1; final 써서 쓸수가 없음 오류로 나옴
	}
}


public class FinalVariableMain {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 5;
		c1.area();
		System.out.println(c1);
		System.out.println("정수 int의 최대값="+ Integer.MAX_VALUE);
		
	}

}
