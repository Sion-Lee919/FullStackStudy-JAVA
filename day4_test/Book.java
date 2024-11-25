package test4;

public class Book {
	private String title;
	private int price;
	Book(){}
	Book(String title, int price){//맴버변수 모두 초기화 생성자
		this.title =title;
		this.price=price;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}
