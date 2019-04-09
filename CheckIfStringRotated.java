package org.dhananjay.programming;
import java.io.*;
public class CheckIfStringRotated {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String input1=br.readLine();
			String input2=br.readLine();
			boolean result = findIfRotated(input1, input2);
			if(result)
				System.out.println("1");
			else
				System.out.println("0");
		}
	}
	
	public static boolean findIfRotated(String input1, String input2) {
		if(input1.charAt(0)==input2.charAt(input2.length()-2)) {
			if(input1.charAt(1)==input2.charAt(input2.length()-1)) {
				String input3=input1+input1;
				if(input3.contains(input2)) {
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

}
