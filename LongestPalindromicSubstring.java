package org.dhananjay.programming;
import java.io.*;
public class LongestPalindromicSubstring {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String input = br.readLine();
			String result = findLongestPalindromcSubstring(input);
			System.out.println(result);
		}
	}
	
	public static String findLongestPalindromcSubstring(String input) {
		char[] arr = input.toCharArray();
		int maxLeft=0, maxRight=0, maxSize=Integer.MIN_VALUE;
		boolean flag = false;
		for(int i=0;i<arr.length-1;i++) {
			int left=i;
			for(int j=i+1;j<arr.length;j++) {
				int right=j;
				if(isPalindrome(arr, left, right)) {
					int size = right-left+1;
					if(size>maxSize) {
						flag=true;
						maxSize=size;
						maxLeft=left;
						maxRight=right;
					}
				}
				
			}
		}
		String output="";
		if(flag) {
			output = new String(arr, maxLeft, maxSize);
		}
		return output;
	}
	
	public static boolean isPalindrome(char[] arr, int left, int right) {
		for(int i=left, j=right;i<j;i++,j--) {
			if(arr[i]!=arr[j])
				return false;
		}
		return true;
	}
}
