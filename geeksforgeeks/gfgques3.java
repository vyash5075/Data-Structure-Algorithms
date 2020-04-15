Given an array arr[] of positive integers of size N. Reverse every sub-array of K group elements.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of two lines of input. The first line of each test case consists of an integer N(size of array) and an integer K separated by a space. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each test case, print the modified array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N, K ≤ 107
1 ≤ A[i] ≤ 1018

Example:
Input
2
5 3
1 2 3 4 5
6 2
10 20 30 40 50 60

Output
3 2 1 5 4
20 10 40 30 60 50
import java.util.*;
import java.lang.*;
import java.io.*;

class gfgques3 {
	public static void main (String[] args) throws IOException{
	  BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(s.readLine());
	  while(t-->0){
	      String[] in=s.readLine().split(" ");
	      int n = Integer.parseInt(in[0]);
	      int k = Integer.parseInt(in[1]);
	      int[] arr = new int[n];
	      String[] str=s.readLine().split(" ");
	      for(int i=0;i<n;i++)
	          arr[i]=Integer.parseInt(str[i]);
	      solve(arr,n,k);
	      StringBuilder sb = new StringBuilder("");
	      for(int i=0;i<n;i++)
	        sb.append(arr[i]+" ");
	      System.out.println(sb.toString());
	  }
	}
	
	public static void solve(int[] arr, int n, int k){
	    if(arr==null || arr.length==0) return;
	    for(int i=0;i<n;i=i+k){
	        int l=i;
	        int r = Math.min(i+k-1,n-1);
	        reverse(arr,l,r);
	    }
	}
	
	public static void reverse(int[] arr, int l, int r){
	    while(l<r ){
	        int temp = arr[r];
	        arr[r]=arr[l];
	        arr[l]=temp;
	        r--;l++;
	    }
	}
}