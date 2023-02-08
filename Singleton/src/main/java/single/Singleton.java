package single;

public class Singleton {
	
	private static Singleton single = null;
	public int number;
	public String name;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
	
}
