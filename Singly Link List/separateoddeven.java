import java.util.*;
public class separateoddeven {
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
    public static  separateoddeven insert(separateoddeven sp,int data)
    {
        node temp=new node(data);
        if(sp.head==null)
        {
            sp.head=temp;
        }
        else
        {
            if(temp.data%2==0)
            {
                temp.next=sp.head;
                sp.head=temp;
            }
            else
            {
                node ptr=sp.head;
                while(ptr.next!=null)
                {
                    ptr=ptr.next;
                }
                ptr.next=temp;
            }
        }
        return sp;
    }
    public static void display(separateoddeven sp)
    {
        node ptr=sp.head;
        while(ptr!=null)
        {
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }
    }
    public static void main(String args[])
    {
        separateoddeven sp=new separateoddeven ();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries"); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(sp,sc.nextInt());
        }
        System.out.println("current list is");
        display(sp);
    }
}
