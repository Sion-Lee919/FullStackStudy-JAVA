package day1;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//자바스크립트 ecma6 - 클래스구조.객체생성 "new"
		//Scanner - 키보드 정수, 문자열(한글), 논리값 데이터타입으로 입력 연산
		System.out.println("정수 2개를 입력하면 덧셈 결과를 축력합니다.");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.println(first+second);
		
		System.out.println("계속 하려면 true를 입력하세요.");
		boolean b = sc.nextBoolean();
		//sc.nextLine();//엔터친거 읽어오기 
		if(b==true) {
			//한글데이터
			//String word = sc.next();//1개단어(한글포함)
			String line = sc.nextLine();//1줄 입력한 문장 전체를 읽어옵니다
			System.out.println(line);
		}
	}

}
