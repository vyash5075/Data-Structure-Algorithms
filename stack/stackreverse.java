import java.util.*;
public class stack_reverse {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s=sc.next();
        String stack[]=new String[50];
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            stack[++top]=s.charAt(i)+"";
        }
        System.out.println("reverse string is");
        while(top!=0)
        {
            stack[top-1]=stack[top]+stack[top-1]+"";
        top--;
        }
        System.out.println(stack[0]);
    }
}
