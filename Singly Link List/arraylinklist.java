import java.util.*;
public class arraylinklist {
     static class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            next=null;
        }
    }
     static node head;
public static arraylinklist insert (arraylinklist l1,int data)
    {
        node temp=new node(data);
        if(l1.head==null)
        {
            l1.head=temp;
        }
        else
        {
          node t=l1.head;
          while(t.next!=null)
          {
              t=t.next;
          }
          t.next=temp;
        }
        return l1;
    }
    public static void display(arraylinklist l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
      arraylinklist l1=new arraylinklist();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<arr.length;i++)
       {
          arr[i]=sc.nextInt();
       }
       
       System.out.println("array is");
       for(int i=0;i<arr.length;i++)
       {
           System.out.print(arr[i]);
       }
       System.out.println("");
       for(int i=0;i<arr.length;i++)
       {
           insert(l1,arr[i]);
       }
       System.out.println("link list formed from array is");
       display(l1);
   
    }
}
