package test;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요 아무텍스트를 입력하세요");
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("첫번째 값 : 0부터 100까지의 숫자중 입력하세요");
		int java = sc.nextInt();
		sc.nextLine();
		if(java<=100 && java >=0 ) {
			System.out.println("첫번째 값" +":"+ java);
		}
		else {
			System.out.println("0~100까지의 숫자가 아닙니다. 다시 실행하세요.");
			return;
		}
		System.out.println("두번째 값 : 0부터 100까지의 숫자중 입력하세요");
		int db = sc.nextInt();
		sc.nextLine();
		if(db<=100 && db >=0 ) {
			System.out.println("두번째 값" +":"+ db);
		}
		else {
			System.out.println("0~100까지의 숫자가 아닙니다. 다시 실행하세요.");
			return;
		}
		System.out.println("세번째 값 : 0부터 100까지의 숫자중 입력하세요");
		int spring = sc.nextInt();
		sc.nextLine();
		if(spring<=100 && spring >=0 ) {
			System.out.println("세번째값" +":"+ spring);
		}
		else {
			System.out.println("0~100까지의 숫자가 아닙니다. 다시 실행하세요.");
			return;
		}
		int sum = java+db+spring;
		double avg = (double)sum /3;
		System.out.println("첫번째 값"+"+두번째 값"+"+세번째 값"+"="+sum);
		System.out.println("합의 실수평균" +"="+ avg);
	}

}
/*
2. Ex2.java 문제
Ex1.java 를 수정하여 키보드로부터 입력받은 값들을 이용하는 코드 만들기

		() name = 키보드입력문자열(공백없이 - next() );
		() java = 키보드입력정수(0-100); 조건체크
		() db = 키보드입력정수(0-100);
		() spring =키보드입력정수(0-100);
		() sum = (java와 db, spring 합계);
		() avg = (java와 db, spring 실수평균);
*/