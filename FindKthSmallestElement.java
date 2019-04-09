package org.dhananjay.programming;
import java.io.*;
public class FindKthSmallestElement {

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
				arr[i] = Integer.parseInt(values[i]);
			}
			int k = Integer.parseInt(br.readLine());
			int result = findKthMin(arr, 0, n-1, k);
			System.out.println(result);
		}

	}
	public static int findKthMin(int[] arr, int left, int right, int k) {
		if(left<right) {
			int pivot = partition(arr, left, right);
			if(k==(pivot+1))
				return arr[k-1];
			else if(k<(pivot+1))
				return findKthMin(arr, left, pivot-1, k);
			else
				return findKthMin(arr, pivot+1, right, k);
		}
		else
			return arr[left];
	}
	
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i=left;
		int j=right;
		while(i<j) {
			while(arr[i]<pivot)
				i++;
			while(j>0 && arr[j]>=pivot)
				j--;
			if(i!=j && i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp = arr[i];
		arr[i]=arr[right];
		arr[right]=temp;
		return i;
	}

}
