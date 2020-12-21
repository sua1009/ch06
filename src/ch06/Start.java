package ch06;

public class Start {

//	클래스는 2가지 형태, 실행 클래스, 라이브러리 클래스
//	실행 클래스는 main() 메서드를 가지고 있음 
//	하나의 프로그램은 하나의 main() 메서드와 여러개의 라이브러리 클래스를 가지고 있음 
//	main()메서드는 프로그램의 시작 지점
//	main() 메서드에서 여러개의 라이브러리를 객체화하여 라이브러리를 실행함
	public static void main(String[] args) {
		
//		자바에서 변수 사용 시 선언만 하고 초기화하지 않고 사용 시 오류가 발생함 
//		int studentID;
//		String studentName;
//		int grade;
//		String address;
//		
//		System.out.println(studentID);
//		System.out.println(studentName);
//		System.out.println(grade);
//		System.out.println(address);
		
//		객체화된 클래스의 멤버변수 및 멤버 메서드를 가져다가 사용하려면 객체명.멤버변수명, 객체명.멤버메서드명으로 사용 
//		Student 클래스를 클래스 변수 student로 객체화 함
		Student student = new Student();
		
		
//		객체화된 student 멤버변수 studentID를 호출 
//		student의 멤버변수 studentID는 0으로 자동 초기화 됨 
		System.out.println(student.studentID);
		System.out.println(student.studentName);
		System.out.println(student.grade);
		System.out.println(student.address);
		
		
//		클래스를 사용하는 이유
//		1. 여러개의 관련된 데이터를 한번에 모아서 사용하기 위해서 
//		배열을 사용해서 데이터를 저장해도 상관은 없으나 자바의 배열은 자바스크립트처럼 여러가지 데이터 타입을 한번에 저장할 수 없음 
//		자바의 배열은 같은 타입의 데이터만 저장가능
//		2. 특정 기능을 사용할 경우 데이터 및 기능을 사용하기 쉬움 
//		3. 소스의 재활용이 쉬움, 기존의 소스도 짧아짐 
		int studentID1 = 1;
		String studentName1 = "아이유";
		int grade1 = 102;
		String address1 = "서울";
		
		System.out.println(studentID1);
		System.out.println(studentName1);
		System.out.println(grade1);
		System.out.println(address1);
		

		int studentID2 = 2;
		String studentName2 = "유인나";
		int grade2 = 102;
		String address2 = "서울";
		
		System.out.println(studentID2);
		System.out.println(studentName2);
		System.out.println(grade2);
		System.out.println(address2);
		
		int studentID3 = 3;
		String studentName3 = "유재석";
		int grade3 = 103;
		String address3 = "서울";
		
		System.out.println(studentID3);
		System.out.println(studentName3);
		System.out.println(grade3);
		System.out.println(address3);
		
		int studentID4 = 4;
		String studentName4 = "유산슬";
		int grade4 = 104;
		String address4 = "서울";
		
		System.out.println(studentID4);
		System.out.println(studentName4);
		System.out.println(grade4);
		System.out.println(address4);
		
		int studentID5 = 5;
		String studentName5 = "이효리";
		int grade5 = 105;
		String address5 = "서울";
		
		System.out.println(studentID5);
		System.out.println(studentName5);
		System.out.println(grade5);
		System.out.println(address5);
		
//		전체 데이터를 저장하기 위해서 배열을 4개 선언함 (각각의 타입에 따라 )
//		문제점 : 데이터 저장시 순서가 바뀔경우 데이터의 무결성이 훼손됨
		int[] studentIds = new int[] {1, 2, 3, 4, 5};
		String[] studentNames = new String[] {"아이유", "유인나", "유재석", "유산슬", "이효리"};
		int[] grades = new int[] {102, 102, 103, 104, 105};
		String[] addrs = new String[] {"서울", "서울", "서울", "서울","서울"};
		
		for (int i = 0; i < studentIds.length; i ++) {
			System.out.println(studentIds[i]);
			System.out.println(studentNames[i]);
			System.out.println(grades[i]);
			System.out.println(addrs[i]);
		}

		Student std = new Student();
		std.inputInfo(1000, "아이유", 102, "서울");
		std.printInfo();
		
		Student std2 = new Student();
		std2.studentID = 2000;
		std2.studentName = "유재석";
		std2.grade = 102; 
		std2.address = "서울";
		std2.printInfo();
	}

}
