package cls;

import single.Singleton;

public class MyClass {

	private int number;
	
	public MyClass() {
		number = 256;
	}
	
	public void myMethod() {
		Singleton si = Singleton.getInstance();
		si.number = number;
	}

//	public int getNumber() {
//		return number;
//	}
	
}
