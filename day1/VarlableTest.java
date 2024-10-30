package day1;

public class VarlableTest {

	public static void main(String[] args) {
		int a = 100;  //1번 선언
		//데이터타입 변수명 = 값; 자바는 값이 데이터타입과 일치해야함
		System.out.println(a); //재사용
		System.out.println(a); //재사용
		System.out.println(100);
		a= a*2; // 다른 연산 값 변경
		System.out.println(a);
		
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10==10;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		System.out.println("b3="+b3);
		
		char c1 = 'a';
		char c2 = '가';
		char c3 = '\n';
		char c4 = '0';
		int i = 000;
		//%c-단일문자표현포맷
		System.out.printf("%c %c %c %d %n",c1,c2,c4,i);
		
		byte by1 = 100; //127보다 크면 오류
		short sh1 = 20000;
		int in1 = 200;
		long lol = 200;
		System.out.printf("%d %d %d %d %n",by1,sh1,in1,lol);
		System.out.println("byte최대값="+ Byte.MAX_VALUE); //JDK 자바라이브러리내부 BYTE 최대값 변수
		System.out.println("byte최소값="+ Byte.MIN_VALUE);
		System.out.println("short최대값="+ Short.MAX_VALUE); 
		System.out.println("short최소값="+ Short.MIN_VALUE);
		System.out.println("int최대값="+ Integer.MAX_VALUE); 
		System.out.println("int최소값="+ Integer.MIN_VALUE);
		System.out.println("long최대값="+ Long.MAX_VALUE); 
		System.out.println("long최소값="+ Long.MIN_VALUE);
		System.out.println(200000);
		
		float f1 = 3.14567F; //실수데이터 float 4byte 간주
		double do1 = 3.14567;
		System.out.println("double최대값="+ Double.MAX_VALUE); 
		System.out.println("double최소값="+ Double.MIN_VALUE);
		
		char ca ='a';
		int ia = /* (int) */ca;
		System.out.println(ca);
		System.out.println((int)ia);//97
		//unicode - 'a' 의 대응숫자 97 'A' 65
		
		int ib =100;
		double db = /* (double) */ib; //100.0
		System.out.println(db);
		
		
		//정수(byte,short,char,int)와 정수(byte,short,char,int) 연산결과 정수(int)
		//정수와 정수 연산결과 "정수" 245/3
		//실수와 정수 연산결과 "실수" (double)245/3
		double avg = (double)245/3;
		System.out.println(avg);
		//명시적형변환
		System.out.println((int)avg);//정수
		
		//boolean 형변환 제외
		//boolean bc =(boolean)0; <<---형변환 안됨
		//int ic = (int)true <<---형변환 안됨
		
		byte by11 = 100;
		byte by12 = 100;
		byte by13 = (byte)(by11 + by12); //200(byte 최대값 127)
		short by14 = (short)(by11 + by12);
		System.out.println(by13);
		System.out.println(by14);
		
		
		
	}

}
