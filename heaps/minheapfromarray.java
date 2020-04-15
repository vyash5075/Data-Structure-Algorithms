/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class minheapfromarray {
      public static void buildheap(int arr[],int n)
    {
        int lastparent=n/2-1;
        for(int i=lastparent;i>=0;i--)
        {
           minheapify(arr,n,i);  
        }
       
    }
    public static void minheapify(int arr[],int n,int i)
    {
        int parent=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n&&arr[left]<arr[parent])
        {
            parent=left;
        }
        if(right<n&&arr[right]<arr[parent])
        {
            parent=right;
        }
        if(parent!=i)
        {
            int temp=arr[i];
            arr[i]=arr[parent];
            arr[parent]=temp;
            minheapify(arr,n,parent);
        }
    }
    public static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        buildheap(arr,n);
        print(arr,n);
    }
    
}
