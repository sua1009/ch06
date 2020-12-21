package ch06;

public class Singleton {
	private static Singleton single = new Singleton();
	
//	접근제어자 private을 생성자에 사용하게 되면 생성자에 접근이 불가능하여 객체를 생성할 수 없음
//	컴파일러가 자동으로 생성하는 기본 생성자는 접근제어자가 public임 
	private Singleton() {
		
	}
	
	static Singleton getInstance() {
		return single;
	}
}
