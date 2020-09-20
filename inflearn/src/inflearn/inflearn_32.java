package inflearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class inflearn_32 {
	public static void main(String[] args) {
		InputStream inputStream1 = null;
		OutputStream outputStream1 = null;
		
		try {
			inputStream1 = new FileInputStream("D:\\java\\download\\inflearn\\hello.txt");
			outputStream1 = new FileOutputStream("D:\\java\\download\\inflearn\\helloCopy.txt");
			
			byte[] arr = new byte[3];
			
			while(true) {
				int len = inputStream1.read(arr);
				if(len == -1) break;
				outputStream1.write(arr, 0, len);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(inputStream1 != null) {
				try {
					inputStream1.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			if(outputStream1 != null) {
				try {
					outputStream1.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
