/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1;
import java.util.*;
/**
 *    input:(({[{}]}))(((](()()()()()()
 *    output:12
 *   return the longest balanced parenthesis.
 * @author yash verma
 */
public class stacklongestparen {
    static int count=0;
     static int max=-1;
    public static void stack(String str)
    {
        Stack<Character>st=new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else   if(ch==']'||ch=='}'||ch==')')
            {
                 if(st.isEmpty())
               {
              st.push(ch);     
               }
               else if((ch==')'&&st.peek()=='(')||(ch==']'&&st.peek()=='[')||(ch=='}'&&st.peek()=='{')&&!st.isEmpty())
            {
               
                st.pop();
                count=count+2;
            }
                 else if((ch==')'&&st.peek()!='(')||(ch==']'&&st.peek()!='[')||(ch=='}'&&st.peek()!='{')&&!st.isEmpty())
            {
               
               count=0;
            }
            }
             if(max<count)
               {
                   max=count;
               }
                
        }
        System.out.println(max);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
        stack(str);
    }
}
