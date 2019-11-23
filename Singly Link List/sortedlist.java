import java.util.*;
public class sortedlist {
     static class node{
         int data;
         node next;
         node(int d)
         {
             this.data=d;
             node next=null;
         }
     }
     static node head;
     public static sortedlist insert(sortedlist l1,int data)
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
    
    
    
     public static void display(sortedlist l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
     public static void main(String args[])
     {
           sortedlist l1=new sortedlist();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
       
     }
}
