package org.dhananjay.programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Comparator;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,1,7,2,4,2};
		removeDups(arr);
		Arrays.sort(arr, new Comparator<int>() {
			public int compare(Integer a,Integer b) {
				return a.compareTo(b);
			}
		});

	}
	
	public static void removeDups(int[] arr) {
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		//traverse through hm
		map.forEach((key, value) -> System.out.println(key + " " + value));
		
		map.forEach((key,value) -> {
			if(value>1) {
				System.out.println(key);
			}
		});
		
	}

}

