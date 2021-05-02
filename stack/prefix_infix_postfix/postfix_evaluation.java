/*
264*8/+3-
postfix ans =>2
infix ans =>((2+((6*4)/8))-3)
prefix ans =>-+2/*6483
 */
package stackqueues;
import java.util.*;

public class postfixconversions {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String exp=sc.nextLine();
    Stack<Integer>vs=new Stack<>();
    Stack<String>is=new Stack<>();
    Stack<String>ps=new Stack<>();
    
    
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        
        if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            int v2=vs.pop();
            int v1=vs.pop();
            int val=operation(v1,v2,ch);
            vs.push(val);
            
            String iv2=is.pop();
            String iv1=is.pop();
            String ival=  "("+iv1+ch+iv2+")";
            is.push(ival);
            
             String  pv2=ps.pop();
            String pv1=ps.pop();
            String pval=  ch+pv1+pv2;
            ps.push(pval);   
        }
        else{
            vs.push(ch-'0');
           is.push(ch+"");
           ps.push(ch+"");
        }
    }
    System.out.println("postfix ans =>"+vs.pop());
     System.out.println("infix ans =>"+is.pop());
      System.out.println("prefix ans =>"+ps.pop());
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
