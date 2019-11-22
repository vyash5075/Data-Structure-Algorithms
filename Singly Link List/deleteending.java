import java.util.*;
public class deleteending {
    static class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
        }
    }
    static node head;
    public static deleteending insert(deleteending d,int data)
    {
        node temp=new node(data);
        if(d.head==null)
        {
            d.head=temp;
        }
        else
        {
          node t=d.head;
          while(t.next!=null)
          {
              t=t.next;
          }
          t.next=temp;
        }
        return d;
    }
    public static deleteending delete(deleteending d)
    {
        if(d.head==null)
        {
            System.out.println("empty list");
        }
        else if(d.head.next==null)
        {
            d.head=null;
        }
        else
        {
            node ptr=d.head;
            node prev=d.head;
            while(ptr.next!=null)
            {
                prev=ptr;
                ptr=ptr.next;
            }
            prev.next=null;
            ptr=null;
        }
        return d;
    }
    public static void display(deleteending d)
    {
        node ptr=d.head;
      while(ptr!=null)
      {
          System.out.print(ptr.data+"->");
          ptr=ptr.next;
      }
      System.out.println("");
    }
    public static void main(String args[])
    {
        deleteending d=new deleteending();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(d,sc.nextInt());
        }
        display(d);
        delete(d);
        System.out.println("after deletion");
        display(d);
    }
}
