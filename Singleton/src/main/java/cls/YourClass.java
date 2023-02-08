package cls;

import single.Singleton;

public class YourClass {

	private String name = "asdf";
	private int number;
	
//	public void setNumber(int number) {
//		this.number = number;
//	}
	
	public void yourMethod() {
		Singleton si = Singleton.getInstance();
		number = si.number;
	}
	
	public void yourName() {
		Singleton si = Singleton.getInstance();
		si.name = name;
	}

	@Override
	public String toString() {
		return "YourClass [name=" + name + ", number=" + number + "]";
	}

}
