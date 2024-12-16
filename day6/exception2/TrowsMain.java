package exception2;

//RuntimeExeption 종류들 = unchecked exception = 예외처리 필수 아니다.
class A{
	void ma(int i) {
		System.out.println( 100 / i );
	}
	void mb() {
		ma(0);
	}
	
	void mc() {
		ma(0);	
	}

}

public class TrowsMain {

	public static void main(String[] args) {
		A a1 = new A();
		a1.mb();//1
		a1.mc();
	}

}
