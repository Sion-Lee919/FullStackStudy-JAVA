package day4;

public class EmployeeMain1 {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(100, "김대리", 5555);
		//e1.id=100;
		//e1.name="김대리";
		//e1.salary = 5555;
		e1.setDept("it개발부서");
		e1.setTitle("부장");
		System.out.printf("사번=%d, 이름=%s, 부서명=%s, 직급=%s, 급여=%.2f%n",e1.id, e1.name, e1.dept,e1.title,e1.salary);
		
		
		Employee1 e2 = new Employee1();
		e2.setDept("인재개발부서");
		e2.setTitle("부장");
		System.out.printf("사번=%d, 이름=%s, 부서명=%s, 직급=%s, 급여=%.2f%n",e2.id, e2.name, e2.dept,e2.title,e2.salary);

		Employee1 e3 = new Employee1(300);
		e3.setDept("인재개발부서");
		e3.setTitle("부장");
		System.out.printf("사번=%d, 이름=%s, 부서명=%s, 직급=%s, 급여=%.2f%n",e3.id, e3.name, e3.dept,e3.title,e3.salary);

		Employee1 e4 = new Employee1(400,"이사원");
		e4.setDept("인재개발부서");
		e4.setTitle("부장");
		System.out.printf("사번=%d, 이름=%s, 부서명=%s, 직급=%s, 급여=%.2f%n",e4.id, e4.name, e4.dept,e4.title,e4.salary);

		e1.localTest();
	}

}
