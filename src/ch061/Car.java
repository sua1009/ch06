package ch061;

public class Car {
	private int speed;
	private boolean stop;
	
//	접근 제한자 private을 사용하여 외부에서 멤버 변수에 직접 접근이 불가능함 
	public int getSpeed() {
//		멤버 변수인 speed를 제약 없이 사용
		return speed;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
//			멤버 변수인 speed를 제약 없이 사용
			this.speed = 0;
			return; //메서드 즉시 종료
		}
		else {
			this.speed = speed;
			}
		}
		public boolean isStop() {
			return stop;
		}
		
		public void setStop(boolean stop) {
			this.stop = stop;
			this.speed = 0;
		}
	
}
