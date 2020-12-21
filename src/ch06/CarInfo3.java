package ch06;
//문제 3 ) 1번 문제의 CarInfo클래스를 수정하여 생성자를 3개이상 사용하는 방식의 형태로 수정하고,
//this() 생성자를 사용하여 최종 생성자를 실행하는 방식의 클래스로 생성하여 자동차의 정보를 출력하는 
//프로그램을 작성하세요 

//조건 1. 클래스의 이름은 CarInfo3
//조건 2. this() 생성자느 어떠한 형태든지 1번 이상 사용
//조건3. 클래스를 이용하여 생성하는 객체는 2개이상 
public class CarInfo3 {
	
		String company;
		String model;
		float fuel;
		String car;
		String size;
		String color;
		int price;
		
//		this() 생성자 : 객체 생성시 자동으로 실행되는 생성자에서 또다른 생성자를 실행시키고자 할 때 사용하는 명령어
//		this() 생성자는 해당 생성자의 코드블럭에서 첫번째 줄에 입력해야함 
		public CarInfo3(String company, String model, float fuel, String car, String size,	String color,
				int price) {
			this.company = company;
			this.model = model;
			this.fuel = fuel;
			this.car = car;
			this.size = size;
			this.color = color;
			this.price = price;
			
			System.out.println("\n\n 변수가 모두모인 생성자로 이동");
			Output();

		}
		
		public CarInfo3(String company, String model, float fuel) {
			this(company, model, fuel, "제네시스", "중형차", "블랙", 5000);
			
			
			
		}
		
		public CarInfo3() {
			this("현대", "GV70", 8.5f);
			
			
		}
		
		public void Output () {
			System.out.print("\ncompany :"+ company+ "\nmodel : " + model+ "\nfuel : " + fuel
					+"\ncar : " + car +"\nsize : " + size + "\ncolor : " + color +"\nprice : " + price);
		}


}
