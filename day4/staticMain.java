package day4;

//멀티캠퍼스 회사 소속
class MultiEmployee{
	final static String companyName="멀티캠퍼스"; //회사명. static 정적(객체 생성이전 값 미리 지정). 동일하다.
	String name;//회사원이름 //동적(객체 다르다, 객체 생성 이후에 ㄱ
}

public class staticMain {

	public static void main(String[] args) {
		System.out.println("모든 회사원의 회사명" + MultiEmployee.companyName); //static으로 선언했기 때문에 객체생성전이전 사용 가능 class 에 저장되어있음
		//System.out.println("모든 회사원의 회사명" + MultiEmployee.name); // non-static변수 . 객체생성이전 사용 불가
		MultiEmployee e1= new MultiEmployee(); //객체생성
		e1.name = "이자바";
		//e1.companyName = "멀티캠퍼스2"; // 바꾸면 멀티캠퍼스 2로 완전히 바뀜 final붙이면 못바꿈
		System.out.println("회사원"+ e1.name + "님은" + e1.companyName + "에 재직중입니다.");
		MultiEmployee e2= new MultiEmployee();
		e2.name = "박한국";
		//e2.companyName = "멀티캠퍼스3";
		System.out.println("회사원"+ e2.name + "님은" + e2.companyName + "에 재직중입니다.");
	}

}
