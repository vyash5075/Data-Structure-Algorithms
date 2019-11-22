import java.util.*;
public class insertanywhere {
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
     public static insertanywhere insert(insertanywhere  l1,int data)
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
     
     
    public static void display(insertanywhere  l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static insertanywhere insertany(insertanywhere l1,int data,int pos,int n)
    {
        node temp=new node(data);
        if(pos==0)
        {
            temp.next=l1.head;
            l1.head=temp;
        }
        else if(pos<n)
        {
            node ptr=l1.head;
        node prev=l1.head;
            while(pos!=0)
            {
                prev=ptr;
                ptr=ptr.next;
                pos--;
            }
            prev.next=temp;
            temp.next=ptr;
        }
        else if(pos==n)
        {
            node p=l1.head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        if(pos>n)
        {
            System.out.println("invalid position");
        }
        return l1;
    }
    public static void main(String args[])
    {
        insertanywhere  l1=new insertanywhere ();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
       System.out.println("enter the data u want to insert nywhere");
       int data=sc.nextInt();
       System.out.println("enter the position");
       int pos=sc.nextInt();
       insertany(l1,data,pos,n);
       display(l1);
    }
}
