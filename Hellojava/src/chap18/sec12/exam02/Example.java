package chap18.sec12.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {

	public static void main(String[] args)throws Exception {
		
		String filePath = "/Users/gaebal/workspace/Hellojava/src/ch01/ver01/hellojava.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData == null) {
				break;
			}
			System.out.println(++rowNumber + ":" + rowData);
		}
	}

}
