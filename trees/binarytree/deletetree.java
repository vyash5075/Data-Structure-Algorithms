/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;


public class deletetree {
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
    
    
    
    
    
    public static void postorder(node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        
        postorder(root.right);
        System.out.print(root.data+"->");
    }
    
    public static node deletetree(node root){
        if(root==null)return null;
        
        deletetree(root.left);
         deletetree(root.right);
        System.out.println("deleting"+root.data);
        root=null;
        return root;
    }
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
          
           root=  deletetree(root);
        System.out.println("postorder");
        postorder(root);
        
    }
}

