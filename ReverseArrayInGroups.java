package org.dhananjay.programming;
import java.io.*;
public class ReverseArrayInGroups {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String input = br.readLine();
			String[] values = input.trim().split("\\s+");
			int n,k;
			n = Integer.parseInt(values[0]);
			k = Integer.parseInt(values[1]);
			long[] arr = new long[n];
			String input2 = br.readLine();
			String[] values2 = input2.trim().split("\\s+");
			for(int i=0;i<values2.length;i++) {
				arr[i] = Long.parseLong(values2[i]);
			}
			String result = reverseSubarrs(arr, n, k);
			System.out.println(result);
		}

	}
	
	public static String reverseSubarrs(long[] arr, int n, int k) {
		StringBuffer sb = new StringBuffer();
		int prev=0;
		for(int i=k;i<=n;i=i+k) {
			int j=i;
			while(j>prev) {
				sb.append(arr[j-1]+ " ");
				j--;
			}
			prev=i;
		}
		if(prev<n) {
			int j=n;
			while(j>prev) {
				sb.append(arr[j-1]+ " ");
				j--;
			}
		}
		return sb.toString();
		
	}

}
