/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds1;
import java.util.*;

public class Evaluatepostfix {
    
  static int top=-1;
  static int stack[];
  practice (int n)
  {
      stack=new int[n];
  }
   
  public static  void push(int item)
    {
//      
        stack[++top]=item;
     
    }
 public static  int pop(){
       return (stack[top--]);
   }
  public static void evaluate(String s)
  {
      char arr[]=s.toCharArray();
      int r=0;
      int x=0;
      int y=0;
      int flag=1;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>='a'&&arr[i]<='z')
          {
             flag=0;
              System.out.println("invalid");
              break;
          }
          if(arr[i]>='0'&&arr[i]<='9')
          {
              int p=Integer.parseInt(arr[i]+"");
              push(p);
          }
           if(arr[i]=='+'||arr[i]=='-'||arr[i]=='/'||arr[i]=='*')
          {

                if(top==-1)
                {
                   System.out.println("invalid");
                  flag=0;
                }
                else{
                     x=pop();
                }
               if(top==-1)
                {
                   System.out.println("invalid");
                   flag=0;
                   
                }
                else{
                     y=pop();
                }
              
             // int y=pop();
              switch(arr[i])
              {
                  case '+':
                      r=y+x;
                     // System.out.println("ffff"+r);
                      push(r);
                      break;

                      case '-':
                      r=y-x;
                      push(r);
                          break;
                      case '*':
                      r=x*y;
                      push(r);
                          break;
                      case '/':
                      r=y/x;
                      push(r);
                          break;
              }
          }
           if(flag==0)
           {
               break;
           }
      }
      if(flag==1)
      {
           int f=pop();
      System.out.println(f);
      
      }
      
     
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      String  s=sc.nextLine();
      practice p=new practice(s.length());
      evaluate (s);
    }
}
