package inflearn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class inflearn_31 {

	public static void main(String[] args) {
		/*
		OutputStream outputStream1 = null;
		try {
			outputStream1 = new FileOutputStream("D:\\java\\download\\inflearn\\hello.txt");
			String data1 = "Hello java world!!";
			byte[] arr1 = data1.getBytes();
			
			try {
				outputStream1.write(arr1);
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream1 != null) outputStream1.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		*/
		OutputStream outputStream2 = null;
		try {
			outputStream2 = new FileOutputStream("D:\\java\\download\\inflearn\\hello.txt");
			String data2 = "Hello java world!!";
			byte[] arr2 = data2.getBytes();
			
			try {
				outputStream2.write(arr2, 0, 5);
			} catch(IOException e) {
				e.printStackTrace();
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(outputStream2 != null) outputStream2.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
