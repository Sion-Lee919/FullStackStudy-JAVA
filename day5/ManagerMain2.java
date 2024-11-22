package day5;

class Employee2{ //부모 Employee
	/*private*/ int id; //private 쓰면 자식도 쓸수없다.
	String name;
	double salary;
	String sameVar = "Employee";
	void printInform() {
		System.out.println("사번= " + id + ", 이름= " + name);
	}
}

class Manager2 extends Employee2 {//부모에게 상속받음 extends 자식Manager
	String sameVar = "Manager"; //sameVar 변수중복시 자기자신이 우선순위고 상속받은 순위가 낮다
	String jobOfManage;
	String title;
	void test() {
		String sameVar = "test의 지역변수"; //super 테스트 1
		System.out.println(sameVar);
		System.out.println(this.sameVar);
		System.out.println(super.sameVar);
	}
	@Override //'@' 컴파일러나 자바 실행 명령 부탁/요청 규칙에 어긋난 ex)매개변수(int i) 오류로 잡아줌
	void printInform() {//재정의 오버라이드 
		super.printInform(); //super 테스트 2
		System.out.println("업무내용= " + jobOfManage + ", 직급= " + title);
	}
}

public class ManagerMain2 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.id=100;
		e1.name="이사원";
		e1.salary=10000;
		
		Manager2 m1 = new Manager2();
		m1.id= 1000;
		m1.name="홍길동";
		m1.salary = 20000;
		m1.jobOfManage = "관리업무";
		m1.title="it관리자";
		System.out.printf("관리자이름= %s, 사번 = %d, 업무내용 = %s%n", m1.name, m1.id,m1.jobOfManage);
		
		System.out.println(m1.sameVar);//부모에게 상속받아도 자기자신이 우선순위
		
		m1.printInform();//하위클래스가 상속받은 메소드 변경시 자식메소드 출력
		
		
		m1.test();
		
	}

}
