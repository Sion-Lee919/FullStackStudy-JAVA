package test2;

import java.util.Scanner;

public class Ex5_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
/*
 * 5.  라인수를 입력받아서 해당 라인수만큼 아래 형태의 직각삼각형 * 출력하기
예 : 5
*
**
***
****
******
*/
