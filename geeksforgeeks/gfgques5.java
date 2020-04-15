Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on...

Note: O(1) extra space is allowed. Also, try to modify the input array as required.

Input:
First line of input conatins number of test cases T. First line of test case contain an integer denoting the array size N and second line of test case contain N space separated integers denoting the array elements.

Output:
Output the modified array with alternated elements.

Constraints:
1 <=T<= 100
1 <=N<= 107
1 <=arr[i]<= 107

Example:
Input:
2
6
1 2 3 4 5 6
11 
10 20 30 40 50 60 70 80 90 100 110

Output:
6 1 5 2 4 3
110 10 100 20 90 30 80 40 70 50 60
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class gfgques5 {
	public static void main (String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int m = Integer.parseInt(br.readLine());
          
        while(m!=0)
        {
            int n = Integer.parseInt(br.readLine());
            int arr[]=new int[n];
            
             String line = br.readLine(); 
			String[] strs = line.trim().split("\\s+"); 
            for (int j = 0; j < strs.length; j++)
            {
				arr[j] = Integer.parseInt(strs[j]);
            }
            // StringBuilder s=new StringBuilder();
            
            int start=0,end=n-1;
	     while(start<end)
	     {
	        System.out.print(arr[end--]+" "+arr[start++]+" ");
	      }
	      if(start==end)
	      {
	        System.out.print(arr[start]);
	      }
	    System.out.println();
	    m--;
	}
        }
    }

