package ch06;

public class SingletonMain {

	public static void main(String[] args) {
//		오류발생, new 키워드 뒤에 Singleton 클래스의 생성자 Singleton()을 호출해야 객체가 생성되는데 ,
//		Singleton() 생성자의 접근제어자가 private으로 설정되어 있어 외부에서 접근할 수 없음 
//		Singleton obj1 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
//		Singleton obj3 = new Singleton();
//		Singleton obj4 = new Singleton();
		
		if (obj1 == obj2){
			System.out.println("두 객체는 같다.");
		}
		else {
			System.out.println("두 객체는 다르다.");
		}
		
//		if (obj3 == obj4 ) {
//			System.out.println("두 객체는 같다.");
//		}
//		else {
//			System.out.println("두 객체는 다르다.");
//		}
//	}

	}
}
