package org.dhananjay.programming;

public class NthMinimum {
	
	public static void main(String args[]) {
		int[] arr = {2,6,4,9,8,1};
//		System.out.println(find2ndMin(arr));
		System.out.println(findNthMin(arr, 0, (arr.length)-1, 6));
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	public static int find2ndMin(int[] arr) {
		int min=arr[0];
		int min2=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min2=min;
				min=arr[i];
			} else if(arr[i]<min2) {
				min2=arr[i];
			}
		}
		return min2;
	}
	public static int findNthMin(int[] arr,int left, int right, int n) {
//		int left=0, right=arr.length-1;
		if(left<right) {
			int pivot = partition(arr, left, right);
			if((n-1)==pivot) {
				return arr[pivot];
			}
			else if(pivot>(n-1)) {
				return findNthMin(arr, left, pivot-1, n);
			}
			else
				return findNthMin(arr, pivot+1, right, n);
		}
		return arr[left];
	}
	public static int partition(int[] arr, int left, int right) {
		int pivot=arr[right];
		int i=left, j=right;
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
