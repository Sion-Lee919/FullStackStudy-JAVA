package test2;

import java.util.Scanner;

public class Ex1_test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("3자리 정수를 입력하세요");
		int a = sc.nextInt();
		String b = a+"";
		System.out.println(b);
		System.out.println(a+"의 백단위는 "+b.charAt(0)+"00 입니다.");
		

	}

}
/* 
1.Ex1.java
// 3자리 정수 주어지면(999 아닌 다른 수일 수도 있다고 가정)
int sample = 999;

//백단위만 출력하기
999  의 백단위는 900 입니다.
 
 */
