package day6;

class StudentWorker implements Worker, Student{
	//상속 포함 String title = "교직원";
	//상속 포함 String title = "학생";
	String title = "조교";
	public void tellTitle() {
		System.out.println(title);
		System.out.println(Worker.title); //interface 객체를 못만들어서 super 못씀
		System.out.println(Student.title);
	}
	//오버라이딩 필수
	public void lunch() {
		System.out.println("조교가 점심을 먹다");
	}
	public void work() {
		System.out.println("조교가 오후에는 일하다");
	}
	public void study() {
		System.out.println("조교가 오전에는 공부하다");
	}
}
public class InterfaceTest {

	public static void main(String[] args) {
		//interface는 객체 만드는 문장들은 쓸수가 없다 
		//Worker w = new Worker();
		//Student s = new Student();
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.tellTitle();
		
		//상위인터페이스명 변수명 = 하위객체; 자동형변환가능
		Worker w = new StudentWorker();
		//변수명.멤버변수 -->Worker 인터페이스
		System.out.println(w.title);
		//변수명.메소드-->Worker 인터페이스
		
		//변수명.overriding-->StudentWorker
		w.study();
		w.lunch();
		w.work();
		w.tellTitle();
	}

}
//급한 일로 못들음