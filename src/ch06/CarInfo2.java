package ch06;
//문제 2 ) 1번 문제의 CarInfo 클래스를 수정하여 CarInfo2로 새로 생성하고 
//생성자를 3개 이상 사용하는 방식의 클래스를 생성하여 자동차의 정보를 출력하는 
//프로그램을 작성하세요

//조건 1. 생성자를 기본생성자를 포함하여 총 3개 이상 생성
//조건 2. 클래스를 이용하여 생성하는 객체는 2개 이상
//조건 3. this() 생성자는 사용하지 않음 
public class CarInfo2 {
	String company;
	String model;
	float fuel;
	String car;
	String size;
	String color;
	int price;
	
//	생성자명은 클래스 명과 동일
//	생성자는 반환값 없음 (void도 입력하지 않음)
//	생성자 오버로딩은 동일한 이름의 생성자를 생성 시 매개변수의 타입, 개수, 순서에 따라 달라짐
//	모든 정보를 사용자에게 입력받아 사용하는 형태
	public CarInfo2(String company, String model, float fuel, String car, String size,	String color,
			int price) {
		this.company = company;
		this.model = model;
		this.fuel = fuel;
		this.car = car;
		this.size = size;
		this.color = color;
		this.price = price;
	}
	
//	중요한 매개변수 몇개만 사용한 생성자
//	중요한 몇가지 정보만 사용자에게 입력받고 나머지 정보는 개발자가 고정하여 입력하는 형태
	public CarInfo2(String company, String model, float fuel) {
		
		this.company = company;
		this.model = model;
		this.fuel = fuel;
		this.car = "제네시스";
		this.size = "중형차";
		this.color = "블랙";
		this.price = 5000;
	}
	
//	매개변수가 없는 형태의 생성자 
//	모든 정보를 개발자가 고정하여 입력하는 형태
	public CarInfo2() {
		company = "현대";
		model = "GV70";
		fuel = 8.5f;
		car = "제네시스";
		size = "중형차";
		color = "블랙";
		price = 5000;
		
	}
	
	
	
	public void printer() {
		System.out.print("company :"+ company+ "\nmodel : " + model+ "\nfuel : " + fuel
				+"\ncar : " + car +"\nsize : " + size + "\ncolor : " + color +"\nprice : " + price);
	}

	
//	public void CarInfoInput(String company, String model, float fuel, String car, String size,	String color,
//	int price) {
//		
//	}
//	
//	public void CarInfoOutput() {
//		System.out.println("company :"+ company);
//		System.out.println("model : " + model);
//		System.out.println("fuel : " + fuel);
//		System.out.println("car : " + car);
//		System.out.println("size : " + size);
//		System.out.println("color : " + color);
//		System.out.println("price : " + price);
//	}

}
