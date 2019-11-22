import java.util.*;
public class deleteanywhere {
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
    public static  deleteanywhere insert ( deleteanywhere l1,int data)
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
    public static void display( deleteanywhere l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static   deleteanywhere deletepos( deleteanywhere l1,int pos,int n)
    {
        if(pos==0)
        {
            node temp=l1.head;
            l1.head=temp.next;
            temp.next=null;
        }
        if(pos>0&&pos<n-1)
        {
            node ptr=l1.head;
            node prev=l1.head;
            while(pos!=0)
            {
                prev=ptr;
                ptr=ptr.next;
                pos--;
            }
            prev.next=ptr.next;
            ptr.next=null;
        }
        if(pos==n-1)
        {
            node t=l1.head;
            node t2=l1.head;
            while(t.next!=null)
            {
                t2=t;
                t=t.next;
            }
            t2.next=null;
        }
        else
        {
            System.out.println("invalid position");
        }
        return l1;
    }
    public static void main(String args[])
    {
        deleteanywhere l1=new deleteanywhere();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
       System.out.println("ente the position u want to delete");
       int pos=sc.nextInt();
       deletepos(l1,pos,n);
   display(l1);
    }
}
