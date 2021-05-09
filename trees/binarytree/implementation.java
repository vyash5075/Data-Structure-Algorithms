/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class implementation {
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
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }
    
    public static void preorder(node root){
        if(root==null){
            return;
        }
        
         System.out.print (root.data+"->");
        preorder(root.left);
       
        preorder(root.right);
    }
    
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        
        postorder(root.right);
        System.out.print(root.data+"->");
    }
    
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
          System.out.println("preorder");
          preorder(root);
          System.out.println();
            System.out.println("inorder");
            inorder(root);   System.out.println();
        System.out.println("postorder");
        postorder(root);
        
    }
}
