package org.dhananjay.programming;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInAnArray {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			String input = br.readLine();
			String[] values = input.trim().split("\\s+");
			for(int i=0;i<values.length;i++) {
				arr[i]= Integer.parseInt(values[i]);
			}
			List<Integer> list = findLeaders(arr, n);
			StringBuffer sb = new StringBuffer();
			list.forEach((item) -> {
				sb.append(item+ " ");
			});
			System.out.println(sb.toString());
		}

	}
	//Leaders are those values which are greater than all its right elements
	public static List<Integer> findLeaders(int[] arr, int n) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[n-1]);
		int lastLeader = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=lastLeader) {
				list.add(arr[i]);
				lastLeader = arr[i];
			}
		}
		Collections.reverse(list);
		return list;
		
	}

}
