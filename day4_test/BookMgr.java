package test4;

public class BookMgr {
	Book booklist[];//1번 Book 객체들만 들어가는 배열
	BookMgr(Book[] booklist){ //2번
		this.booklist=booklist;
	}
	void printBookList() { //3번
		/*booklist - 배열
		booklist[0~4] -Book
		booklist[0].title - 책제목 String */
		for (Book b : booklist) {
			System.out.println(b.getTitle() + ":" + b.getPrice());//목록 +가격
		}
	}
	
	void printTotalPrice() {//4번 가격의 합
		int totalPrice =0;
		for (Book b : booklist) {
			totalPrice += b.getPrice();
		}
	System.out.println(totalPrice);
	}
}	
/*
BookMgr 클래스의 제약조건 
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
3. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
4. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
*/