package day4;

public class Employee1 {
	//Employee1(){super();}//생성자 자동정의
	
	//생성자 4개 오버로딩
	Employee1(){
		this(-1,"미정",0);
		//id = -1;
		//name ="미정";
		//salary = 0;
	}
	Employee1(int i) {
		this(i,"미정",0);
		//id=i;
		//name ="미정";
		//salary = 0;
	}
	Employee1(int i, String n) {
		//id=i;
		//name =n;
		//salary = 0;
		this(i, n, 0);
	}
	Employee1(int id, String name, double salary){
		System.out.println("생성자호출");
		this.id = id;
		this.name=name;
		this.salary = salary;
	}
	
	//맴버변수
	int id ;
	String name;
	String dept;
	String title;
	double salary;
	
	//메소드
	/*public void work() {
		System.out.println("사번 : id" + id + ", 이름:" + name + "이 일한다");
	}*/
	//부서 이동 메소드
	void setDept(String new_dept) {
		dept = new_dept;
	}
	//직급 변경 메소드
	void setTitle(String new_title) {
		title = new_title;
		if(new_title.equals("과장")) {
			salary = salary + 10000;
		}
		else if (new_title.equals("부장")) {
			salary = salary + 20000;
		}
		else {
			salary= salary*1.1;
		}
	}
	
	void localTest() {
		String name = "지역변수";
		System.out.println(name);
		System.out.println(this.name);
	}
}
