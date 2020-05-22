Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1
/*packaged whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class gfgques8 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		while(m!=0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int arr_size = arr.length; 
            sort012(arr, arr_size); 
       
        printArray(arr, arr_size);
        
        m--;
		}
	}
		    
    
    static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int end = arr_size - 1; 
        int start = 0, temp = 0; 
        while (start <= end) { 
            switch (a[start]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[start]; 
                a[start] = temp; 
                lo++; 
                start++; 
                break; 
            } 
            case 1: 
                start++; 
                break; 
            case 2: { 
                temp = a[start]; 
                a[start] = a[end]; 
                a[end] = temp; 
                end--; 
                break; 
            } 
            } 
        } 
    } 
  
    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size) 
    { 
        int i; 
        for (i = 0; i < arr_size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    } 
  
} 
