/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class infixevaluation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s =sc.nextLine();
        Stack<Integer>opernds=new Stack<>();
        Stack<Character>optor=new Stack<>();       
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            optor.push(ch);
        }
        else if(Character.isDigit(ch)){
            opernds.push(ch-'0');
        }
        
        else if(ch==')'){
        while(optor.peek()!='('){
            char  optors=optor.pop();
            int v2=opernds.pop();
            int v1=opernds.pop();
           int opv=operation(v1,v2,optors);
           opernds.push(opv);
        }   
        optor.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            //ch is wanting higher priority to solve first
            while(optor.size()>0&&optor.peek()!='('&&precedence(ch)<=precedence(optor.peek())){
                char  optors=optor.pop();
            int v2=opernds.pop();
            int v1=opernds.pop();
           int opv=operation(v1,v2,optors);
           opernds.push(opv);
            }
            optor.push(ch);
        }
    }
        
         while(optor.size()!=0){
            
            char  optors=optor.pop();
            
            int v2=opernds.pop();
            int v1=opernds.pop();
             System.out.println(v1+"."+v2+".."+optors+"...");
           int opv=operation(v1,v2,optors);
           opernds.push(opv);
        } 
         System.out.println(opernds.peek());
    }
    
    public static int precedence(char op){
        if(op=='+')
        {return 1;
        }
        
        else if(op=='-'){return 1;}
        else if(op=='/'){
            return 2;
        }
        else if (op=='*'){ return 2;}
        
        return 2;
    }
    
    public static int operation(int v1,int v2,char op){
        if(op=='+'){
            return v1+v2;
        }
        else if(op=='-'){
            return v1-v2;
        }
        else if(op=='*'){
            return v1*v2;
        }
        else {
            return v1/v2;
        }
    }
}
