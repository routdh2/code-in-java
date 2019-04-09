package org.dhananjay.programming;

import java.io.*;
public class CountingSort {

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
				arr[i]=Integer.parseInt(values[i]);
			}
			arr = countSort(arr, n);
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<n;i++) {
				sb.append(arr[i]+ " ");
			}
			System.out.println(sb);
		}
		br.close();
	}
	
	public static int[] countSort(int[] arr, int length) {
		int[] temp = new int[3];
		for(int i=0;i<3;i++)
			temp[i]=0;
		for(int i=0;i<length;i++) {
			temp[arr[i]]++;
		}
		int k=0;
		for(int i=0;i<3;i++) {
			while(temp[i]-->0) {
				arr[k++]=i;
			}
		}
		return arr;
	}

}
