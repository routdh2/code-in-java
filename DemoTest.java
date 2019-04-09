package org.dhananjay.programming;
import java.io.*;
public class DemoTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\dharout.ORADEV\\Eclipse Workspace\\MyFirstProject\\src\\org\\dhananjay\\programming\\demoFile.txt")));
		String str;
		while((str=br.readLine())!=null)
			System.out.println(str);
		br.close();
		System.out.println("File reading completed.");
	}

}
