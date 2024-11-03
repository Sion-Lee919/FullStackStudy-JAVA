package test2;

import java.util.Scanner;

public class Ex2_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책이랑 학생을 숫자로 순서대로 입력하세요");
		int book = sc.nextInt();
		int person = sc.nextInt();
		if(book>=person) {
			int a= book/person;
			int b= book%person;
			System.out.println("1명의 학생당 : "+a+"권씩 가질 수 있습니다");
			System.out.println("남아있는 책은 : "+b+"권입니다.");
		}
		else {
			System.out.println("책이 학생보다 많아서 나누어줄 수 없습니다.");
		}
	}

}
/*2. Ex2.java
책 : 97권이라 가정하고
학생 : 12명이라 가정했을 때

책권수가 학생수보다 많다면
모든 학생들에게 공평한 권수의 책 분배하여 출력합니다.

---------------------------------------
1명의 학생당 : xx권씩 가질 수 있습니다.
남아있는 책은 xx권입니다.
---------------------------------------

책권수가 학생수보다 많지 않다면 아래와 같이 출력합니다.
---------------------------------------
나눠줄 수 없습니다.
---------------------------------------*/