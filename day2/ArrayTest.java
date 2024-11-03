package day2;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		String [] names = {"홍길동", "박한국", "김대한", "최강산", "김우리", "이자바"};
		int scores[] = new int[6]; //선언+생성. 아직 초기화 이전
						
		//자바 배열 초기화 이전 자동 저장값
		//int 타입 정수 0
		//double 타입 실수 0.0
		//boolean 타입 false
		//char 타입 `\u0000` - unicode 16진수 0000해당 문자(공백)
		//String 타입 null
		for(int i=0; i<scores.length; i++) {
			scores[i] = (int)(Math.random() *100) +1;
			System.out.println(names[i] + ":"+scores[i]);
		}
		//scores 배열내에서 최대값 찾아서 출력
		//ex) 1등 : 박한국 학생 점수 95점
		//{100,99,94,13,14,54}
		
		int max =0, maxIndex =0;
		for (int i=0; i<scores.length; i++) {
			if(max < scores[i]) {
				max=scores[i];
				maxIndex = i;
			}
		}
		
		System.out.println("1등 : "+ names[maxIndex]+"학생점수"+max+"점");
		System.out.println("==============================");
		
		for(String oneName : names) {
			System.out.println(oneName);
		}
		System.out.println("==============================");
		
		System.out.println(Arrays.toString(names));
		
		
		/*int max =0;
		String name1 = null;
		for (int i=0; i<scores.length; i++) {
			if(scores[0]<scores[i+1]) {
				name1 = names[0];
			names[0] = names[i+1];
			names[i+1] = name1;
			max=scores[0];
			scores[0]=scores[i+1];
			scores[i+1]=max;
		}
		}
		for(int i=0; i<scores.length; i++) {
			System.out.println(names[i] + ":"+scores[i]);
		}*/
		
	}
}

