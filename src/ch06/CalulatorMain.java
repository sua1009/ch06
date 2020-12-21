package ch06;

public class CalulatorMain {

	public static void main(String[] args) {
//		Calculator 클래스를 myCal 이란 이름으로 객체화
		Calculator myCal = new Calculator();
//		Calculator 클래스의 맴버 메소드 powerOn() 을 실행 
		myCal.powerOn();
		
//		정수형 변수 result를 선언하고, Calculator 클래스의 멤버 메소드 plus()를 실행
//		매개변수를 5, 6을 넘겨줘서 실행
		int result = myCal.plus(5, 6);
		System.out.println("result = "+ result);

//		맴버변수가 아닌 그냥 일반변수
		byte x = 10;
		byte y = 4;
//		myCal의 맴버 메소드 divide()를 실행
//		매개변수를 x, y2개를 가지고 실행 
//		divide() 메소드는 매개변수로 int 타입의 변수를 2개 받으나 실제로 넘겨준 x, y는 byte 타입이었음 
//		int 타입은 byte타입보다 데이터 타입의 크기가 크기때문에 byte타입은 int타입으로 자동 타입변환이 발생함 
		double dResult = myCal.divide(x, y);
		System.out.println("dResult = " + dResult);
		
		int minusResult = myCal.minus(5, 2);
		System.out.println("minusresult = " + minusResult);
		
		int mulResult = myCal.multiple(10, 20);
		System.out.println("mulresult = " + mulResult);
		
		myCal.powerOff();
	}

}

//문제 1 ) Calculator 클래스를 수정하여 곱하기, 빼기 메소드를 생성하고 사용하는 프로그램을 작성하세요 
//	곱하기 메서드명 : multiple
//	빼기 메서드명 : minus
//	압축 파일명 : Calculator_이름.zip
//	압푹할 파일명 : CalculatorMain.java

//	문제 2 ) Calculator2 클래스를 생성하고, 사칙연산을 위한 맴버변수 x, y와 
//	멤버 메서드 plus, minus, multi, div 를 선언하고, 데이터를 입력하기 위한 멤버 메서드 setting()
//	출력전용 메서드 print()를 만들어서 사칙연산을 진행하는 프로그램을 제작하세요
// 	생성할 멤버 변수 : x, y
//	멤버 메소드 : plus, minus, multi, div, setting, print
//  setting, print만 메게변수가 존재, 나머지느 매개변수 없음 
//  plus, minus, multi, div는 멤버변수를 이용해서 연산
//  결과는 print 메서드를 이용해서 출력 ( return 대신 print )







