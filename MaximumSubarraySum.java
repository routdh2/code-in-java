package org.dhananjay.programming;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,-2,5};
		int length = arr.length;
		int maxSum = findMaxByKadane(arr, length);
		System.out.println(maxSum);

	}
	public static int findMaxSubArrSum(int[] arr, int length) {
		int max = arr[0];
		int sum=0;
		for(int i=0;i<length;i++) {
			sum=arr[i];
			if(sum>max)
				max=sum;
			for(int j=i+1;j<length;j++) {
				sum+=arr[j];
				if(sum>max) {
					max=sum;
				}
			}
		}
		return max;
	}
	public static int findMaxByPrefixSum(int[] arr, int length) {
		int[] temp = new int[length];
		int sum=0;
		for(int i=0;i<length;i++) {
			sum+=arr[i];
			temp[i]=sum;
		}
		int max=temp[0];
		for(int i=0;i<length;i++) {
			if(temp[i]>max)
				max=temp[i];
		}
		return max;
	}
	public static int findMaxByKadane(int[] arr, int length) {
		int max_ending=arr[0];
		int max_so_far = arr[0];
		for(int i=1;i<length;i++) {
			max_ending+=arr[i];
			if(arr[i]>max_ending) {
				max_ending=arr[i];
			}
			if(max_so_far<max_ending)
				max_so_far=max_ending;
		}
		return max_so_far;
	}

}
