package singlylinklist;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class pairsum {
    static  class node{
        int data;
        node prev;
        node next;
    
    node(int d)
    {
        this.data=d;
        next=null;
        prev=null;
    }
}
    
    static node head;
    public static node insert(int item)
    {
        node temp=new node(item);
        if(head==null)
        {
            head=temp;
        }
        else{
            node p=head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
            temp.prev=p;
        }
        return head;
    }
    public static void display()
    {
        if(head!=null)
        {
           node p=head;
           while(p!=null)
           {
               System.out.println(p.data);
              p=p.next;
           }
           
        }
    }
    public static void pairsum(int n,int item)
    {
        int a=1;
        int b=n;
        node pre=head;
        node post=head;
        while(post.next!=null)
        {
            post=post.next;
        }
        while(a<b)
        {
            int total=pre.data+post.data;
            if(total>item)
            {
                 b--;
                post=post.prev;  
            }
            if(total<item)
            {
                a++;
                pre=pre.next;
            }
            else if(total==item)
            {
                System.out.println(pre.data+" ,"+post.data);
                pre=pre.next;
                a++;
            }
       
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of enteries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
        System.out.println("list is");
        display();
        System.out.println("enter the no.");
        int numb=sc.nextInt();
        pairsum(n,numb);
                }
}
