package test4;

public class TraineeTest {

	public static void main(String[] args) {
		// 1. 명령행 매개변수 입력 - 3개
		// 예 : 이자바 JSP프로그래밍 1000000 
		//2-1. Trainee 객체 생성- 생성자 정의x
		//3-1. 이름변수 = 첫번째입력값 , 과정명변수=두번째입력값, 교육비변수=세번째입력값
		//2-2. Trainee 객체 생성- 생성자 정의o
		//3-2. 이름, 과정명, 교육비로 전달 초기화

		Trainee t = new Trainee(args[0], args[1],  Integer.parseInt(args[2]));//기본생성자
		//t.name = args[0];
		//t.title = args[1]/*.toUpperCase()*/;
		//t.fee = Integer.parseInt(args[2]);
		
		
		//4. 환급금 계산 메소드 호출
		t.calcReturnFee();
		//5. 이름 수강기관 과정명 교육비 부가금 환급금 순서 출력하되 
		// 환급금이 0 이면 "잘못된 과정명입니다." 출력
		if(t.returnFee == 0) {
			System.out.println("잘못된 과정명입니다.");
		}
		else {
		System.out.printf("이름=%s 수강기관=%s 과정명=%s 교육비=%d 부가금=%d 환급금=%d%n",
				t.name , Trainee.center, t.title, t.fee, t.addFee, t.returnFee );
		}
	}

}


/*<과제1>
class Trainee{
	/*<변수>
	이름, 수강기관, 과정명, 교육비, 부가금, 환급금을 나타내는 변수를 정의합니다.
         조건1 : 부가금 변수 -   50000 으로 수정불가 변수 선언
        조건2 : 수강기관 변수 - 모든 교육생은 "이즈웰 풀스택 과정"으로 동일. 공유 변수 선언	
        <생성자>
	생성자 없을 수도 있다
      생성자 정의(...)
	<메소드>
	환급금 계산 기능 (리턴타입 , 매개변수 자유롭다)
	과정명이 "JSP프로그래밍"이면 입력한 교육비의 25% + 부가금
	과정명이 "자바프로그래밍"이면 입력한 교육비의 20% + 부가금
	과정명이 "DATABASE프로그래밍"이면 입력한 교육비의 15% + 부가금
	그외 과정명은 환급금 0 
	
	
}

public class TraineeTest {

	public static void main(String[] args) {
		// 1. 명령행 매개변수 입력 - 3개
		// 예 : 이자바 JSP프로그래밍 1000000 
		//2-1. Trainee 객체 생성- 생성자 정의x
		//3-1. 이름변수 = 첫번째입력값 , 과정명변수=두번째입력값, 교육비변수=세번째입력값
		//2-2. Trainee 객체 생성- 생성자 정의o
		//3-2. 이름, 과정명, 교육비로 전달 초기화

		//4. 환급금 계산 메소드 호출
		//5. 이름 수강기관 과정명 교육비 부가금 환급금 순서 출력하되 
		// 환급금이 0 이면 "잘못된 과정명입니다." 출력
		
	}

}*/