import java.util.*;
public class insertionending {
    
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
    public static insertionending insert (insertionending l1,int data)
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
    public static void display(insertionending l1)
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
        insertionending l1=new insertionending();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
   
    }
}