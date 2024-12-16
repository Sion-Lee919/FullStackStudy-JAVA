package day6;

public class ObjectClassTest {

	public static void main(String[] args) {
		Object o1 = new MyObject("MyObject생성");
		Object o2 = new MyObject("MyObject생성");
		
		System.out.println(o1/*.toString()*/);
		System.out.println(o2/*.toString()*/);
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		
		System.out.println(o1.getClass().getName()); // 클래스이름
		
		if(o1==o2) {//stack 주소값 비교. 연산자 오버로딩/오버라이딩 불가능
			System.out.println("o1==o2 true");
		}
		
		//String 클래스 -equals()- Object 메소드 오버라이딩 - 문자열 내용 비교
		//Object -equals() -주소값비교
		/* 1.전달매개변수 타입이 MyObject 객체여야 한다.
		 * o1.equals("MyObject생성")
		 * 2.멤버변수 msg 변수값 같은지 비교한다
		 * 1,2 모두 조건 만족시 -true
		 * 나머지 - false
		 * */
		//if(o1.equals(o2)) //true
		//if(o1.equals(new String("MyObject생성"))) //false
		if(o1.equals(new MyObject("test"))){ //false
			System.out.println("o1.equals(o2) true");
		}
	}

}

class MyObject/*extends Object*/ {
	String msg;
	MyObject(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	@Override/* 1.전달매개변수 타입이 MyObject 객체여야 한다.
	 * o1.equals("MyObject생성")
	 * 2.멤버변수 msg 변수값 같은지 비교한다
	 * 1,2 모두 조건 만족시 -true
	 * 나머지 - false
	 * */
	public boolean equals(Object obj) {
		if(obj instanceof MyObject) {
			String me= this.msg;
			String other = ((MyObject) obj).msg;
			if(me.equals(other)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
