package org.dhananjay.programming;
import java.io.*;
import java.util.Arrays;
public class LongestIncreasingSubsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(n);
			int[] arr = new int[n];
			String input = br.readLine();
			String[] values = input.trim().split("\\s+");
			for(int i=0;i<values.length;i++) {
				arr[i] = Integer.parseInt(values[i]);
			}
			int result = findLIS(arr, n);
			System.out.println(result);
		}
	}
	
	public static int findLIS(int[] arr, int n) {
		int[] cache = new int[n];
		Arrays.fill(cache, 1);
		System.out.println(Arrays.toString(cache));
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
//					System.out.println(arr[i] + " " + arr[j]);
					cache[i] = Math.max(cache[i], cache[j]+1);
//					cache[i]=cache[j]+1;
					System.out.print(Arrays.toString(cache));
				}
			}
			System.out.println();
		}
		return Arrays.stream(cache).max().getAsInt();
	}

}
