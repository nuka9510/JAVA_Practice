package inflearn;

import java.util.HashMap;

public class inflearn_26 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.size());
		
		map.put(5, "Hello");
		map.put(6, "Java");
		map.put(7, "World");
		System.out.println(map);
		System.out.println(map.size());
		
		map.put(8, "!!");
		System.out.println(map);
		
		map.put(6, "C");
		System.out.println(map);
		
		String str = map.get(5);
		System.out.println(str);
		System.out.println(map);
		
		str = map.remove(8);
		System.out.println(str);
		System.out.println(map);
		
		boolean b = map.containsKey(7);
		System.out.println(b);
		
		b = map.containsValue("World");
		System.out.println(b);
		
		map.clear();
		System.out.println(map);
		
		b = map.isEmpty();
		System.out.println(b);
	}

}
