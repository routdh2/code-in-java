package org.dhananjay.programming;
import java.io.*;
public class MaximumOfAllSubarraysOfSizeK {

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
			int[] arr = new int[n];
			String input2 = br.readLine();
			String[] values2 = input2.trim().split("\\s+");
			for(int i=0;i<values2.length;i++) {
				arr[i]=Integer.parseInt(values2[i]);
			}
			String result = findMaxSubarrsSizeK(arr, n, k);
			System.out.println(result);
		}

	}
	
	public static String findMaxSubarrsSizeK(int[] arr, int n, int k) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<=n-k;i++) {
			int max = Integer.MIN_VALUE;
			for(int j=0;j<k;j++) {
				if(arr[i+j]>max) {
					max=arr[i+j];
				}
			}
			sb.append(max+ " ");		
		}
		return sb.toString();
	}

}
