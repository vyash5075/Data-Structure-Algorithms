import java.util.*;
/**
 *,
 * @author yash verma
 */
public class loopdetect {
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
        temp.next=head;
        head=temp;
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
            System.out.println(p.data);
            p=p.next;
        }
    }
}
public boolean loopdetect(node head)
{
    node slow=head;
    node fast=head;
    while(slow!=null&&fast!=null)
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
    public static void main (String args[])
    {
        loopdetect l=new loopdetect();
        l.push(20);
        l.push(4);
        l.push(15);
        l.push(10);
        Scanner sc=new Scanner (System.in);
        l.display();
         l.head.next.next.next.next = l.head; 
         if(l.loopdetect(l.head))
         {
             System.out.println("loop found");
         }
         else{
             System.out.println("loop not found"); 
         }
    } 
}
