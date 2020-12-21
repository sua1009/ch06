package ch06;
//문제 2 ) 메서드 오버로딩을 사용하여 계산기 프로그램을 작성하세요 
//조건 1. 메서드는 사칙연산을(나머지 연산 포함 ) 모두 구현해야함
//조건 2. 데이터는 2개 정수 혹은 실수
//조건 3. 맴버 변수 x, y가 존재하여 데이터를 입력한 후 연산 
//조건 4. 화면에 출력을 하기 위한 전용 메서드를 사용
//조건 5. 출력 전용 메서드는 현재 연산이 어떤 것이었는지 확인하는 
//매개변수를 1개 입력받아 해당 매개변수에 따라서 화면에 출력하는 문자열이 달라져야함 
public class Calculator11 {
	double x;
	double y;
	char oper;
	
	public Calculator11() {};
	
	public Calculator11(int x, int y) {
		this((double)x, (double)y);
	}
	public Calculator11(int x, double y) {
		this((double)x, y);
	}
	public Calculator11(double x, int y) {
		this(x, (double)y);
	}
	public Calculator11(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int plus (int x, int y, char oper) {
		x = 10;
		y = 5;
		int result = x + y ;
		return result;
	}
	
	public double sub (double x, double y, char oper) {
		x = 10.0;
		y = 5.0;
		double result = x - y;
		return result;
	}
	
	public double multi (double x, int y, char oper) {
		x = 10.0;
		y = 5;
		double result = x * y;
		return result;
	}
	
	public double mod (int x, double y, char oper) {
		x = 10;
		y = 5.0;
		double result = x % y;
		return result;
	}
	
	public void printer(char oper) {
		if (oper == '+') {
			int x = 10;
			int y = 5;
			int result = x + y ;
			
			System.out.println(result);
		}
		else if (oper =='-') {
			double x = 10.0;
			double y = 5.0;
			double result = x - y;
			
			System.out.println(result);
		}
		else if (oper == '*') {
			double x = 10.0;
			int y = 5;
			double result = x * y;
			System.out.println( result);
		}
		else if (oper == '%') {
			int x = 10;
			double y = 5.0;
			double result = x % y;
			System.out.println(result);
		}
	}
}






