package org.dhananjay.programming;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		System.out.println("Please enter a number to search: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		BinarySearch ob = new BinarySearch();
		ob.bSearch(arr,x);

	}
	static void bSearch(int[] arr,int x) {
		int left=0, right=arr.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(x==arr[mid]) {
				System.out.println(x +" is found at " + mid + " index.");
				return;
			}
			else if(x<arr[mid]) {
				right=mid-1;
			}
			else
				left=mid+1;
		}
		System.out.println(x + " is not present in the array.");
	}

}
