/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class inordertraversalwithoutrecursion {
   static class node{
        int data;
        node left;
        node right;
        node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    
    public static void inorder(node root){
        if(root==null){
            return;
        }
        Stack<node>st=new Stack<>();
        while(root!=null){
            st.push(root);
            root=root.left;
        }
        while(st.size()>0){
            node t=st.pop();
            System.out.print(t.data+"->");
            if(t.right!=null){
                node temp=t.right;
                while(temp!= null){
                    st.push(temp);
                    temp=temp.left;
                }
            }
        }
        
//        inorder(root.left);
//        System.out.print(root.data+"->");
//        inorder(root.right);
    }
    
     
   
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
          
            System.out.println("inorder");
            inorder(root);   System.out.println();
     
        
    }
}

