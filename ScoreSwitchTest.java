package day2;

public class ScoreSwitchTest {

	public static void main(String[] args) {
		//국어 영어 수학점수 데이터 3개 필요(1-100) -자바 난수 발생 - Math.random()
		/* 0.0 <= Math.random() < 1.0
		 * 0.0 <= Math.random()*100 < 100.0
		 * 0 <= (int)(Math.random()*100) <=99
		 * 1 <= (int)(Math.random()*100) +1 <=100
		 */
		int kor = (int)(Math.random()*100) +1;
		int eng = (int)(Math.random()*100) +1;
		int mat = (int)(Math.random()*100) +1;
		int sum = kor + eng + mat;
		int avg = sum / 3;
		String grade;
		switch(avg/10) {
		case 10:
		case 9:
		case 8:
			grade = "A등급";
			break;
		case 7:
		case 6:
			grade = "B등급";
			break;
		case 5:
		case 4:
			grade = "C등급";
			break;
		default :
			grade = "D등급";
		}
		/*
		if(avg >=80 ) {
			grade = "A등급";
		}
		else if(avg >=60) {
			grade = "B등급";
		}
		else if(avg >=40) {
			grade = "c등급";
		}
		else {
			grade = "D등급";
		}
		*/
		System.out.printf("국어점수=%d, 영어점수=%d, 수학점수=%d, 총점=%d, 평균=%d, 등급=%s%n",kor, eng, mat, sum, avg, grade);
	}

}
