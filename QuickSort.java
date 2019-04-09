package org.dhananjay.programming;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,5,4,3,2};
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int pivot = partition(arr, left, right);
			sort(arr, left, pivot-1);
			sort(arr, pivot+1, right);
		}
	}
	static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
//		int pivot=right;
		int i,j;
		for(i=left,j=right-1;i<j;) {
			while(arr[i]<pivot)
				i++;
			while(j>=0 && arr[j]>pivot)
				j--;
			if(i!=j && i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
//				i++;
//				j--;
			}
			
		}
		int temp = arr[i];
		arr[i]=arr[right];
		arr[right]=temp;
		return i;
	}

}
