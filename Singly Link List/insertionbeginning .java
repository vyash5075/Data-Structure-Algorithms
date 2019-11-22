import java.util.*;
public class insertionbeginning {
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
            temp.next=head;
            head=temp;
        }
        return head;
    }
    public static void display(node head)
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
    }
   public static void main(String args[])
           
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of entries");
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           insert(sc.nextInt());
       }
       display(head);
   }
}
