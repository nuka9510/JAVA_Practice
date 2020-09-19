package inflearn;

public class inflearn_24 {
	public static void main(String[] args) {
		String str = new String("JAVA");
		System.out.println(str);
		
		str = str + "_8";
		System.out.println(str);
		
		StringBuffer strbf = new StringBuffer("JAVA");
		System.out.println(strbf);
		
		strbf.append(" World");
		System.out.println(strbf);
		System.out.println(strbf.length());
		
		strbf.insert(strbf.length(), "~~~~~~~~");
		System.out.println(strbf);
		
		strbf.delete(4, 9);
		System.out.println(strbf);
		
		StringBuilder strbu = new StringBuilder("JAVA World");
		System.out.println(strbu);
	}

}
