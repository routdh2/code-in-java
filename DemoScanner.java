package org.dhananjay.programming;

import java.util.Scanner;
public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);//System.in is an System object which represents the input stream 
		while(sc.hasNextInt()) {
			int input = sc.nextInt();
			sum+=input;
//			String input = sc.nextLine();
			if(input==0)
				break;
			
		}
		System.out.println(sum);
		sc.close();
	}

}
