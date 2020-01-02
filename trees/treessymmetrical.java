import java.util.*;
/**
 *
 * @author yash verma
 */

public class treessymmetrical {
 static class  node {
      int data;
      node left;
      node right;
      node(int d)
      {
          this.data=d;
          left=right=null;
      }
      node root1;
      node root2;
 }
 public static boolean checksymmetrical(node root1,node root2)
 {
     if(root1==null&&root2==null)
     {
         return true;
     }
     if(root1!=null&&root2!=null)
     {
         if(root1.data==root2.data)
         {
             return checksymmetrical(root1.left,root2.right)&&checksymmetrical(root1.right,root2.left);
         }
     }
     return false;
 }
      public static void main(String args[])
      {
          treessymmetrical tree=new treessymmetrical();
          node root1=new node(1);
          root1.left=new node(3);
          root1.right=new node(2);
          root1.right.left=new node(5);
          root1.right.right=new node(4);
          
          
          node root2=new node(1);
          root2.left=new node(2);
          root2.right=new node(3);
          root2.left.left=new node(4);
          root2.left.right=new node(5);
          boolean b=checksymmetrical(root1,root2);
          
          if(b==true)
          {
              System.out.println("yes");
              
          }
          else{
              System.out.println("no");
          }
      } 
 }   
