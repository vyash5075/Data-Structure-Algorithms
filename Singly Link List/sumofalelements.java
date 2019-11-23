import java.util.*;
public class sumofalelements {
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
    public static sumofalelements insert (sumofalelements l1,int data)
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
    public static int  display(sumofalelements l1)
    {
        int sum=0;
        node temp=head;
        while(temp!=null)
        {
            sum=sum+temp.data;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        return sum;
    }
    public static void main(String args[])
    {
       sumofalelements l1=new sumofalelements();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(l1,sc.nextInt());
       }
       System.out.println("current list is");
     int s=  display(l1);
     System.out.println("   total sum= "+s);
   
    }
}

