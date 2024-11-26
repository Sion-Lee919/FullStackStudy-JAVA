package test5;
//각 직종 회사원 클래스들 정의
//super 키워드, 상속과 오버라이딩, 객체(자동/명시적)형변환
class Employee{
	int id, s1, s2, sum;
	String name;
	
	Employee(int id,String name,int s1,int s2) {
		this.id=id;
		this.name=name;
		this.s1=s1;
		this.s2=s2;
		
	}
	int ssum() {
		sum=s1 + s2;
		return sum;
	}
	 	/*- 멤버변수=필드변수 선언
	 	   사번 이름 본봉 일반수당 총급여
	 	- 생성자 정의(main 참고)
	 	new Employee(1000,"이사원",10000,5000);
	 	(총급여 제외한) 매개변수 4개의 값을 멤버변수 값으로  초기화.
	 
	 	- 급여 계산메서드():          
	 	   총급여 = 본봉 + 일반수당 */
}
class Manager extends Employee {
	int ms1; //간부수당
	Manager(int id, String name, int s1, int s2,int ms1) {
		super(id, name, s1, s2);
		this.ms1=ms1;
	}
	int ssum() {
		sum=s1+s2+ms1;
		return sum;
		}
	/*- 변수 선언(상속 자동포함 제외 , 추가 변수 선언)
	    사번 이름 본봉 일반수당   간부수당 총급여
- 생성자 정의
	new Manager(2000,"김경영",20000,10000,10000);
	- 급여 계산메서드():          
	 	   총급여 = 본봉 + 일반수당 + 간부수당	*/
}

class Engineer extends Employee{
	int es1, es2; //자격수당 기술수당
	Engineer(int id, String name, int s1, int s2,int es1,int es2){
		super(id, name, s1, s2);
		this.es1=es1;
		this.es2=es2;
	}
	int ssum() {
		sum=s1+s2+es1+es2;
		return sum;
		}
	/*- 변수 선언
사번 이름 본봉 일반수당 자격수당 기술수당 총급여 

- 생성자 정의:main
new Engineer(3000,"박기술",15000,7500,5000,5000);
- 급여 계산메서드()
총급여 = 본봉 + 일반수당+자격수당+기술수당 */
} 
class Secretary extends Employee{
	int ss1;
	Secretary(int id, String name, int s1, int s2,int ss1) {
		super(id, name, s1, s2);
		this.ss1=ss1;
	}
	int ssum() {
		sum=s1+s2+ss1;
		return sum;
		}
	/*- 변수 선언
	   사번 이름 본봉 일반수당 비서수당 총급여 
	- 생성자 정의
	new Secretary(4000,"최비서",15000,7000,10000)
	
	- 급여 계산메서드()
	   총급여 = 본봉 + 일반수당+비서수당 	*/
}


public class SalaryTest {
	public static void main(String[] args) {
		//각 직종 클래스 4개 서로 다른 타입 객체 1개씩 생성- 1개 동일 타입 데이터만 배열 저장
		Employee [] allList = new Employee[4];
		allList[0] = new Employee(1000,"이사원",10000,5000);
		allList[1] = new Manager(2000,"김경영",20000,10000,10000);
		allList[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		allList[3] = new Secretary(4000,"최비서",15000,7000,10000);
			
		System.out.printf("사번 : %d, 이름 : %s, 본봉 : %d, 일반수당 : %d, 총급여 : %d%n",
				allList[0].id,
				allList[0].name,
				allList[0].s1,
				allList[0].s2,
				allList[0].ssum());
		System.out.printf("사번 : %d, 이름 : %s, 본봉 : %d, 일반수당 : %d, 간부수당 : %d, 총급여 : %d%n",
				allList[1].id,
				allList[1].name,
				allList[1].s1,
				allList[1].s2,
				((Manager)allList[1]).ms1,
				allList[1].ssum());
		System.out.printf("사번 : %d, 이름 : %s, 본봉 : %d, 일반수당 : %d, 자격수당 : %d, 기술수당 : %d, 총급여 : %d%n",
				allList[2].id,
				allList[2].name,
				allList[2].s1,
				allList[2].s2,
				((Engineer)allList[2]).es1,
				((Engineer)allList[2]).es2,
				allList[2].ssum());
		System.out.printf("사번 : %d, 이름 : %s, 본봉 : %d, 일반수당 : %d, 비서수당 : %d, 총급여 : %d%n",
				allList[3].id,
				allList[3].name,
				allList[3].s1,
				allList[3].s2,
				((Secretary)allList[3]).ss1,
				allList[3].ssum());

		/* 
		allList 배열 내의 각 객체의(4개) 급여계산메소드 호출하고
	    사번, 이름, 본봉, 총급여 출력
        단, 기술직 사원은 기술수당, 자격수당도 출력 
        
        예)
 사번:이름:본봉:총급여
1000:이사원:10000:xxxxx
2000:김간부:20000:xxxxx
3000:박기술:15000:xxxxx
기술직사원의 경우 : 기술수당:xxxx 자격수당 : xxxx
4000:최비서:15000:xxxxx
        */

	}

}
