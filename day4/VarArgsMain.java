package day4;

class VarArgs{
	int add(int ...a) { //비정형 매개변수
		System.out.println("전달매개변수의 개수=" +a.length);
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum+= a[i];
		}
		return sum;
	}
}
public class VarArgsMain {

	public static void main(String[] args) {
		VarArgs v = new VarArgs();
		System.out.println("합계=" + v.add(1,2,3,4,5,6,7,8,9));
		System.out.println("합계=" + v.add(1,2,3,4,5));
		System.out.println("합계=" + v.add(1,2,3));
	}

}
