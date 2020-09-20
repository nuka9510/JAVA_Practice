package inflearn;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class inflearn_33 {

	public static void main(String[] args) {
		String str = "Hello Java World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			outputStream = new FileOutputStream("D:\\java\\download\\inflearn\\HelloWorld.txt");
			dataOutputStream = new DataOutputStream(outputStream);
			
			dataOutputStream.writeUTF(str);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputStream != null) dataOutputStream.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream != null) outputStream.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
