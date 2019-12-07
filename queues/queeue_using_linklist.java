import java.util.*
public class queeue_using_linklist {
 static class node{
     int data;
     node next;
 }   
 static node head;
 public static void enqueue(int data)
 {
     head=enqueuee(head,data);
 }
 public static node enqueuee(node head,int data )
 {
     node temp=new node();
     temp.data=data;
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
 public static void display(node head)
 {
     if(head==null)
     {
         System.out.println("queue is empty");
     }
     else{
         node p=head;
         while(p!=null)
         {
            System.out.print(p.data+"->");
              p=p.next;
         }
         System.out.println("");
       
     }
 }
 public static node dequeue(node head)
 {
     if(head==null)
     {
         System.out.println("queue is empty");
     }
      else{
            node p=head;
          head=p.next;
            p.next=null;
            p=null;
        }
     return head;
 }
 public static void main(String args[])
 {
     queeue_using_linklist q=new queeue_using_linklist();
     enqueue(56);
     enqueue(87);
      enqueue(66);
     display(head);
     head=dequeue(head);
     head=dequeue(head);
     
       display(head);
     
 }
}
