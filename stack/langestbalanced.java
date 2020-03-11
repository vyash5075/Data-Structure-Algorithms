import java.util.*;
/**
 *
 * @author yash verma
 */
public class langestbalanced {
    static int stack[]=new int[100000];
    static int top;
    static int result=0;

  public static  void push(int k)
{
    top=top+1;
    stack[top]=k;
    

}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
    {
         top=-1;
        push(-1);
//        System.out.println(stack[top]);
//        int result=0;
        String str=sc.next();
        char s[]=str.toCharArray();
         for(int j=0;j<s.length; j++)
        {
            if(s[j]=='(')
            {
                push(j);
            }
            else if(s[j]==')')
            {
                top=top-1;
                if((top)==-1)
                {
                     push(j);
                  
                }
                else
                {
                   result=Math.max(result,(j-stack[top])); 
                }  
            }
        }
       System.out.println(result);
    }
    }
}
