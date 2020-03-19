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


 
public class iscompletetreeornot_without_recursion {
    static class node  
{ 
    int data; 
    node left, right; 
   
    node(int item) { 
        data = item; 
        left = right = null; 
    } 
}
    node root;
    public static boolean iscomplete(node root)
    {
        if(root==null)
        {
            return true;
        }
        Queue<node>q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty())
        {
            node temp=q.remove();
            if(temp.left!=null)
            {
                if(flag==true)
                {
                    return false;
                }
                else{
                    q.add(temp.left);
                }
                
            }
            else{
                flag=true;
            }
            if(temp.right!=null)
            {
                if(flag==true)
                {
                    return false;
                }
                else{
                    q.add(temp.right);
                }
            }
            else{
                flag=true;
            }
            }
        return true;
                
     }
    
     public static void main(String args[])  
    {
     
   iscompletetreeornot_without_recursion tree = new iscompletetreeornot_without_recursion(); 
       tree.root = new node(1); 
        tree.root.left = new node(2); 
        tree.root.right = new node(3); 
        tree.root.left.right = new node(5); 
        tree.root.left.left = new node(4);
//         tree.root.left.left.left = new node(4);
//          tree.root.left.left.right = new node(4);
//        tree.root.right.right = new node(6);
//          tree.root.right.left = new node(6);
        if(iscomplete(tree.root))
        {
            System.out.println("complete");
        }
        else{
             System.out.println("incomplete");
        }
       
}
}
