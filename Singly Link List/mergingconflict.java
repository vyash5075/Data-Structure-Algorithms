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
public class mergingconflict {
    public class node{
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            next=null;
        }
    }
        node head;
        public node insert(node head,int item)
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
                    System.out.println(p.data+"ed");
                    p=p.next;
                }
            }
        }
        public int mergingnode(int length1,int length2,node head1,node head2)
                
        {
            int difference;
         if(length1>length2)
         {
             difference=length1-length2;
            int k= mergingnode(difference,head1,head2);
            return k;
             
         }
         else
         {
             difference=length1-length2;
             int k=mergingnode(difference,head2,head1);
             return k;
         }
            
        }
        public int mergingnode(int diff,node head1,node head2)
        {
            node temp1=head1;
            node temp2=head2;
            
            for(int i=0;i<diff;i++)
            {
                if(temp1==null)
                {
                  
                   return -1;
                }
                 temp1=temp1.next;
            }
            while(temp1!=null&&temp2!=null)
            {
                if(temp1.data==temp2.data)
                {
                    return temp1.data;
                }
                temp1=temp1.next;
                temp2=temp2.next;
            }
            
            return -1;
        }
        public static void main(String args[])
        {
            mergingconflict m=new mergingconflict();
             mergingconflict p=new mergingconflict();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the no. of nodes of list1");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
               m.head= m.insert(m.head,sc.nextInt());
            }
            m.display();
            System.out.println("enter the no. of nodes of list1");
            int l=sc.nextInt();
            for(int i=0;i<l;i++)
            {
               p.head= p.insert(p.head,sc.nextInt());
            }
            p.display();  
           int status= m.mergingnode(n,l,m.head,p.head);
           if(status==-1)
           {
               System.out.println("no any merging conflict found");
        }
           else{
                System.out.println(" merging conflict found at node "+status);
           }
        
    }
}

