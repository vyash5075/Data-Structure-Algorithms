import java.util.*;
/**
 *
 * @author yash verma
 */
public class twostacks_in_array {
    
    int top=-1;
    int top2;
    int arr[];
    int size;
    twostacks_in_array(int n)
    {
        arr=new int[n];
        top2=n;
        size=n;
        
    }
    public void push1(int n)
    {
        if(top<top2-1)
        {
            arr[++top]=n;
        }
        else{
            System.out.println("stack overflow");
        }
    }
     public void push2(int n)
    {
        if(top<top2-1)
        {
            arr[--top2]=n;
        }
        else{
            System.out.println("stack overflow");
        }
    }
       public int pop1()

       {
           if(top>=0)
           {
               int x=arr[top];
               top--;
               return x;
           }
           else{
               System.out.println("stack underflow");
           }
           return -1;
       }
        public int pop2()

       {
           if(top2<=size)
           {
               int x=arr[top2];
               top2++;
               return x;
           }
           else{
               System.out.println("stack underflow");
           }
           return -1;
       }
       public static void main(String args[])
      {
         twostacks_in_array p=new twostacks_in_array(5);
          p.push1(5);
          p.push2(6);
          p.push1(8);
          p.push2(9);
          p.push1(89);
          p.push2(80);
          System.out.println("stack 1 top element"+p.pop1());
          System.out.println("stack 2 top element"+p.pop2()); 
    }
}
