package ch06;

public class CalculatorMain4 {

	public static void main(String[] args) {
//		문제 1번 
		Calculator10 cal10 = new Calculator10();
		System.out.println("정수 2개 : " + cal10.plus(10,5));
		System.out.println("실수 2개 : " + cal10.sub(10.0,5.0));
		System.out.println("실수 1개 정수 1개 : " + cal10.multi(10.0,5));
		System.out.println("정수 1개 실수 1개 : " + cal10.mod(10,5.0));
		
//		문제 2번
		Calculator11 cal11 = new Calculator11();
		cal11.printer('+');
		cal11.printer('-');
		cal11.printer('*');
		cal11.printer('%');
		

	}

}
