package ch06;

public class CarInfoMain {

	public static void main(String[] args) {
		
		System.out.println("--------문제 1번 --------");
		CarInfo carinfo = new CarInfo();
		carinfo.CarInfoOutput();
		CarInfo carinfo2 = new CarInfo();
//		carinfo2.CarInfoOutput("쉐보레", "콜로라도", 5.6f, "제네시스", "중형차", "블랙", 5000);
		
		
		System.out.println("\n------문제 2번 -----\n");
		CarInfo2 carinfo3 = new CarInfo2();
		carinfo3.printer();
		CarInfo2 carinfo33 = new CarInfo2("콜로라도", "가솔린", 3.5f);
		carinfo33.printer();
		CarInfo2 carinfo333 = new CarInfo2("쉐보레", "콜로라도", 5.6f, "제네시스", "중형차", "블랙", 5000);
		carinfo333.printer();
		
		
		System.out.println("\n--------문제 3-------\n");
		
		CarInfo3 carinfo6 = new CarInfo3();
		CarInfo3 carinfo66 = new CarInfo3("콜로라도", "가솔린", 3.5f);
		CarInfo3 carinfo666= new CarInfo3("쉐보레", "콜로라도", 5.6f, "제네시스", "중형차", "블랙", 5000);
		carinfo6.Output();
		carinfo66.Output();
		carinfo666.Output();

	}

}
