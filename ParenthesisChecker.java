package org.dhananjay.programming;
import java.io.*;
import java.util.*;
public class ParenthesisChecker {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
			String input = br.readLine();
			boolean isBalanced = findIfBalanced(input);
			if(isBalanced)
				System.out.println("balanced");
			else
				System.out.println("not balanced");
		}
	}
	
	public static boolean findIfBalanced(String input) {
		Stack<Character> stack = new Stack<Character>();
		char[] ch_arr = input.toCharArray();
		for(int i=0;i<ch_arr.length;i++) {
			if(ch_arr[i]=='(' || ch_arr[i]=='{' || ch_arr[i]=='[') {
				stack.push(ch_arr[i]);
			}
			else if(ch_arr[i]==')' || ch_arr[i]=='}' || ch_arr[i]==']') {
				if(stack.isEmpty())
					return false;
				
				else if(!stack.isEmpty()) {
					char c = stack.pop();
					if(isMatchingPair(c, ch_arr[i]))
						continue;
					else
						return false;
				}
				
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}
	
	public static boolean isMatchingPair(char c1, char c2) {
		if(c1=='(' && c2==')')
			return true;
		else if(c1=='{' && c2=='}')
			return true;
		else if(c1=='[' && c2==']')
			return true;
		else
			return false;
	}

}
