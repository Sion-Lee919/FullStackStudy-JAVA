package test4;

public class Trainee {
	String name, title;//이름, 과정명
	static String center = "이즈웰 풀스택 과정";
	int fee, returnFee;
	final int addFee  = 50000;
	
	public Trainee(String name, String title, int fee) {
		this.name = name;
		this.title = title;
		this.fee = fee;
	}

	public void calcReturnFee() {//JsP jSP
		if(title.equalsIgnoreCase("JSP프로그래밍")) {
			returnFee = (int) (fee*0.25) + addFee;
		}
		else if(title.equals("자바프로그래밍")){
			returnFee = (int) (fee*0.2) + addFee;
		}
		else if(title.equalsIgnoreCase("DATABASE프로그래밍")){
			returnFee = (int) (fee*0.15) + addFee;
		}
		else {
			returnFee = 0;
		}
	}
}