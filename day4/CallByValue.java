package day4;
//public 클래스는 한 파일에 하나만 가능함
class Data{
	int a=10;
}

class Target{
	void add(int i ) { //기본형변수의 정의
		System.out.println("add 메소드내부 출력 =" + i++);
	}
	void addData(Data d) {//참조형변수 정의
		System.out.println("addData 메소드 내부 출력 = " +d.a++);
	}
}

public class CallByValue {

	public static void main(String[] args) {
		Target t = new Target();
		System.out.println("====기본형변수====");
		int j=10;
		t.add(j);
		System.out.println("main 메소드내부 출력 ="+j);
		System.out.println("====참조형변수====");
		Data d_main = new Data();
		t.addData(d_main);
		System.out.println("main 메소드내부 출력 ="+d_main.a);
	}

}
