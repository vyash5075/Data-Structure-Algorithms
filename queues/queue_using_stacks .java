import java.util.*;
public class queue_using_stacks {
    Stack<Integer>s1=new Stack<Integer>();
     Stack<Integer>s2=new Stack<Integer>();
    
    public  void enqueue(int x)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public void dequeue()
    {
        if(s1.isEmpty())
        {
            System.out.println("q is empty");
            
        }
        else{
            int p=s1.peek();
            s1.pop();
            System.out.println(p);
        }
    }
    public static void main(String args[])
    {
        queue_using_stacks q=new queue_using_stacks();
        q.enqueue(2);
        q.enqueue(5);
        q.enqueue(8);
       q. dequeue();
    }
}
