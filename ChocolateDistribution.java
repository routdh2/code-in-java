package org.dhananjay.programming;
import java.io.*;
import java.util.Arrays;
public class ChocolateDistribution {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String input = br.readLine();
			String[] values = input.trim().split("\\s+");
			for(int i=0;i<values.length;i++) {
				arr[i]=Integer.parseInt(values[i]);
			}
			int m = Integer.parseInt(br.readLine());
			int result = findMinChocDist(arr, n, m);
			System.out.println(result);
		}
	}
	
	public static int findMinChocDist(int[] arr, int n, int m) {
		Arrays.sort(arr);
		int left=0;
		int right=m-1;
		int min = Integer.MAX_VALUE;
		while(right<n) {
			int diff = arr[right]-arr[left];
			if(diff<min)
				min=diff;
			left++;
			right++;
		}
		return min;
	}

}
