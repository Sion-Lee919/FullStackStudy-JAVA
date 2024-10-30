package day1;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws java.io.IOException {
		//표준출력장치(모니터) - System.out
		//표준입력장치(키보드) - System.in.read
		while(true) {
		int i = System.in.read(); // 문자입력 unicode 리턴 정수로나옴 //한글문자 출력되지 않는다, 자바 데이터타입 인식되지 않는다 -연산x
		if(i == 13) {break;}
		System.out.println(i+":"+(char)i);
		}
	}

}
