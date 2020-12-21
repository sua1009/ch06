package ch06;
//문제 1 ) 자동차에 대한 정보를 저장할 수 있는 클래스를 생성하여 자동차에 
//대한 정보를 출력하는 프로그램을 작성하세요 

//조건 1. 기본 생성자를 1개 가지고 있어야함
//조건 2. 자동차 정보 입력 메서드, 자동차 정보 출력 메서드 
//조건 3. 클래스명 : CarInfo, 실행 클래스는 CarInfoMain
//조건 4. 필요한 자동차 정보 : 회사명, 모델명, 연료종류, 차종류, 크기, 색상, 가격
//조건 5. 클래스를 이용하여 생성하는 객체는 2개 이상 
//카톡으로 제출, 날짜_문제번호_이름.zip , 소스만 압축
public class CarInfo {	
//	멤버 변수
	String company;
	String model;
	float fuel;
	String car;
	String size;
	String color;
	int price;

	public CarInfo() {
		company = "현대";
		model = "GV70";
		fuel = 8.5f;
		car = "제네시스";
		size = "중형차";
		color = "블랙";
		price = 5000;
	}
	
	public void CarInfoInput(String company, String model, float fuel, String car, String size,	String color,
			int price) {
		this.company = company;
		this.model = model;
		this.fuel = fuel;
		this.car = car;
		this.size = size;
		this.color = color;
		this.price = price;
		CarInfoOutput();
	}
	
	public void CarInfoOutput() {
		System.out.println("company :"+ company);
		System.out.println("model : " + model);
		System.out.println("fuel : " + fuel);
		System.out.println("car : " + car);
		System.out.println("size : " + size);
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
	
}
