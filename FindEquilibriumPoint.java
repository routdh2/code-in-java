package org.dhananjay.programming;

import java.io.*;
public class FindEquilibriumPoint {

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
			int index = findEquilibrium(arr, n);
			System.out.println(index);
		}

	}
	
	public static int findEquilibrium(int[] arr, int length) {
		if(length==1)
			return 1;
		else if(length==2)
			return -1;
		else {
			int sum=0;
			int leftSum=0;
			for(int i=0;i<length;i++)
				sum+=arr[i];
			for(int i=0;i<length;i++) {
				sum=sum-arr[i];//rightSum
				if(leftSum==sum)
					return i;
				leftSum=leftSum+arr[i];
			}
			
			
			
			
			
//			for(int i=1;i<length-1;i++) {
//				int leftSum = findSum(arr, 0, i-1);
//				int rightSum = findSum(arr, i+1, length-1);
//				if(leftSum==rightSum)
//					return i+1;
//			}
		}
		return -1;
	}
	
	public static int findSum(int[] arr, int left, int right) {
		int sum=0;
		if(left==right)
			return arr[left];
		else {
			for(int i=left;i<=right;i++) {
				sum+=arr[i];
			}
		}
		return sum;
	}

}
