package ds1;
import java.util.*;
public class linklistpractice {
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
    public static node insert(int data)
    {
        node temp=new node(data);
        if(head==null)
        {
            head=temp;
        }
        else
        {
          node t=head;
          while(t.next!=null)
          {
              t=t.next;
          }
          t.next=temp;
        }
        return head;
    }
    public static void display(){
        node p=head;
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
    }
    public static node deleteitem(int item,int n)
    {
        int count=0;
        int pos=0;
        node p=head;
        if(head.data==item)
        {
            System.out.println("item is present");
            count=1;
        }
        while(p.data!=item&&p!=null)
        {
           
               p=p.next;
               pos++;
            
        }
        if(p.data==item)
        {
            count=1;
        }
            
        if(count==1)
        {
          deletekaroitem(item,pos,n);  
        }
        return head;
    }
    public static node deletekaroitem(int item,int pos,int n)
    {
         if(pos==0)
        {
            node temp=head;
           head=temp.next;
           temp.next=null;
           temp=null;
        }
        else if(pos<n)
        {
            node prev=head;
            node ptr=head;
            while(pos!=0)
            {
                prev=ptr;
                ptr=ptr.next;
                pos--;
            }
            prev.next=ptr.next;
            ptr.next=null;
            ptr=null;
        }
        else{
           node prev=head;
            node ptr=head;
            while(ptr.next!=null)
            {
                prev=ptr;
                ptr=ptr.next;
                
            }
            prev.next=null;
            ptr=null;
        }
         System.out.println("item deleted Successfully");
        return head;
        
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           insert(arr[i]);
       }
       display();
     System.out.println("enter the item you want to delete");
   
    int item=sc.nextInt();
    deleteitem(item,n);
    display();
    }
}
