
package singlylinklist;
import java.util.*;
public class ksorted_Linklists {
static class node{
    int data;
    node next;
    node(int d){
        this.data=d;
    }
}
static node head;
public static void display(node head){
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println();
}


public static node mergeklists(node arr[],int last){
   PriorityQueue<node>pq=new PriorityQueue<>((a,b)->{
       return a.data-b.data;
   });
   for(node l:arr){
       if(l!=null){
           pq.add(l);
       }
   }
   node dummy=new node(-1);
   node prev=dummy;
   while(pq.size()!=0){
       node temp=pq.remove();
       prev.next=temp;
       prev=prev.next;
       temp=temp.next;
       if(temp!=null){
           pq.add(temp);
       }
   }
   return dummy.next;
}
public static void main(String args[]){
    int k=3;
    int n=4;
    node arr[]=new node[k];
    arr[0]=new node(1);
    arr[0].next=new node(3);
    arr[0].next.next=new node(5);
    arr[0].next.next.next = new node(7);
 
    arr[1] = new node(2);
    arr[1].next = new node(4);
    arr[1].next.next = new node(6);
    arr[1].next.next.next = new node(8);
 
    arr[2] = new node(0);
    arr[2].next = new node(9);
    arr[2].next.next = new node(10);
    arr[2].next.next.next = new node(11);
    
    
    head=mergeklists(arr,k-1);
    display(head);
 
}

}
