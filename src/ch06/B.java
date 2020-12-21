package ch06;

import ch061.*;
//  public 접근 제한자 사용
public class B {
//	A클래스는 default 접근 제한자를 사용하여 동일한 패키지를 사용하는 B 클래스에서 호출이 가능함 
	A a = new A();
	

	public B() {
	DEF def = new DEF();
//	ABC 클래스의 멤버변수인  protectedName은 접근 제한자를 proteced를 사용하여 상속받은 클래스에서는 사용이 가능하지만 
//	패키지가 변경되면 사용할 수 없음 
//	System.out.println("상속받은 protectedName : " + def.protectedName);
	System.out.println("상속받은 publicName : " + def.publicName);
	System.out.println("자신의 publicName : " + def.publicDEFName);

	}
}
	
