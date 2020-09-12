package programmers;

public class Kakao_1 {
	public static void main(String[] args) {
    	String new_id = "abcdefghijklmn.p";
    	String new_id_01 = "";
    	char tmp;
    	for(int i=0;i<new_id.length();i++) {
    		tmp = new_id.charAt(i);
    		if(tmp>=65&&tmp<=90) {
    			new_id_01 += new_id.valueOf(tmp).toLowerCase();
    		}else {
    			new_id_01 += (char)tmp;
    		}
    	}
    	new_id_01 = new_id_01.replaceAll("[^a-z|\\.|\\d|\\-|\\_]", "");
    	new_id_01 = new_id_01.replaceAll("[\\.]+", "\\.");
    	new_id_01 = new_id_01.replaceAll("^[\\.]|[\\.]$", "");
    	if("".equals(new_id_01)) {
    		new_id_01 = "a";
    	}
    	if(new_id_01.length()>=16) {
    		new_id_01 = new_id_01.substring(0, 15);
    	}
    	new_id_01 = new_id_01.replaceAll("^[\\.]|[\\.]$", "");
    	if(new_id_01.length()<3) {
    		for(;true;) {
    			new_id_01 += new_id_01.charAt(new_id_01.length()-1);
    			if(new_id_01.length()==3) {
    				break;
    			}
    		}
    	}
    	System.out.println(new_id_01);
    }
}