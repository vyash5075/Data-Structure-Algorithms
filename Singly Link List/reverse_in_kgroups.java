
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
public static int length(node head){
    node curr=head;
    int size=0;
    while(curr!=null){
        size++;
        curr=curr.next;
    }return size;
}
static node temphead=null;
static node temptail=null;
public static void addfirst(node t){
    if(temphead==null){
        temphead=t;
        temptail=t;
    }
    else{
        t.next=temphead;
        temphead=t;
    }
    
}
public static node reverseinkgropus(node head,int k){
    if(head==null||head.next==null||k<0){
        return head;
    }
    node oh=null;
 node ot=null;
    int len=length(head);
    System.out.println(len);
    node curr=head;
    while(len>=k){
        int tempk=k;
        while(tempk-->0){   //tempk>=0
            node forw=curr.next;
            curr.next=null;
            addfirst(curr);
            display(curr);
            curr=forw;
            
        }
        if(oh==null){
            oh=temphead;
            ot=temptail;
          
        }
        else{
            ot.next=temphead;
            ot=temptail;
        }
      
        temphead=null;
        temptail=null;
        len-=k;
    }
    
    ot.next=curr;
    return oh;
}
       public static  node insertNode(node head,int nodeData) {
			node temp=new node(nodeData);
                        if(head==null){
                            head=temp;
                        }
                        else{
                            node p=head;
                            while(p.next!=null){
                                p=p.next;
                                
                            }
                            p.next=temp;
                        }
                        return head;
		}
	
public static void main(String args[]){
    node head=null;
    head=insertNode(head,5);
     head=insertNode(head,6);
     head=insertNode(head,7);
     head=insertNode(head,8);
     head=insertNode(head,9);
     display(head);
     int m=3;
     head=reverseinkgropus(head,m);
     
    display(head);
 
}

}
