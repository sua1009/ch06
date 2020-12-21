package ch06;

public class CalculatorMain2 {

	public static void main(String[] args) {
//		정적 멤버를 사용한 계산기
//		객체화 작업없이 바로 정적 멤버를 사용할 수 있음 
		Calculator3.x = 10;
		Calculator3.y = 5;
		Calculator3.plus();
		Calculator3.minus();
		
		
		
//		인스턴스 멤버를 사용한 계산기 
//		객체화 작업 없이는 인스턴스 멤버의 사용이 불가능함 
		Calculator4 cal4 = new Calculator4();
		cal4.x = 10;
		cal4.y = 5;
		cal4.plus();
		cal4.minus();
		cal4.div();
	//	cal4.multi(); //정적 멤버 메서드는 객체화 해서 사용하면 안됨 
//		정적 멤버 메서드는 클래스명.정적맴버메서드명으로 사용
		Calculator4.multi();
		
		
		System.out.println("\n-----------------\n");
		
		
		Calculator5 cal1 = new Calculator5();
		Calculator5 cal2 = new Calculator5();
		
		cal1.x = 10;
		cal1.y = 5;
		cal1.plus();
		
		cal2.x = 100;
		cal2.y = 50;
		cal2.plus();
		
		System.out.println(cal1.x);
		System.out.println(cal2.x);
		
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		
		cal1.staticX = 1000;
		cal2.staticY = 500;
//		아래의 형태는 사용할 수 있으나 사용하면 안됨 
		System.out.println(cal1.staticX);
		System.out.println(cal2.staticX);
		System.out.println(cal1.staticY);
		System.out.println(cal2.staticY);

//		정젖 멤버의 제대로된 사용 방법
		System.out.println(Calculator5.staticX);
		
		System.out.println("\n---------생성자---------\n");
		
//		생성자는 객체 생성 시 자동 실행
		Calculator6 cal61 = new Calculator6();
		Calculator6 cal62 = new Calculator6(10,5);
		Calculator6 cal63 = new Calculator6(100);
//		cal61.x = 10;
//		cal61.y = 5;

//		프로그램 실행 시 매번 필요한 값을 입력해야함 
//		실수로 setValue()를 실행하지 않고 plus()를 실행시 오류가 발생
//		setValue() 실행하지 않았을 경우에는 기본값이 입력되어 실행되기를 원할 경우 사용하는 것이 생성자 
		
		cal61.setValue(1000, 50);
		cal61.currentValue();
		cal61.plus();
		
		
		System.out.println("\n---------생성자 오버로딩---------\n");
		
		Calculator7 cal71 = new Calculator7(1000, 500);
		Calculator7 cal72 = new Calculator7(100);
		Calculator7 cal73 = new Calculator7();
		
	}

}

// 문제 1 ) 자동차에 대한 정보를 저장할 수 있는 클래스를 생성하여 자동차에 
// 대한 정보를 출력하는 프로그램을 작성하세요 

// 조건 1. 기본 생성자를 1개 가지고 있어야함
// 조건 2. 자동차 정보 입력 메서드, 자동차 정보 출력 메서드 
// 조건 3. 클래스명 : CarInfo, 실행 클래스는 CarInfoMain
// 조건 4. 필요한 자동차 정보 : 회사명, 모델명, 연료종류, 종류, 크기, 색상, 가격
// 조건 5. 클래스를 이용하여 생성하는 객체는 2개 이상 
// 카톡으로 제출, 날짜_문제번호_이름.zip , 소스만 압축

// 문제 2 ) 1번 문제의 CarInfo 클래스를 수정하여 CarInfo2로 새로 생성하고 
// 생성자를 3개 이상 사용하는 방식의 클래스를 생성하여 자동차의 정보를 출력하는 
// 프로그램을 작성하세요

// 조건 1. 생성자를 기본생성자를 포함하여 총 3개 이상 생성
// 조건 2. 클래스를 이용하여 생성하는 객체는 2개 이상
// 조건 3. this() 생성자는 사용하지 않음 

// 문제 3 ) 1번 문제의 CarInfo클래스를 수정하여 생성자를 3개이상 사용하는 방식의 형태로 수정하고,
// this() 생성자를 사용하여 최종 생성자를 실행하는 방식의 클래스로 생성하여 자동차의 정보를 출력하는 
// 프로그램을 작성하세요 

// 조건 1. 클래스의 이름은 CarInfo3
// 조건 2. this() 생성자느 어떠한 형태든지 1번 이상 사용
// 조건3. 클래스를 이용하여 생성하는 객체는 2개이상 















