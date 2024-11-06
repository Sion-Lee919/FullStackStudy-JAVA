package test3;

import java.util.Scanner;

public class Ex1_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a[][]= new String [4][6];
		a[0]= new String[]{"라면","음료수","계란","소불고기","사과",""};
		a[1]= new String[]{"500","2500","8000","20000","1000",""};
		a[2]= new String[]{"7","2","1","1","5",""};
		a[3]= new String[]{"카드","현금","현금","카드","현금",""};
		
		System.out.println("음식 가격 수량 결제방법(카드,현금) 순으로 입력");
		String products = sc.next();
		String prices = sc.next();
		String amounts = sc.next();
		String card = sc.next();
		
		a[0][5]= products;
		a[1][5]= prices;
		a[2][5]= amounts;
		a[3][5]= card;
		
		int b []= new int[6];
		for (int i = 0; i < b.length; i++) { //수량 * 가격
			int a1i = Integer.parseInt(a[1][i]);
			int a2i = Integer.parseInt(a[2][i]);
			b[i]= a1i*a2i;
		}

			for (int j = 0; j < a[0].length; j++) {
				if(a[3][j].equals("카드")) {
					a[3][j]="총지불가격은 : "+b[j]+"입니다. 카드 결제가 완료되었습니다";
				}
				else {a[3][j]="총지불가격은 : "+b[j]+"입니다. 현금 결제가 완료되었습니다.(현금영수증처리할 전화번호는 010-1234-5678 입니다.)";}
			}
	
		
		for (int j = 0; j < a[0].length; j++) {
		for(int i=0; i<a.length; i++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		/*
		 명령행 매개변수 시 Scanner빼고 넣기
		 products[products.length-1] = args[0];
		 prices[prices.length-1] = args[1];
		 amounts[amounts.length-1] = args[2];
		 card[card.length-1] = args[3];
		 */
	}

}
/*문제 1. 이차 배열을 생성한다. 
1-1. 위 3개의 배열을 6개의 String 타입 데이터 저장 크기로 생성한다. 
1-2. 1-1 의 배열들을 이차 배열로 구성한다. 
2. 명령행 매개변수로 다음을 입력받는다. 
예1>우유 2500원 3개 카드 
예2>우유 2500원 3개 현금 010-1234-5678 
3. 첫번째값을 products 배열 마지막 데이터 추가 
두번째값을 prices 배열 마지막 데이터 추가 
세번째값을 amounts 배열 마지막 데이터 추가 
4.  
총 지불 가격 계산 
라면 : 500 * 7 = 3500 
prioducts[0] : prices[0] * amounts[0] = xxxx. 
우유 : 2500 * 3 = 7500 
네번째값이 카드이면 
총 지불 가격은 xxxx 원입니다. 
카드 결제 완료되었습니다.  
네번째값이 현금이면 
총 지불 가격은 xxxx 원입니다. 
현금 결제 완료되었습니다.(현금영수증처리할 전화번호는 010-1234-5678 입니다.)
   */