/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinklist;
import java.util.*;
/**
 *   input 1->2->3->4->5->6
 *   output 1->6->2->5->3->4
 * @author yash verma
 */
public class smallestlargest {
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
    
    public static  node insert(int data)
    {
        node temp=new node(data);
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
            System.out.println("empty");
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
    public static node combination(int n)
    {
        int mid=n/2;
        node p=head;
        node q=head;
        for(int i=0;i<mid;i++)
        {
            q=p;
            p=p.next;
        }
        q.next=null;
        node prev=null;
        node next=null;
        node temp=p;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        p=prev;
        node temp1=head;
        node tem1=head;
        node temp2=p;
        node tem2=p;
        while(temp!=null||temp2!=null)
        {
            tem1=temp1.next;
            tem2=tem2.next;
            temp2.next=null;
            temp1.next=temp2;
            temp2.next=tem1;
            temp1=tem1;
            temp2=tem2;
//            tem1=tem1.next;
           
            
        }
       return head;     
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
       
        combination(n);
         display(head);
    }
}
