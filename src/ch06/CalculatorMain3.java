package ch06;

public class CalculatorMain3 {

	public static void main(String[] args) {
		Calculator8 cal8 = new Calculator8();
		cal8.areaReactangle(10);
		System.out.println("가로가 10인 정사각형의 넓이는 : "+ cal8.areaReactangle(10));
		System.out.println("가로가 10이고 세로가 5인 직사각형의 넓이는 : " + cal8.areaReactangle(10.0, 5.0));
		
		System.out.println("----------오버로딩 -------------");
		
		Calculator9 cal9 = new Calculator9();
		System.out.println("정수 2개를 입력하는 덧셈 : " + cal9.plus(10, 5));
		System.out.println("정수 1개와 실수 1개를  입력하는 덧셈 : " + cal9.plus(10,5.0));
		System.out.println("실수 1개와 정수 1개를 입력하는 덧셈 : " + cal9.plus(10.0, 5));
		System.out.println("실수 2개를 입력하는 덧셈 : " + cal9.plus(10.0, 5.0));
		
		
	}

}

//문제 1 ) 
//메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요
//조건 1. 메서드는 사칙연산(나머지 연산 포함 ) 모두를 구현해야함 
//조건 2. 입력받는 데이터는 2개, 정수 혹은 실수 

//문제 2 ) 메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요 
//조건 1. 메서드는 사칙연산을(나머지 연산 포함 ) 모두 구현해야함
//조건 2. 데이터는 2개 정수 혹은 실수
//조건 3. 맴버 변수 x, y가 존재하여 데이터를 입력한 후 연산 
//조건 4. 화면에 출력을 하기 위한 전용 메서드를 사용
//조건 5. 출력 전용 메서드는 현재 연산이 어떤 것이었는지 확인하는 
//매개변수를 1개 입력받아 해당 매개변수에 따라서 화면에 출력하는 문자열이 달라져야함 