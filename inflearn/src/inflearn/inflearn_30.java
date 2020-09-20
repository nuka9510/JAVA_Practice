package inflearn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class inflearn_30 {
	public static void main(String[] args) {
		/*
		InputStream inputStream1 = null;
		try {
			inputStream1 = new FileInputStream("D:\\java\\download\\inflearn\\hello.txt");
			int data1 = 0;
			
			while(true) {
				try {
					data1 = inputStream1.read();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data1 == -1) break;
				System.out.println(data1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream1 != null) inputStream1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		InputStream inputStream2 = null;
		try {
			inputStream2 = new FileInputStream("D:\\java\\download\\inflearn\\hello.txt");
			int data2 = 0;
			byte[] bs = new byte[3];
			
			while (true) {
				try {
					data2 = inputStream2.read(bs);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data2 == -1) break;
				System.out.println(data2);
				for(int i=0;i<bs.length;i++) {
					System.out.println(bs[i]);
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream2 != null) inputStream2.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
