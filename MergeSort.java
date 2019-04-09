package org.dhananjay.programming;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,5,4,3,2};
		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			sort(arr, left, mid);
			sort(arr, mid+1, right);
			merge(arr, left, mid, right);
		}
	}
	
	static void merge(int[] arr, int left, int mid, int right) {
		int[] copy = new int[arr.length];
		int k=left;
		int i,j;
		for(i=left,j=mid+1;i<=mid && j<=right;) {
			if(arr[i]<arr[j]) {
				copy[k++]=arr[i++];
			}
			else if(arr[j]<arr[i]) {
				copy[k++]=arr[j++];
			}
		}
		while(i<=mid)
			copy[k++]=arr[i++];
		while(j<=right)
			copy[k++]=arr[j++];
		for(int a=left;a<=right;a++) {
			arr[a]=copy[a];
		}
	}
//	static void merge(int[] arr, int left, int mid, int right) {
//		int n1=mid-left+1;
//		int n2=right-mid;
//		
//		int[] leftArray = new int[mid-left+1];
//		int[] rightArray = new int[right-mid];
//		//copy the contents to subarray
//		for(int i=0;i<=mid;i++) {
//			leftArray[i]=arr[left+i];
//		}
//		for(int i=0;i<=right;i++) {
//			rightArray[i]=arr[mid+1+i];
//		}
//		//compare and merge
//		for(int i=)
//	}

}
