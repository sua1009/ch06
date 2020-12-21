package ch06;

// 메서드 오버로딩 : 하나의 이름으로 여러개의 메서드를 생성하는 방법
// 조건 : 매개변수의 타입, 개수, 순서 달라야 함
//
public class Calculator8 {
	
//	정사각형의 넓이를 구하는 메서드
	double areaReactangle(double width) {
		return width * width;
		
	}
	
//	매개변수의 개수는 같으나 매개변수의 데이터 타입이 다르기 때문에 오버로딩이 가능함 
	int areaReactangle (int width) {
		return width * width;
		
	}
//	직사각형의 넓이를 구하는 메서드
//	매개변수의 개수가 달라서 오버로딩이 가능함 
	double areaReactangle(double width, double height) {
		return width * height;
	}
		
//	매개변수의 개수와 데이터 타입은 같으나 매개변수의 데이터 타입 순서가 다르기 때문에 오버로딩이 가능함 
//	매개변수의 개수는 같으나 매개변수의 데이터 타입이 다르기 때문에 오버로딩이 가능함 
	double areaReactangle( int height, int width) {
		return width * height;
	}
//	순서를 변경하여 오버로딩을 할 경우 변수의 이름 순서가 아닌 타입의 순서가 변경되엉야 함
}
