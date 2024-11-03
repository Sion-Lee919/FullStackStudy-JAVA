package test2;

public class Ex3_test2 {

	public static void main(String[] args) {
		for(int i = 2; i < 101; i++) {
			boolean yes = true;
		for(int j =2; j<=Math.sqrt(i);j++) {
			if (i% j==0) {
				yes = false;
				break;
			}
		}
			if(yes) {
			System.out.println(i +":"+"소수다");
			}
			else {
				System.out.println(i +":"+"소수가아니다");
			}
		}

	}

}
/*3. Ex3.java
// 1과 자신으로만 나누어지는 자연수
    //  2 ~ 100 사이 모든 수에 대해서 각 수가 소수인지 판단
		
		  2 : 소수이다
		  3 : 소수이다
		  4 : 소수가 아니다
		  ...
		  100 : 소수가 아니다 
*/
