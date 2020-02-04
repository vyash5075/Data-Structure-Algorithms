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
public class removeloop {
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
    public node push(int item)
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
                p=p.next;
            }
            p.next=temp;
        }
        return head;
    }
    public void display()
    {
        node p=head;
        while(p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
    }
   
public boolean loopdetect(node head)
{
    node slow=head;
    node fast=head;
    while(slow!=null&&fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            return true;
        }
       
    }
     return false;
}
public boolean loopdetectt(node head)
{
    node slow=head;
    node fast=head;
    while(slow!=null&&fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            removeloop(head,slow);
        }
       
    }
     return false;
}
public node removeloop(node head,node slow)
{
    node ptr1=slow;
    node ptr2=slow;
    int k=1;
    while(ptr2.next!=ptr1)
    {
        ptr2=ptr2.next;
        k++;
    }
     ptr1=head;
     ptr2=head;
     for(int i=0;i<k;i++)
     {
         ptr2=ptr2.next;
     }
     while(ptr1!=ptr2)
     {
         ptr1=ptr1.next;
         ptr2=ptr2.next;
     }
     while(ptr2.next!=ptr1)
     {
         ptr2=ptr2.next;
     }
     ptr2.next=null;
    
    
    return head;
}

    public static void main(String args [])
    {
       removeloop l=new removeloop();
       l.push(50);
       l.push(20);
       l.push(15);
       l.push(4);
       l.push(10);
        l.display();
        l.head.next.next.next.next.next = l.head.next; 
      //l.head.next.next.next.next = l.head; 
     
         if(l.loopdetect(l.head))
         {
             System.out.println("loop found");
         }
         else{
             System.out.println("loop not found"); 
         }
       l.loopdetectt(l.head);
       l.display();
    }
}
