package org.dhananjay.programming;
import java.io.*;
import java.util.Arrays;
public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String input = br.readLine();
			String[] values = input.trim().split("\\s+");
			for(int i=0;i<values.length;i++) {
				arr[i]= Integer.parseInt(values[i]);
			}
			int result = findMaxSumIncrSubseq(arr,n);
			System.out.println(result);
		}

	}
	
	public static int findMaxSumIncrSubseq(int[] arr, int n) {
		int[] cache = new int[n];
		//basecases
		if(n==0)
			return 0;
		if(n==1)
			return arr[0];
		for(int i=0;i<n;i++)
			cache[i]=arr[i];
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					cache[i]=Math.max(cache[i], cache[j]+arr[i]);
				}
			}
		}
		return Arrays.stream(cache).max().getAsInt();
	}

}
