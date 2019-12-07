import java.util.*;
public class stack_implementation {
    static class node{
        int data;
        node next;
    }
     static node head;
    public static node push(node head,int item)
    {
        node temp=new node();
        temp.data=item;
        if(head==null)
        {
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        return head;
    }
    public static void display(node head)
    {
           node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static node pop(node head)
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
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
         stack_implementation s=new stack_implementation ();
        head= s.push(head,45);
         head=s.push(head,56);
         head=s.push(head,65);
         head=s.push(head,67);
         head=s.push(head,76);
         head=s.push(head,86);
         s.display(head);
            head=s.pop(head);
        s.display(head);
         head=s.pop(head);
         s.display(head);
        
    }
}
