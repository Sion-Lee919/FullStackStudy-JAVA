package day3;

public class Employee_main {

	public static void main(String[] args) {
		//클래스명 변수명 = new(객체생성연산자) 클래스명
		Employee e1 = new Employee(); //객체 생성 문장
		e1.name ="김사원";
		e1.id = 100;
		e1.dept = "it개발부";
		e1.title = "사원";
		e1.salary = 10000.0;
		System.out.printf("사원(1) 사번=%d 이름=%s 직급=%s 부서=%s 급여=%.2f%n",e1.id,e1.name,e1.title,e1.dept,e1.salary);
	
		Employee e2 = new Employee(); //객체 생성 문장
		e2.name ="박대리";
		e2.id = 200;
		e2.dept = "인사부";
		e2.title = "대리";
		e2.salary = 12000.0;
		System.out.printf("사원(2) 사번=%d 이름=%s 직급=%s 부서=%s 급여=%.2f%n",e2.id,e2.name,e2.title,e2.dept,e2.salary);

		e1.work();
		e2.work();
	}
}