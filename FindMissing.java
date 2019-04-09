package org.dhananjay.programming;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,4,5,6};
		int[] arr2 = {2,3,6,5,4,7};
		System.out.println(findMissing(arr1, arr2));
		Arrays.parallelSort(arr2);
		display(arr2);
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void mergeTwoArrays(int[] arr1, int[] arr2) {
		List list = new ArrayList<>(Arrays.asList(arr1));
		list.addAll(Arrays.asList(arr2));
		Object[] new_list = list.toArray();
		System.out.print(Arrays.toString(new_list));
	}
	
	public static int findMissing(int[] arr1, int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		int[] arr3= new int[n1+n2];
		int k=0;
		for(int i=0;i<n1;i++) {
			arr3[k++]=arr1[i];
		}
		for(int i=0;i<n2;i++) {
			arr3[k++]=arr2[i];
		}
//		List<Object> arr3 = new ArrayList<>();
//		Collections.addAll(arr3, arr1);
//		Collections.addAll(arr3, arr2);
		int result=0;
		for(int i=0;i<arr3.length;i++) {
			result = result^arr3[i]; 
		}
		return result;	
	}

}
