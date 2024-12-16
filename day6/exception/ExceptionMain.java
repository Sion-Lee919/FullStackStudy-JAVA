package exception;

public class ExceptionMain {

	public static void main(String[] args) {
		/* 입력없이 실행 -1번문장 오류 중단
		 * 100입력 - 2번문장 오류 중단
		 * 백 이백 입력 - 1번 문장 오류 중단
		 * 100 0 실행 - 3번문장 오류/ 중단
		 * 100 50 실행 - 오류발생 x 메인 끝까지 수행
		 * */
		try {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		System.out.println(first / second);
		}
		catch(ArithmeticException e) { //하위 하위클래스가 밑에 있으면 중복으로 오류 서순을 하위먼저 작성
			System.out.println("0이 아닌 값으로 입력하세요");
			e.printStackTrace(); // 오류 원인 추적 출력
		}
		finally {
			System.out.println("항살 출력합니다.");
		}
		/*catch(Exception e) {//상위
			System.out.println("모든 종류 예외 동일 처리" + e.toString());
		}*/
		
		/*catch(ArithmeticException e) {
			System.out.println("0이 아닌 값으로 입력하세요");
			e.printStackTrace(); // 오류 원인 추적 출력
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("두개의 값을 입력하세요");
		}
		catch(NumberFormatException e) {
			System.out.println("정수로만 입력하세요");
		}*/
		System.out.println("main 완료");
	}

}
