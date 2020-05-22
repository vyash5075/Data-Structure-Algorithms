import java.lang.*;
Given an array A of N positive numbers. The task is to find the position where equilibrium first occurs in the array. Equilibrium position in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. First line of each test case contains an integer N denoting the size of the array. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new  line print the position at which the elements are at equilibrium if no equilibrium point exists print -1.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example:
Input:
2
1
1
5
1 3 5 2 2

Output:
1
3



import java.util.*;
import java.lang.*;
import java.io.*;
class gfgques9  { 
    public static void main (String[] args) throws IOException {
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		while(testCase-- > 0){
		    int sz = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[sz];
		    int sum=0, leftsum=0;
		    boolean printLast = true;
		    String input[] = br.readLine().trim().split(" ");
		    
		    for(int i = 0 ; i < sz ; i++){
		        arr[i] = Integer.parseInt(input[i]);
		        sum = sum + arr[i];
		    }
        
        int arr_size = arr.length; 
        System.out.println(equilibrium(arr, arr_size)); 
    } 
}
public static int equilibrium(int arr[], int n) 
    { 
        int sum = 0;
        /* Find sum of the whole array */
        for (int i = 0; i < n; ++i) 
            sum += arr[i]; 
  
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i];  
  
            if (leftsum == sum) 
                return i+1; 
  
            leftsum += arr[i]; 
        } 
  
        /* If no equilibrium index found, then return 0 */
        return -1; 
    } 
}
  