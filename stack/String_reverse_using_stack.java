import java.util.*;
public class String_reverse_using_stack {
    
       
      public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          
          Stack<Character>st=new Stack<>();
          for(int i=0;i<s.length();i++)
          {
              st.push(s.charAt(i));
          }
          s="";
          while(!st.isEmpty())
          {
              s+=st.pop();
          }
          System.out.println(s);
    }
}
