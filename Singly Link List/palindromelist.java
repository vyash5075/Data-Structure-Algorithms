import java.util.*;
public class palindromelist {
   static class node
   {
       int data;
       node next;
   }
   static node head;
   public static node insert( node head,int data)
   {
       node temp=new node();
       temp.data=data;
       if(head==null)
       {
           head=temp;
       }
       else
       {
           node ptr=head;
           while(ptr.next!=null)
           {
               ptr=ptr.next;
           }
           ptr.next=temp;
       }
       return head;
   }
   public static void display(node head)
  {
       node p=head;
       while(p!=null)
       {
           System.out.print(p.data+"->");
           p=p.next;
       }
       System.out.println("");
   }
   public static int palindrome (node head,int n)
   {
      int flag=0;
        int mid=n/2;
        node p=head;
        while(mid!=0)
        {
            p=p.next;
            mid--;
        }
        node head2=p;
        node tem=head2;
        node prev=null;
        node next=null;
        while(tem!=null)
        {
            next=tem.next;
            tem.next=prev;
            prev=tem;
            tem=next;
        }
        head2=prev;
        node a=head;
        node b=head2;
        while(b!=null)
        {
            if(a.data==b.data)
            {
                a=a.next;
                b=b.next;
            }
            else
            {
               return flag=-1;
            }
            flag=1;
        }
        return flag;
       
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries in linklist");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           head=insert(head,sc.nextInt());
       }
       System.out.println("list is");
       display(head);
       int f=palindrome(head,n);
       if(f==-1)
       {
           System.out.println("list is not palindrome");
       }
       else
          
       {
           System.out.println("list is palindrome");
       }
   }
   
}
