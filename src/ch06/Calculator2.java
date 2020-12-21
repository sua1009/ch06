package ch06;

public class Calculator2 {
//	문제 2 ) Calculator2 클래스를 생성하고, 사칙연산을 위한 맴버변수 x, y와 
//	멤버 메서드 plus, minus, multi, div 를 선언하고, 데이터를 입력하기 위한 멤버 메서드 setting()
//	출력전용 메서드 print()를 만들어서 사칙연산을 진행하는 프로그램을 제작하세요
// 	생성할 멤버 변수 : x, y
//	멤버 메소드 : plus, minus, multi, div, setting, print
//  setting, print만 매개변수가 존재, 나머지는 매개변수 없음 
//  plus, minus, multi, div는 멤버변수를 이용해서 연산
//  결과는 print 메서드를 이용해서 출력 ( return 대신 print )
	
	int x;
	int y;
	
	public void setting(int inputX , int inputY ) {
		x = inputX;
		y = inputY;
	}
	
	public void printer (int result, char oper) {
		switch(oper) {
		case '+' : 
			System.out.println("두 수의 덧셈은 : " + result);
			break;
			
		case '-' : 
			System.out.println("두 수의 뺄셈은 : " + result);
			break;
			
		case '*' : 
			System.out.println("두 수의 곱셈은 : " + result);
			break;
			
		case '/' : 
			System.out.println("두 수의 나눗셈은 : " + result);
			break;
		}
	}
	
	public void plus() {
		int result = x + y;
		printer(result, '+');
	}
	
	public void minus() {
		int result = x - y;
		printer(result, '-');
	}
	
	public void multi() {
		int result = x * y;
		printer(result, '*');
	}
	
	public void div() {
		int result = x / y;
		printer(result, '/');
	}
}
