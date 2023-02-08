package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainClass {
	
	public static void main(String[] args) {
		
		Map<Integer, String> hMap = new HashMap<>();

		// add
		hMap.put(101, "Lions");
		hMap.put(102, "Tigers");
		hMap.put(103, "Bears");
		hMap.put(104, "Eagles");

		hMap.put(102, "Giants");

		System.out.println(hMap.size());

		// print all
		// Iterator : 반복자(== 포인터, 주소, cursor)
		Iterator<Integer> it = hMap.keySet().iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			String value = hMap.get(key);

			System.out.println(key + " : " + value);
		}

		// delete
		String deleteVal = hMap.remove(104);
		System.out.println("deleted value : " + deleteVal);

		// search
		String value = hMap.get(101);

		boolean b = hMap.containsKey(102);
		if (b == true) {
			String val = hMap.get(102);
			System.out.println("value : " + val);
		}

		// update
		hMap.replace(103, "Twins");

		it = hMap.keySet().iterator();

		while (it.hasNext()) {
			Integer key = it.next();
			String val = hMap.get(key);

			System.out.println(key + " : " + val);
		}
		
	}
	
}
