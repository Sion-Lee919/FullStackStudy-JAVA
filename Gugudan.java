package day2;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 *2*1=2 3*1=3 4*1=4 .... 9*1=9 
		 *2*2=4 ......
		 *...
		 *2*9=18  ...............9*9=81
		 * */
		//for 앞에 a: 넣고 break a; 하면 a쪽을 종료함
		for (int i = 1; i <=9 ; i++) {
			for(int dan =2; dan <= 9; dan++) {
				if(dan==7) {continue;} //continue 7단 일때만 중단해 //break 7단일때 중지해
				System.out.print(dan +"*"+i+"="+(dan*i)+"\t");
		}
			System.out.println();
	}
	}

}
