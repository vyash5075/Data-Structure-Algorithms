import java.util.*;
public class merging {
   static  class node{
        int data;
        node next;
    }
    static node head1;
    static node head2;
    static node head3;
    public static node insert(node head1,int data)
    {
         node temp=new node();
        temp.data=data;
        temp.next=null;
        if(head1==null)
        {
            head1=temp;
        }
        else
        {
            node p=head1;
            while (p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        return head1;
    }
    public static node insert2(node head2,int data)
    {
        node temp=new node();
        temp.data=data;
        temp.next=null;
        if(head2==null)
        {
            head2=temp;
        }
        else
        {
            node p=head2;
            while (p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        return head2;
    }
    public static void display(node head1)
    {
        node p=head1;
        while(p!=null)
        {
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.println("");
    }
     public static void display2(node head2)
    {
        node p=head1;
        while(p!=null)
        {
            System.out.print(p.data+"->");
            
            p=p.next;
        }
        System.out.println("");
    }
     
     
     
     public static node merging(node a,node b)
     {
          node temp = new node();
    node finalList = temp;
    
    while(a != null && b != null) {
      if(a.data < b.data) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    temp.next = (a == null) ? b : a;
    return finalList.next;
     }
     
     
      public static void display3(node head3)
    {
        node q=head3;
        while(q!=null)
        {
            System.out.print(q.data+"->");
            q=q.next;
        }
        System.out.println("");
    }
     
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the no. of entries");
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             head1=insert(head1,sc.nextInt());
         }
         display(head1);
           System.out.println("enter the no. of entries of 2nd list");
          int m=sc.nextInt();
         for(int i=0;i<m;i++)
         {
             head2=insert(head2,sc.nextInt());
         }
         display(head2);
         head3=merging(head1,head2);
         System.out.println("link list after merging");
         display3(head3);
     }
    
}
