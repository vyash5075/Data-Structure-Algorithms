import java.util.*;
public class deletionbeginning {
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
    public static node insert(int item)
    {
        node temp=new node(item);
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
    public static void display(deletionbeginning d)
    {
        node p=d.head;
        while(p!=null)
        {
            System.out.print(p.data+"->");
            p=p.next;
        }
        System.out.println("");
    }
    public  static deletionbeginning delete(deletionbeginning d)
    {
        if(head==null)
        {
            System.out.println("empty list");
            return d;
        }
        else{
            node pt=d.head;
            d.head=pt.next;
            pt.next=null;
        }
        return d;
       
    }
    public static void main(String args[])
    {
         
       deletionbeginning d=new deletionbeginning();
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(sc.nextInt());
       }
       display(d);
       delete(d);
       System.out.println("after deletion");
       display(d);
   
        
    }
}