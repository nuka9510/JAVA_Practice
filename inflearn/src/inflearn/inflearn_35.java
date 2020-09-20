package inflearn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inflearn_35 {

	public static void main(String[] args) {
		
		String fileName = "D:\\java\\download\\inflearn\\HelloReader.txt";

		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String strLine;
			
			while((strLine = br.readLine()) != null) {
				System.out.println(strLine);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
