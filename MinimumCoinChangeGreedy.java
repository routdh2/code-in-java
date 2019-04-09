package org.dhananjay.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class MinimumCoinChangeGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> denoms = new ArrayList<Integer>(Arrays.asList(2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1));
		int sum = 43;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<denoms.size();i++) {
			if(sum >= denoms.get(i)) {
				int quotient = sum/denoms.get(i);
				map.put(denoms.get(i), quotient);
				sum=sum%denoms.get(i);
			}
		}
		map.forEach((key, value) -> {
			while(value-- > 0) {
				System.out.println(key);
			}
		});
//		denoms.forEach((item) -> {
//			if(sum >= item) {
//				int quotient = sum/item;
//				map.put(item, quotient);
//				sum = sum % item;
//			}
//		});
	}

}
