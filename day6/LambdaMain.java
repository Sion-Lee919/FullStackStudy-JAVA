package day6;


@FunctionalInterface //함수형 인터페이스임을 보장
interface Calculable{
	int calc(int a, int b);
}

@FunctionalInterface
interface MyFunction{
	String func(String s);
}

public class LambdaMain {

	public static void main(String[] args) {
		Calculable c = null;
		//메소드형태 유추. 리턴타입, 매개변수타입 명시되어있지 않아도 유추 가능
		c = (a, b)-> {System.out.println(a+b); return a+b;}; //람다식 작성
		int result1 = c.calc(10, 20);
		System.out.println(result1);
		/*c = new Calculable() {
            public int calc(int a, int b) {
                System.out.println(a + b);
                return a + b;
            }
           };
            int result1 = c.calc(10, 20);
        System.out.println(result1);
        */
		//매개변수 1개 () 생략, return 키워드 {}생략
		
		MyFunction f = s-> s.toUpperCase();
		String result2 = f.func("JAVa programming");
		System.out.println(result2);
		/* MyFunction f = new MyFunction() {
            public String func(String s) {
                return s.toUpperCase();
            }
        };
         String result2 = f.func("JAVa programming");
        System.out.println(result2);
        */
			
	}
}
