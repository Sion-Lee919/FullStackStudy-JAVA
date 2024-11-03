package day2;

public class TimeConversion {

	public static void main(String[] args) {
		int time = 10000; //10000초
		int time2 = time;
		//1시간 60분 1분은 60초 1시간은 3600초
		int hour = time / 3600; //시간  10000-7200=남은값
		time = time % 3600;
		int minute = time /60; //분
		int second = time % 60; //초
		//10000초는 xx시간 xx분 xx초입니다.
		System.out.println(time2 +"초는" + hour + "시간"+ minute + "분"+second+"초입니다.");
	}

}
