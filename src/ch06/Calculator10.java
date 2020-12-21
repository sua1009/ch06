package ch06;
//문제 1 ) 
//메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요
//조건 1. 메서드는 사칙연산(나머지 연산 포함 ) 모두를 구현해야함 
//조건 2. 입력받는 데이터는 2개, 정수 혹은 실수 
public class Calculator10 {

	public int plus (int x, int y) {
		int result = x + y ;
		return result;
	}
	
	public double sub (double x, double y) {
		double result = x - y;
		return result;
	}
	
	public double multi (double x, int y) {
		double result = x * y;
		return result;
	}
	
	public double mod (int x, double y) {
		double result = x % y;
		return result;
	}
}
