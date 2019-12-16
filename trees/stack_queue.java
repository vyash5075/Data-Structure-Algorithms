import java.util.*;
public class stack_queue {
    static class stack{
        static Queue<Integer>q1=new LinkedList<>();
          static Queue<Integer>q2=new LinkedList<>();
      static   int size;
      stack()
      {
          size=0;
      }
      static void push(int item)
      {
          size++;
          q2.add(item);
          while(!q1.isEmpty())
          {
              q2.add(q1.peek());
              q1.remove();
          }
          Queue<Integer>q=q1;
          q1=q2;
          q2=q;
      }
      static void pop()
      {
          if(q1.isEmpty())
          
              return;
          
              q1.remove();
              size--;
          
      }
      static int top()
      {
          if(!q1.isEmpty())
          {
              return (q1.peek());
              
          }
          else {
              return -1;
          }
      } 
      static int size()
      {
          return size;
      }
    }
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    stack s=new stack();
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int value=sc.nextInt();
        s.push(value);
    }
   System.out.println("enter the no. of element sto pop");
   int m=sc.nextInt();
   for(int i=0;i<m;i++)
   {
       System.out.println(s.top());
       s.pop();
   }
   System.out.println(s.size());
   
}
}
