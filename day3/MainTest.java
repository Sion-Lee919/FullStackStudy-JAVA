package day3;

public class MainTest {

	public static void main(String[] args) {
		// 프로그램 실행시점 1번만 입력
		System.out.println("명령행 매개변수 개수=" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		//100 200 전달시 100+200 = 300
		System.out.println(args[0]+args[1]);
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first+second);
		
		//string -> 실수변환
		double testnum = Double.parseDouble("3.12");
	}

}
