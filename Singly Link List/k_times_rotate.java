import java.util.*;
public class k_times_rotate {
     static class node{
    int data;
    node next;
    
   }
   static node head;
    public static node insert(node head,int data)
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
    public static node rotate(node head,int m)
    {
        while(m!=0)
        {
            node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next.next=head;
            head=temp.next;
            temp.next=null;
            m--;
        }
        return head;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entr the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            head=insert(head,sc.nextInt());
        }
        System.out.println("current linklist is");
        display(head);
        System.out.println("enter the kth time for rotation");
        int m=sc.nextInt();
       
            head=rotate(head,m);
            display(head);
        }
        
    }
    

