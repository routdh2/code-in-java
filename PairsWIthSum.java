package org.dhananjay.programming;

public class PairsWIthSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,1,1,2,4,4,2,3,5,6,8,3};
		int k = 5;
		findPairsWithSum(arr, k);

	}
	//bruteforce solution O(n2)
	//works for duplicates also since we discard any duplicates
	public static void findPairsWithSum(int[] arr, int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=-1) {
			for(int j=i+1;j<arr.length && arr[j]!=-1;j++) {
				int sum = arr[i]+arr[j];
				if(sum==k) {
					System.out.print("{ "+ arr[i] + ", "+ arr[j]+" }");
					System.out.println();
					arr[j]=-1;
					break;
				}
			}
			}
		}
	}

}
