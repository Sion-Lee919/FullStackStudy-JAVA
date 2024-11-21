package day3;

public class TwoDimArray {

	public static void main(String[] args) {
		/*int ar1 []=new int[3];
		int ar2 []=new int[3];*/
		int two_ar3[][]=new int [2][3];
		//System.out.println(two_ar3.length); //이차배열
		//System.out.println(two_ar3[0].length);//이차배열 포함 첫번째 1차배열
		//System.out.println(two_ar3[0][0]);//첫번째 1차배열의 첫번쨰 요소
		int num=1;
		for(int i=0; i<two_ar3.length; i++) {
			for (int j = 0; j < two_ar3[i].length; j++) {
				two_ar3[i][j] =num++;
				System.out.print(two_ar3[i][j] + "\t");
			}
			System.out.println();
		}
	}
	//이차배열 선언+생성 +초기화
	int two_ar4[][] = {{1,2,3},{4,5,6}};

}
