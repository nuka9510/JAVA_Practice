package inflearn;

import java.util.ArrayList;

public class inflearn_25 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println(list.size());
		
		list.add("Hello");
		list.add("Java");
		list.add("World");
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(2, "Programing");
		System.out.println(list);
		
		list.set(1, "C");
		System.out.println(list);
		
		String str = list.get(2);
		System.out.println(str);
		System.out.println(list);
		
		str = list.remove(2);
		System.out.println(str);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		
		boolean b = list.isEmpty();
		System.out.println(b);
	}

}
