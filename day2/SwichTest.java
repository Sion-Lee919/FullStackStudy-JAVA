package day2;

import java.util.Scanner;

public class SwichTest {

	public static void main(String[] args) {
		//1-12월
		//1,3,5,7,8,10,12월 - "31일"
		//4,6,9,11월 - "30일"
		//2월 - "28일"
		//1월 -31일까지 있습니다
		Scanner sc = new Scanner(System.in);
		System.out.println("1-12월 중 1개를 입력하세요");
		int input = sc.nextInt();
		//swich(String) jdk 7이후 추가됨
		switch(input) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(input + "월은 31일까지 있습니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(input + "월은 30일까지 있습니다");
			break;
		case 2:
			System.out.println(input + "월은 28일까지 있습니다");
			break;
		default:
			System.out.println(input + "월은 존재하지 않습니다");
		}
	}

}
