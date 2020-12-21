package ch06;

public class Earth {
//	final 키워드를 사용하여 변수 선언 시 데이터 입력 후 더이상 수정 불가 
//	static 키워드를 사용하여 객체를 생성하지 않고 사용가능 클래스.멤버명으로 사용 가능 
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
//	static 코드블럭 : static 키워드를 사용한 정적 멤버들을 초기화하는데 사용하는 코드블럭 
//	static 키워드를 사용한 정적 멤버 전용 생성자라고 생각하면 됨 
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	
	}
}
