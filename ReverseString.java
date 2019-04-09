package org.dhananjay.programming;

public class ReverseString {

	public static void main(String[] args) {
		String input = "practice makes perfect";
		char[] arr = input.toCharArray();
//		System.out.println(new String(reverse(arr, i, j)));
		arr = reverse(arr, 0, arr.length-1);
		int start=0, stop=0;
		for(int i=0;i<arr.length;i++) {
			if(Character.isWhitespace(arr[i]))  {
				stop=i-1;
				arr=reverse(arr, start, stop);
				start=i+1;
			} else if(i==arr.length-1) {
				stop=i;
				arr=reverse(arr, start, stop);
			}
		}
//		System.out.println(input);
//		while(i<j) {
//			char tmp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=tmp;
//			i++;
//			j--;
//		}
		System.out.println(new String(arr));
	}
	
	public static char[] reverse(char[] arr, int left, int right) {
		for(int i=left, j=right;i<j;i++,j--) {
			char tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
		return arr;
	}

}
