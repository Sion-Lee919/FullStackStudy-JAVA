package day1;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello 출력합니다 -이클립스");
		System.out.println("두번째 줄을 출력합니다"); //ln 라인임
		System.out.print("Hello 출력합니다 -이클립스\n"); // \n도 줄바꿈
		System.out.print("Hello 출력합니다 -이클립스");//한줄에 나란히
		System.out.print("두번째 줄을 출력합니다");
		System.out.println(100);
		System.out.println(true);
		System.out.println(3.14);
		System.out.println(100 + 3.14 + "여러 줄을 출력합니다");
		System.out.println("100" + "3.14" + "여러 줄을 출력합니다");
		System.out.printf("%d %f %s" ,100, 3.14, "여러 줄을 출력합니다");
		//%d-정수 %f-실수 %s-문자열 각 순대로 적용
	}

}
