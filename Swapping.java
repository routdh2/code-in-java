package org.dhananjay.programming;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int temp = arr[1];
		arr[1]=arr[2];
		arr[2]=temp;
		for(int i=0;i<4;i++) {
			System.out.print(arr[i] + " ");
		}

	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
