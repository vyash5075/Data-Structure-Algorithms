/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class preorderwithoutrecursion {
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
    public static void preorder(node root){
        if (root==null)return ;
        
                Stack<node>st=new Stack<>();
             st.push(root);
                
                while(st.size()>0){
                    node top=st.pop();
                    System.out.print(top.data+" ");
                     
                    if(top.right!=null){ 
                        st.add(top.right);
                    }
                     if(top.left!=null){
                        st.add(top.left);
                    }
                     
                }
    }
   
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       preorder(root);
    }
}
