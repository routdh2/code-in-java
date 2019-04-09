package org.dhananjay.programming;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,6,5,4,3,2,1};
		int n = arr.length;
		HeapSort ob = new HeapSort();
		ob.sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	static void sort(int[] arr) {
		int n = arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(arr, n, i);
		}
		for(int i=n-1;i>0;i--) {
			//swap first element with last
			int temp = arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			heapify(arr, i, 0);
		}
	}
	//heapify a node with index i
	static void heapify(int[] arr, int n, int i) {
		int root = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[root]<arr[left])
			root=left;
		if(right<n && arr[root]<arr[right])
			root=right;
		if(root!=i) {
			//swap arr[i] and arr[root]
			int temp = arr[i];
			arr[i]=arr[root];
			arr[root]=temp;
			
			heapify(arr, n, root);
		}
	}

}
