/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

/**
 *  input=(a+b)+((c+d))
 * output= true;
 * input=(a+b)+(c+d)
 * output=false
 * @author yash verma
 */
import java.util.*;

public class duplicatebrackets_stacks {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<Character>st=new Stack<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)==')'){
            
            if(st.peek()=='('){
                System.out.println("true");
                return;
            }
            else{
                while(st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }
        }
        else{
              
            st.push(s.charAt(i));
        }
       
    }
      System.out.println(",.,.");
}    
}
