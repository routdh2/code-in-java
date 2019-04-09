package org.dhananjay.programming;
import java.io.*;
import java.util.Arrays;
public class TrappingRainWater {

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
			int result = findTrappingAmt(arr, n);
			System.out.println(result);
		}
		

	}
	
	public static int findTrappingAmt(int[] arr, int n) {
		int[] leftMax = new int[n];
		leftMax[0]=arr[0];
//		leftMax[1] = arr[1];
		for(int i=1;i<n;i++) {
			leftMax[i]=Math.max(leftMax[i-1], arr[i-1]);
		}
		int[] rightMax = new int[n];
		rightMax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], arr[i+1]);
		}
		int[] result = new int[n];
		Arrays.fill(result, 0);
		for(int i=1;i<n-1;i++) {
			int item = arr[i];
			int maxLeft = leftMax[i];
			int maxRight = rightMax[i];
			if(item<maxLeft && item<maxRight) {
				int minHeight = Math.min(maxLeft, maxRight);
				int diff = minHeight-item;
				result[i]=diff;
			}
		}
		return Arrays.stream(result).sum();
	}
}
