import java.util.*;
public class heap {
    public static void buildheap(int arr[],int n)
    {
        int len=(n/2)-1;
        for(int i=len;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
    public static void heapify(int arr[],int n,int i)
    {
        int largest=i;
        int l=(2*i)+1;
        int r=(2*i)+2;
        if(l<n&&arr[l]>arr[largest])
        {
            largest=l;
        }
        if(r<n&&arr[r]>arr[largest])
        {
            largest=r;
        }
        if(largest!=i)
        {
            int swap=arr[largest];
            arr[largest]=arr[i];
            arr[i]=swap;
            heapify(arr,n,largest);
            
        }
        
    }
    public static  void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" kd");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        buildheap(arr,n);
        print(arr);
    }
}
