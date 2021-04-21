import java.util.*;
public class removeduplicacy {
    
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
     public static removeduplicacy insert(removeduplicacy l1,int data)
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
    
    public static removeduplicacy duplicate(removeduplicacy l1)
    {
        node ptr=l1.head.next;
        node prev=l1.head;
        while(ptr!=null)
        {
            if(prev.data==ptr.data)
            {
                prev.next=ptr.next;
                ptr.next=null;
                ptr=prev.next;
            }
            else{
                prev=ptr;
                ptr=ptr.next;
            }
        }
        return l1;
    }
    
     public static void display(removeduplicacy l1)
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
          removeduplicacy l1=new removeduplicacy();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
       display(l1);
       duplicate(l1);
        System.out.println(" list  after removing duplicacy is");
        display(l1);
       
       
     }
}
------------------------------------------------------------------------
    //way 2
    
     public static node removeduplicacy(){
           node next=head;
           node prev=head;
           while(next!=null){
               if(prev.data==next.data){
                   next=next.next;
               }
               else{
                   prev.next=next;
                   prev=next;
                   next=next.next;
               }
           }
           return head;
           
       }
