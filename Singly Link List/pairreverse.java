/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinklist;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class pairreverse {
   class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            next=null;
        }
    }
   node head;
   public node insert(int item)
   {
       node temp=new node(item);
       if(head==null)
       {
           head=temp;
       }
       else{
           node p=head;
           while(p.next!=null)
           {
              p= p.next;
           }
           p.next=temp;
       }
       return head;
   }
   public void display()
   {
       if(head!=null)
       {
           node p=head;
           while(p!=null)
           {
               System.out.print(p.data+"->");
               p=p.next;
           }
       }
   }
   public node reverse(node head,int pair)
   {
       node current=head;
       node next=null;
       node prev=null;
       int count=0;
       while(count<pair&&current!=null)
       {
           next=current.next;
           current.next=prev;
           prev=current;
           current=next;
           count++;
       }
       if(next!=null)
       {
           head.next=reverse(next,pair);
       }
       return prev;
   }
    public static void main(String args[])
    {
        pairreverse r=new pairreverse();
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            r.insert(sc.nextInt());
        }
        r.display();
        System.out.println("");
        System.out.println("enter the pair value");
        int pair=sc.nextInt();
        if(pair<n)
        {
            r.head=r.reverse(r.head,pair);
        }
        r.display();
    }
}
