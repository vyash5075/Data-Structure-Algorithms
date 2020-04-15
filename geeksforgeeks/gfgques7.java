Given an array of positive integers. The task is to find inversion count of array.

Inversion Count : For an array, inversion count indicates how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, the size of array. The second line of each test case contains N elements.

Output:
Print the inversion count of array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ C ≤ 1018

Example:
Input:
1
5
2 4 1 3 5

Output:
3



import java.util.*;
public class gfgques7{
public static void main (String[] args)
	 {
	 //code
	 Scanner s=new Scanner(System.in);
	 int T=s.nextInt();
	 for(int i=0;i<T;i++)
	 {
	     int n=s.nextInt();
	     int[] arr=new int[n];
	     for(int j=0;j<n;j++)
	     {
	         arr[j]=s.nextInt();
	     }
	     count=0;
	     int[] ans=mergesort(arr,0,n-1);
	     System.out.println(count);
	 }
	 }
	 
	 static long count=0;
	
	public static int[] mergesort(int[] arr,int low,int high)
	{
		if(low==high)
		{
			int[] base=new int[1];
			base[0]=arr[low];
			return base;
		}
		int mid=(low+high)/2;
		int[] one=mergesort(arr,low,mid);
		int[] two=mergesort(arr,mid+1,high);
		int[] ans=merge(one,two);
		return ans;
	}
	
	public static int[] merge(int[] one,int[] two)
	{
		int i=0;
		int j=0;
		int k=0;
		int[] ans=new int[one.length+two.length];
		while(i<one.length&&j<two.length)
		{
			if(one[i]<=two[j])
			{
				ans[k]=one[i];
				k++;
				i++;
			}
			else
			{
				ans[k]=two[j];
				k++;
				j++;
				count=count+one.length-i;
			}
		}
		while(i<one.length)
		{
			ans[k]=one[i];
			i++;
			k++;
		}
		while(j<two.length)
		{
			ans[k]=two[j];
			j++;
			k++;
		}
		return ans;
	}
}