package day3;

import java.util.Arrays;

public class StringClassTest {

	public static void main(String[]args) {
		String str1 ="Java";
		String str2 ="java";
		String str3 =new String("java");
		String str4 =new String("jAva");
		
		//내용을 비교하는게 아니라 주소를 비교하는것임 new는 새로운 주소를 만드는것
		System.out.println(str1 == str2); //t
		System.out.println(str2 == str3); //f
		System.out.println(str3 == str4); //f
		
		//equals 문자열 내용을 비교하는것
		System.out.println(str1.equals(str2)); //t
		System.out.println(str2.equals(str3)); //t
		System.out.println(str3.equals(str4)); //t
		//대소문자 무시하고 비교
		System.out.println(str1.equalsIgnoreCase(str2));//t
		System.out.println(str2.equalsIgnoreCase(str3));//t
		System.out.println(str3.equalsIgnoreCase(str4));//t
		
		System.out.println("100"+"200");
		System.out.println("100"+200+3.14);
		System.out.println(200+3.14+"100");
		
		//string 메소드
		System.out.println("javaprogram".length());
		System.out.println("javaprogram".charAt(0));
		System.out.println("javaprogram".substring(0,5));//(0번인덱스부터 5번 전까지)
		System.out.println("javaprogram".replace("a","-"));// a가 나올때마다 -로 바꾸기
		System.out.println("javaprogram".toUpperCase());//대문자로
		System.out.println("javaprogram".toLowerCase());//소문자로
		System.out.println("100".concat("200"));// +같은 결과
		
		String str5="서울시 강남구 역삼동 멸티캠퍼스 13층";
		//String 1rofmf String 배열 분리
		String address[]= str5.split(" ");
		for(String one : address) { //foreach반복문(배열+컬렉션프레임워크 전용)	
			System.out.println(one);
		}
		String str_array[] = {"aaa","bbb","ccc"};
		System.out.println(String.join(":",str_array));
		
		/*String str6 = "javaprogram";
		char c[] = new char[str6.length()];
		for(int i = 0; i < c.length; i++) {
			c[i] = str6.charAt(i);
		} 더 간단하게 하기 */
		String str6 = "javaprogram";
		char c[] = str6.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		
		
		System.out.println("java".indexOf('j'));//문자열 j의 위치 
		
	}
}
