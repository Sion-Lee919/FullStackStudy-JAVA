package day2;

public class LogicalOperation {

	public static void main(String[] args) {
		String str = null;
		if(str == null | str.length()==0) { //|,& 둘다 연산하기 때문에 오류
			System.out.println("참조 문자열은 없습니다.");
		}

	}

}
