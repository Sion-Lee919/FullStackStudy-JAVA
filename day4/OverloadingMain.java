package day4;

//3개 add overloading
class Overload{
	int add(int i, int j){
		return i+j;
	}
	String add(String i,String j){
		return i+j;
	}
	double add(double i, double j){
		return i+j;
	}
}

public class OverloadingMain {

	public static void main(String[] args) {
		Overload o = new Overload();
		System.out.println(o.add(10,20)); //정수 덧셈
		System.out.println(o.add(1.1,2.2));//실수덧셈
		System.out.println(o.add("java","program"));//문자열결합
		System.out.println(o.add(3.14,20));//실수 덧셈
		System.out.println(o.add(20,3.14));//실수 덧셈
		
		int dec= Integer.parseInt("100");//String 10진수 int 변환
		int bin = Integer.parseInt("100",2);//String 2,8,16,32.....int 변환
		System.out.println(dec); //100
		System.out.println(bin); //4
		
		
	}

}
