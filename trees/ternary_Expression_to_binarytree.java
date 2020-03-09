/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class ternary_Expression_to_binarytree {
    class  node{
        char data;
        node left;
        node right;
        node(char d)
        {
            this.data=d;
            left=right=null;
        }
    }
    public void display(node root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            display(root.left);
            display(root.right);
        }
    }
    node root;
    public node maketree(char arr[],int i)
    {
        if(i>arr.length)
        {
            return  null;
        }
        node root=new node(arr[i]);
      ++i;
        if(i<arr.length&&arr[i]=='?')
        {
            root.left=maketree(arr,i+1);
        }
        else if(i<arr.length)
        {
            root.right=maketree(arr,i+1);
        }
        return root;
    }
    public static void main(String args[])
    {
        ternary_Expression_to_binarytree b=new ternary_Expression_to_binarytree();
        String st="a?b?c:d:e";
       char arr[]=st.toCharArray();
       node root=b.maketree(arr,0);
       b.display(root);
    }
}
