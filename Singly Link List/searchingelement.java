import java.util.*;
public class searchingelement {
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
    public static searchingelement insert (searchingelement l1,int data)
    {
        node temp=new node(data);
        if(l1.head==null)
        {
            l1.head=temp;
        }
        else
        {
          node t=l1.head;
          while(t.next!=null)
          {
              t=t.next;
          }
          t.next=temp;
        }
        return l1;
    }
    public static void display(searchingelement l1)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("");
    }
    public static void  search(searchingelement l1,int data)
    {
        int count=1;
        
        if(l1.head==null)
        {
            System.out.println("empty list please insert data");
            
        }
        
        else {
            node ptr=l1.head;
            while(ptr!=null&&ptr.data!=data)
            {
                ptr=ptr.next;
                count++;
            }
            if(ptr==null)
            {
                System.out.println("no data found");
            }
            else {
               System.out.println("element "+ data+" is found at position "+count);
            }
        }

    }
    public static void main(String args[])
    {
       searchingelement l1=new searchingelement();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
    System.out.println("current list is");
       display(l1);
   System.out.println("enter the item to search");
   int item=sc.nextInt();
   search(l1,item);
    }
}
