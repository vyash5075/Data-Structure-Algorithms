import java.util.*;
public class infix_postfix {
    static int getpriority(char ch)
    {
        switch(ch)
       { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
    public static String infix_to_postfix( String s1)
    {
      Stack<Character> st=new Stack<>();
      String postfix="";
     
      for(int i = 0; i<s1.length(); ++i)
      {
          char c=s1.charAt(i);
          
          if(s1.charAt(i)>='a' && s1.charAt(i)<='z') 
          {
              postfix=postfix+c;
          }
          else if(c=='(')
          {
              st.push(c);
          }
          else if(c==')')
          {
              while(!st.isEmpty()&&st.peek()!= '('){     
                  char t=st.pop();
                       if(t=='('){
                           postfix=postfix+t;
                       }
              }
                        if (!st.isEmpty() && st.peek() != '(') 
                    return "Invalid Expression";  
                        else
                            st.pop(); 
            }
           else 
            { 
                while (!st.isEmpty() && getpriority(c) <= getpriority(st.peek())){ 
                    if(st.peek() == '(') 
                        return "Invalid Expression"; 
                    postfix += st.pop(); 
             } 
                st.push(c); 
            } 
      }  
           while (!st.isEmpty()){ 
            if(st.peek() == '(') 
                return "Invalid Expression"; 
            postfix += st.pop(); 
         } 
        return postfix; 
    }    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("entert the string");
        String s1=sc.next();
        String p=infix_to_postfix(s1);
        System.out.println("postfix is "+p);
    }
}
