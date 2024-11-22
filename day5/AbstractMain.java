package day5;

abstract class Shape{
	abstract void area();
	abstract void circum();
}

class Rectangle extends Shape{
	int width, height;
	Rectangle(String width, String height) {
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);
	}
	 void area() {
		 System.out.println("가로 = "+width+", 세로 = "+height+" 인 사각형의 면적 = "+ width * height);
	 }
	 void circum() {
		 System.out.println("가로 = "+width+", 세로 = "+height+" 인 사각형의 둘레 = "+ 2*(width + height));
	 }
	 }


class Circle extends Shape{
	int radius;
	Circle(String radius) {
		this.radius = Integer.parseInt(radius);
	}
	protected void area() {
		System.out.println("반지름 = " + radius + "인 원의 면적 = " + radius*radius*Math.PI);
	}
	void circum() {
		System.out.println("반지름 = " + radius + "인 원의 둘레 = " + 2*radius*Math.PI);
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		//명령행 매개변수
		//circle 5 -> 반지름 5인 원객체 생성
		//rect 7 8 ->가로 7,세로8인 사각형객체 생성
		if(args[0].equals("rect") && args.length == 3){
		Rectangle r = new Rectangle(args[1],args[2]);
		r.area();
		r.circum();
		}
		else if(args[0].equals("circle") && args.length == 2){
			Circle c = new Circle(args[1]);
			c.area();
			c.circum();
			}	
	}
}
