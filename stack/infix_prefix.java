import java.util.*;
public class infix_prefix {
     static boolean isOperator(char c) 
{ 
    return (!(c >= 'a' && c <= 'z') &&  
            !(c >= '0' && c <= '9') &&  
            !(c >= 'A' && c <= 'Z')); 
} 
  
    static int getpriority(char c)
    {
        if(c=='-'||c=='+')
        {
            return 1;
        }
        else if(c=='*'||c=='/')
        {
            return 2;
        }
        else if(c=='^')
        {
            return 3;
        }
        return 0;
    }
    public static String infixtoprefix(String infix)
    {
        Stack<Character> operators = new Stack<Character>(); 
    Stack<String> operands = new Stack<String>(); 
   for (int i = 0; i < infix.length(); i++)  
    { 
    if (infix.charAt(i) == '(')  
        { 
            operators.push(infix.charAt(i)); 
        } 
  else if (infix.charAt(i) == ')')  
        { 
            while (!operators.empty() &&  
                operators.peek() != '(')  
                { 
                String op1 = operands.peek(); 
                operands.pop(); 
                String op2 = operands.peek(); 
                operands.pop(); 
                char op = operators.peek(); 
                operators.pop(); 
                String tmp = op + op2 + op1; 
                operands.push(tmp); 
            } 
            operators.pop(); 
        } 
  else if((infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z') ||(infix.charAt(i) >= '0' && infix.charAt(i) <= '9') ||(infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z'))
  {
      operands.push(infix.charAt(i)+"");
  }
  else{
       while (!operators.empty() &&  getpriority(infix.charAt(i))<getpriority(operators.peek()))
       { 
                String op1 = operands.peek(); 
                operands.pop(); 
  
                String op2 = operands.peek(); 
                operands.pop(); 
  
                char op = operators.peek(); 
                operators.pop(); 
  
                String tmp = op + op2 + op1; 
                operands.push(tmp); 
            } 
       operators.push(infix.charAt(i));
         
        }
    
    }
   while (!operators.empty())  
    { 
        String op1 = operands.peek(); 
        operands.pop(); 
  
        String op2 = operands.peek(); 
        operands.pop(); 
  
        char op = operators.peek(); 
        operators.pop(); 
  
        String tmp = op + op2 + op1; 
        operands.push(tmp); 
    } 
  
    
    return operands.peek(); 
} 
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        String prefix=infixtoprefix(s);
        System.out.println("prefix is"+prefix);
    }
}
