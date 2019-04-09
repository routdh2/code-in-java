package org.dhananjay.programming;

import java.io.*;
import java.util.Arrays;
public class ReverseWordsInString {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String input = br.readLine();
			String result = reverseString(input);
			System.out.println(result);
			
		}
	}
	
	public static String reverseString(String input) {
		char[] ch_arr = input.toCharArray();
		ch_arr=reverse(ch_arr, 0, ch_arr.length-1);
		int prev=0;
		for(int i=0;i<ch_arr.length;i++) {
			if(ch_arr[i]=='.') {
				ch_arr=reverse(ch_arr, prev, i-1);
				prev=i+1;
			}
			
		}
		ch_arr=reverse(ch_arr, prev, ch_arr.length-1);
		
		String result = new String(ch_arr);
		return result;
	}
	
	public static char[] reverse(char[] ch_arr, int left, int right) {
		for(int i=left,j=right;i<j;i++,j--) {
			char temp = ch_arr[i];
			ch_arr[i]=ch_arr[j];
			ch_arr[j]=temp;
		}
		return ch_arr;
	}

}
