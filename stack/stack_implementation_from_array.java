import java.util.*;
public class stack_implementation_from_array {
   
    public static void delete(int stack[],int top)
    {
        int y=top-1;
        
        while(y!=-1)
        {
            System.out.println(stack[y]+"n ");
            y--;
        }
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt();
        int top=-1;
        int q=-1;
        int stack[]=new int[n];
        for(int i=0;i<n;i++)
        {
           stack[++top]=sc.nextInt();
           q=top;
        }
        System.out.println("elements in the stack are");
        while(top!=-1)
        {
            System.out.println(stack[top]+" ");
            top--;
        }
        delete(stack,q);
    }
}
