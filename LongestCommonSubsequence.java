package org.dhananjay.programming;
import java.io.*;
public class LongestCommonSubsequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		String input2 = br.readLine();
		char[] x = input1.toCharArray();
		char[] y = input2.toCharArray();
		int m = x.length;
		int n = y.length;
		int count = lcs(x,y,m,n);
		System.out.println(count);
		br.close();

	}
	public static int lcs(char[] x, char[] y, int m, int n) {
		int[][] L = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0 || j==0)
					L[i][j]=0;
				else if(x[i-1]==y[j-1])
					L[i][j]=1+L[i-1][j-1];
				else
					L[i][j] = max(L[i-1][j], L[i][j-1]);
			}
		}
		return L[m][n];
	}
	
	public static int max(int a, int b) {
		return (a>b) ? a: b;
	}

}
