package org.dhananjay.programming;
import java.io.*;
public class StockBuyAndSell {

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
			int maxProfit = findMaxProfit(arr, n);
			System.out.println(maxProfit);
		}
		
	}
	//This is for buying and selling once O(n2) approach
	public static int findMaxProfit(int[] arr, int n) {
		
		int[] cached = new int[n];
		int maxProfit=0;
		int cpIndex=0, spIndex=0;
		for(int i=0;i<n-1;i++) {
			int cp = arr[i];
			for(int j=i+1;j<n;j++) {
				if(arr[j]>cp) {
					int profit = arr[j]-cp;
					if(profit>maxProfit) {
						maxProfit=profit;
						cpIndex=i;
						spIndex=j;
					}
				}
			}
		}
		System.out.println(arr[cpIndex] + " "+ arr[spIndex]);
		return maxProfit;
	}

}
