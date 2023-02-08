package main;

import cls.HeClass;
import cls.MyClass;
import cls.YourClass;
import single.Singleton;

public class MainClass {

	public static void main(String[] args) {
		MyClass mycls = new MyClass();
		YourClass youcls = new YourClass();
		
//		int number = mycls.getNumber();
//		youcls.setNumber(number);
		
//		System.out.println(youcls.toString());
		
//		System.out.println(Singleton.getInstance());
		
		mycls.myMethod();
		youcls.yourMethod();
		
		System.out.println(youcls.toString());
		
		HeClass hc = new HeClass();
		hc.func();
		youcls.yourName();
		hc.heName();
		System.out.println(hc.toString());
	}

}
