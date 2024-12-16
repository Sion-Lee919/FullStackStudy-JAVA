package exception;

class A{
	void ma(int i) throws ArithmeticException{//예외처리 다른 메소드로 떠넘기기. 예외처리권한 포기
		System.out.println( 100 / i );
	}
	void mb() {
		try{ma(0);}
		catch(ArithmeticException e) {
			ma(100); //재호출
		}
	}
	
	void mc() {
		try{ma(0);}
		catch(ArithmeticException e) {
			System.out.println("0을 전달 할 수 없습니다");
		}
	}

}

public class TrowsMain {

	public static void main(String[] args) {
		A a1 = new A();
		a1.mb();//1
		a1.mc();
	}

}
