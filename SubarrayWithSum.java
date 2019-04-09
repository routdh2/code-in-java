package org.dhananjay.programming;

public class SubarrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int sum = 13;
		
		findSubArrayOptimized(arr, sum);
		

	}
	//O(n2) solution
	public static void findSubArray(int[] arr, int sum) {
		for(int i=0;i<arr.length-1;i++) {
			int total=0;
			for(int j=i;j<arr.length;j++) {
				total+=arr[j];
				if(total==sum) {
					System.out.println("The values are ");
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k] + " ");
					}
					return;
				}
			}
		}
		System.out.println("No such subarray with given Sum");
	}
	
	public static void findSubArrayOptimized(int[] arr, int sum) {
		int total=0;
		int start=0;
		for(int i=0;i<=arr.length;i++) {
			while(total>sum && start<i) {
				total = total-arr[start];
				start++;
			}
			if(total==sum) {
				for(int j=start;j<i;j++) {
					System.out.print(arr[j] + " ");
				}
				//display start to i
				return;
			}
			if(i<arr.length)
			total+=arr[i];
			
		}
		System.out.println("No such subarray with given sum");
		
	}

}
