package day5;

class A{
	/*A(){
		i=100;
		System.out.println("A생성자 호출");
	}*/
	A(int i){
		this.i=i;
	}
	int i;
	void ma() {System.out.println(i);}
}

class B extends A{
	B(){
		super(100); //super 테스트4
		j=200;
		System.out.println("B생성자 호출");
	}
	int j;
	void mb() {System.out.println(i+j);}
}

public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.ma();
		b1.mb();

	}

}
