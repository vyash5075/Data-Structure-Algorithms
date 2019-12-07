import java.util.*;
public class stack1 {
    public static void main(String agrs[])
    {
        Scanner sc=new Scanner(System.in);
        int top=-1;
       char stack[]=new char[50];
        String ar=new String();
        ar=sc.nextLine();
        for(int i=0;i<ar.length();i++)
        {
            if(ar.charAt(i)=='{' || ar.charAt(i)=='['||ar.charAt(i)=='(')
            {
                stack[++top]=ar.charAt(i);
            }
            if(ar.charAt(i)==']'&&stack[top]=='['||ar.charAt(i)=='}'&&stack[top]=='}'||ar.charAt(i)==')'||stack[top]=='(')
            {
                --top;
            }
        }
        if(top==-1)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
        
        
    }
}
