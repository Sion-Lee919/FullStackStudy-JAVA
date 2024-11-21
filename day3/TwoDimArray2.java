package day3;

public class TwoDimArray2 {

	public static void main(String[] args) {

		int two_ar3[][]=new int [4][];
		for (int i = 0; i < two_ar3.length; i++) {
			two_ar3[i]= new int[i+1];
			//System.out.println(two_ar3[i].length);
			for (int j = 0; j < two_ar3[i].length; j++) {
				two_ar3[i][j] = (int)(Math.random()*100)+1;
				System.out.print(two_ar3[i][j] + "\t");
			}
			System.out.println();
		}
}
	//이차배열 선언+생성 +초기화
	//int two_ar4[][] = {{1},{4,5},{7,8,9},{10,11,12,13}};

}
