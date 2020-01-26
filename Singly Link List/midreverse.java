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
public class midreverse {
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
            return head;
        }
        else{
            node p=head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
        return head;
    }
    
    public static void display(node head)
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else{
            node p=head;
            while(p!=null)
            {
                System.out.println(p.data);
                p=p.next;
            }
        }
    }
    public static node reverse(int m)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return head;
        }
        {
        node temp=head;
        node p=null;
        while(m!=0)
        {
            p=temp;
             temp=temp.next;
             
             m--;
        }
        p.next=null;
            node prev=null;
            node next=null;
            while(temp!=null)
            {
                next=temp.next;
                temp.next=prev;
                prev=temp;
                temp=next;
            }
            p.next=prev;
        }
        return head;
    }
            public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the no. of entries");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
        System.out.println("list is");
        display(head);
        
        int m=n/2;
        System.out.println(m+"vmkv");
        if(m>1)
        {
             reverse( m);
             System.out.println("list after reverse is");
         display(head);
        }
        else{
            
         System.out.println("list after reverse is");
         display(head);
        }
  
    }
}
