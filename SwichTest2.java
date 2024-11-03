package day2;

import java.util.Scanner;

public class SwichTest2 {

	public static void main(String[] args) {
		//1-12월
		//1,3,5,7,8,10,12월 - "31일"
		//4,6,9,11월 - "30일"
		//2월 - "28일"
		//1월 -31일까지 있습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("1-12월 중 1개를 입력하세요(예 : 1월)");
		String input = sc.next();
		//swich(input(String타입)) jdk 7이후 추가됨
		switch(input) {
		case "1월":
		case "3월":
		case "5월":
		case "7월":
		case "8월":
		case "10월":
		case "12월":
			System.out.println(input + "은 31일까지 있습니다");
			break;
		case "4월":
		case "6월":
		case "9월":
		case "11월":
			System.out.println(input + "은 30일까지 있습니다");
			break;
		case "2월":
			System.out.println(input + "은 28일까지 있습니다");
			break;
		default:
			System.out.println(input + "은 존재하지 않습니다");
		}
	}

}
