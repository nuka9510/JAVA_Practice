package inflearn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class inflearn_36 {

	public static void main(String[] args) {
		
		String fileName = "D:\\java\\download\\inflearn\\HelloWriter.txt";

		BufferedWriter bw = null;
		FileWriter fw = null;
		
		try {
			String str = "Hello Java World~~\n";
			str += "Hello C World~~\n";
			str += "Hello C++ World~~\n";
			
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			bw.write(str);
			
			System.out.println("end");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
