package ch06;

public class Car {
//	Car클래스의 멤버 변수
	int gas;
	
	public void setGas(int inGas) {
		this.gas = inGas;
	}
	
	public boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		System.out.println("gas가 있습니다.");
		return true;
		}
	public void run() {
		while(true) {
			if (gas >0) {
				System.out.println("달립니다. (gas 잔량 : " +  gas + ")");
				gas --;
			}
			else {
				System.out.println("멈춥니다.. (gas 잔량 : " + gas + ")");
				return;
			}
		}
		
	}
	
}
