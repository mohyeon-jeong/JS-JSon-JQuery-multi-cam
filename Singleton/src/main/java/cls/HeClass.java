package cls;

import single.Singleton;

public class HeClass {
	
	private int number;
	private String name;
	
	public HeClass() {
		
	}
	
	public void func() {
		Singleton si = Singleton.getInstance();
		number = si.number;
	}
	
	public void heName() {
		Singleton si = Singleton.getInstance();
		name = si.name;
	}

	@Override
	public String toString() {
		return "HeClass [number=" + number + ", name=" + name + "]";
	}

}
