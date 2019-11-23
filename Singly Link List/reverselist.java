import java.util.*;
public class reverselist {
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
    public static reverselist  insert(reverselist l1,int data)
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
     public static void display(reverselist l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
     public static reverselist reverse(reverselist l1)
     {
         node temp=l1.head;
         node prev=null;
         node next=null;
         while(temp!=null)
         {
             next=temp.next;
             temp.next=prev;
             prev=temp;
             temp=next;
         }
         l1.head=prev;
         return l1;
     }
    public static void main(String args[])
    {
        reverselist l1=new reverselist();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
              System.out.println("After reverse");

   reverse(l1);
   display(l1);
    }
}
