package day5;

final class MyMath{
	//절대값
	int abs(int i){
		if(i<0) {return i*-1;}
		return i;
	}
}
//final 일시 MyMath abs 메소드 사용(객체 생성하여 호출
class MySub /*extends MyMath*/{
	//절대값 오버라이드
	/*	int abs(int i){
			if(i>0) {return i*-1;}
			return i;*/
	int abs(int i){
		MyMath m = new MyMath();
		return m.abs(-1000);
}
}

public class FinalMain {

	public static void main(String[] args) {
		MySub s = new MySub();
		System.out.println(s.abs(-100));

	}

}

