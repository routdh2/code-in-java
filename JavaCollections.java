package org.dhananjay.programming;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class JavaCollections {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,5};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i : arr) {
			set.add(i);
		}
		set.forEach((a) -> System.out.print(a));
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			Integer a = itr.next();
			
		}
	}
		
}
