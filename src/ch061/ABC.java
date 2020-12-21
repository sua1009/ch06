package ch061;

public class ABC {
	private String privateName = "privat";
	protected String protectedName = "protected";
	public String publicName = "public";
	
//	클래스 내에서만 사용이 가능
	public void aaa() {
		privateName = "aaa";
	}
}
