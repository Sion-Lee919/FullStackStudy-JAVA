package test;

public class Ex1 {

	public static void main(String[] args) {
		String name = "이자바";
		int java =100;
		int db=77;
		int spring =89;
		int sum=java + db + spring;
		double avg = (double)sum / 3 ;
		System.out.println(name);
		System.out.println(java);
		System.out.println(db);
		System.out.println(spring);
		System.out.println(sum);
		System.out.println(avg);
	}

}
/* 1. Ex1.java 문제
 * ()에 맞는 데이터 타입과 적절한 표현 쓰기
 * 
 * () name = "이자바";
 * () java = 100; 
 * () db = 77; () 
 * spring = 89; 
 * () sum = (java와db, spring 합계); 
 * () avg = (java와 db, spring 실수평균);
 */
