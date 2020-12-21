package ch06;

public class Student {
//	필드, 클래스 맴버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void inputInfo( int id, String name, int grad, String addr) {
		studentID = id;
		studentName = name;
		grade = grad;
		address = addr;
		
	}
	
	public void printInfo() {
		System.out.println(studentID);
		System.out.println(studentName);
		System.out.println(grade);
		System.out.println(address);
	}
	
}
