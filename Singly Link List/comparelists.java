import java.util.*;
public class comparelists {
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
     
     public static int compare(node head1,node head2)
     {
         if(head1==null&&head2==null)
         {
             return 1;
         }
         
          while(head1!=null&&head2!=null && head1.data==head2.data)
         {
             head1=head1.next;
             head2=head2.next;
         } 
          if(head1!=null &&head2!=null&&head1.data>head2.data)
          {
              return 1;
          }
          if(head1!=null &&head2!=null&&head1.data<head2.data)
          {
              return - 1;
          }
         
         else if(head1!=null&&head2==null)
         {
             return 1;
         }
          else if(head1==null&&head2!=null)
         {
             return -1;
         }
         
         return 0;
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
         int value=compare(head1,head2);
         if(value==0)
         {
         System.out.println( "value is "+value+" ,which shows both lists are same");
         }
         if(value==-1)
         {
             System.out.println( "value is "+value+" ,not same , list2 is greater than list1 ");
         }
         else{
              System.out.println( "value is "+value+" ,not same , list1 is greater than list2 ");
         }      
} 
}
