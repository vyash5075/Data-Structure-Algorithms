/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class prefixevaluation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
    
    Stack<Integer>vs=new Stack<>();
      Stack<String>is=new Stack<>();
        Stack<String>ps=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
             if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                 int v1= vs.pop();
                 int v2=vs.pop();
                 int val=operation(v1,v2,ch);
                 vs.push(val);
                 
                 String is1=is.pop();
                 String is2=is.pop();
                 String inval="("+is1+ch+is2+")";
                 is.push(inval);
                 
                 String ps1=ps.pop();
                 String ps2=ps.pop();
                 String pval="("+ps1+ch+ps2+")";
                 ps.push(pval);
                 
             }else{
                 vs.push(ch-'0');
                 is.push(ch+"");
                 ps.push(ch+"");
             }
             
              
}
        System.out.println("Prefix ="+vs.pop());
              System.out.println("infix ="+is.pop()); 
              System.out.println("postfix ="+ps.pop());

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
