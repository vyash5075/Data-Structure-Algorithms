
import java.util.*;
public class pre_to_post {
    public  static boolean operator(char x)
    {
        if(x=='+'||x=='-'||x=='/'||x=='*')
        {
            return true;
        }
        return false;
    }
    public static String pretopost(String s1)
    {
        Stack<String> s= new Stack<String>(); 
    int length = s1.length();  
    for (int i = length - 1; i >= 0; i--)  
    { 
        if (operator(s1.charAt(i)))  
        { 
            String temp = s.peek(); s.pop(); 
            String temp2= s.peek(); s.pop(); 
            String temp3 = temp + temp2 + s1.charAt(i); 
                 s.push(temp3); 
        } 
        else
        { 
            s.push( s1.charAt(i)+""); 
        } 
    } 
    return s.peek(); 
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String");
        String s5=sc.next();
        String ss=pretopost(s5);
        System.out.println(ss);
    }
}
