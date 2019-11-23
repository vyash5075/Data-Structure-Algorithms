import java.util.*;
public class rotation {
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
        node ptr=head;
        node prev=head;
        
        while(m!=0)
        {
            prev=ptr;
            ptr=ptr.next;
            m--;
        }
        
        node t=head;
        while(t.next!=null)

        {
            t=t.next;
        }
        prev.next=null;
        t.next=head;
        head=ptr;
        
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
        System.out.println("enter the kth node from where u want to do rotation");
        int m=sc.nextInt();
        if(m<=n)
        {
            head=rotate(head,m);
            display(head);
        }
        else{
            System.out.println("invalid input");
        }
    }
}
