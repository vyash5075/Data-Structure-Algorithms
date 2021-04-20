import java.util.*;
public class middleelement {
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
    public static middleelement insert (middleelement l1,int data)
    {
         node temp=new node(data);
        if(head==null)
        {
            head=temp;
        }
         else{
                node previous=l1.head;
                node ptr=l1.head;
                while(ptr!=null&& ptr.data<=temp.data)
                {
                    previous=ptr;
                    ptr=ptr.next;
                }
                if(ptr==l1.head)
                {
                    temp.next=l1.head;
                    l1.head =ptr;
                }
                else if(ptr==null)
                {
                    previous.next=temp;
                }
                else{
                    temp.next=ptr;
                    previous.next=temp;
                }
                return l1;
            }
                
                
                
        return l1;        
                
    }
    
    
    public static void display(middleelement l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void midelement(middleelement l1)
    {
        int count=0;
        node p=l1.head;
        while(p!=null)
        {
            p=p.next;
                 count++;  
        }
        int mid=count/2;
        node prev=l1.head;
        while(mid!=0)
        {
            prev=prev.next;
            mid--;
        }
        System.out.println("middle element is "+prev.data);
    }
    public static void main(String args[])
    {
        middleelement l1=new middleelement();
        Scanner sc=new Scanner(System.in);
           insert(l1,10);
       insert(l1,19);
       insert(l1,42);
       insert(l1,123);
       insert(l1,14);
       insert(l1,34);
       
       
       System.out.println("current list is");
       display(l1);
       midelement(l1);
   
    }
}
