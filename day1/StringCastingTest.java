package day1;

public class StringCastingTest {

	public static void main(String[] args) {
		String s1 = "100";
		String s2 = "890.77";
		String s3 = "true";
		String s4 = "abcd";
		
		int is1 = Integer.parseInt(s1);
		System.out.println(s1+s1); //100100(문자열결합)
		System.out.println(is1+is1); //200(정수)
		
		double ds2 = Double.parseDouble(s2);
		System.out.println(s2+s2); //(문자열결합)
		System.out.println(ds2+ds2); //(실수)
		
		boolean bs3 = Boolean.parseBoolean(s3);
		System.out.println(s3+s3); //(문자열결합)
		System.out.println(bs3 && bs3); //(논리값)
		
		//String을 char로 변경
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(1));
		System.out.println(s4.charAt(2));
		System.out.println(s4.charAt(3));
	}

}
