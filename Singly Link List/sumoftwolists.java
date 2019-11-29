import java.util.*;
//input->     5->6->3
//              8->4->2
//output          3->1->6
public class sumoftwolists {
    static class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            node next= null;
        }
    }
     node head=null;
    public static sumoftwolists insert(sumoftwolists li,int data)
	{
		node n1 =new node(data);
		n1.next=null;
		if(li.head==null)
		{
			li.head=n1;
		}
		else// appending data at end
		{
			node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n1;
		}
		return li;
	}
    public static void display(sumoftwolists l)
    {
        if (l.head==null)
        {
         return;   
        }
        else
        {
            node p=l.head;
            while(p!=null)
            {
                System.out.print(p.data+"->");
                p=p.next;
            }
            System.out.println("");
        }
    }
    public static void add(sumoftwolists l1,sumoftwolists l2)
    {
        node p=l1.head;
        node q=l2.head;
        int sum=0;
        int carr=0;
        while(p!=null)
        {
            sum=p.data+q.data+carr;
            carr=0;
            int t=sum%10;
            System.out.print(t+"->");
            carr=sum/10;
            p=p.next;
            q=q.next; 
        }
        if(carr!=0) {
			System.out.print(carr);
    }
    }
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
    sumoftwolists l1=new sumoftwolists();
     sumoftwolists l2=new sumoftwolists();
    System.out.println("enter no. of elements of list 1");
    int m=sc.nextInt();
    for(int i=0;i<m;i++)
    {
       l1. insert(l1,sc.nextInt());
    }
    display(l1);
    System.out.println("enter no. of elements of list 2");
    for(int i=0;i<m;i++)
    {
       l2. insert(l2,sc.nextInt());
    }
    display(l2);
    add(l1,l2);
    } 
}
