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
public class levelorder_traversal {
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
    public static void levelordertraversal(node root){
        if (root==null)return ;
                int height=heightofbinarytree(root);
                for(int i=0;i<=height;i++){
                    printlevel(root,i+1);
                    System.out.println();
                }
    }
    public static void printlevel(node root,int level){
        if (level==0)return;
    if(level==1){
        System.out.print(root.data+" ");
    }
    printlevel(root.left,level-1);
    printlevel(root.right,level-1);
    
    }
public static int heightofbinarytree(node root){
    
    if(root==null)return -1;
    return Math.max(heightofbinarytree(root.left),heightofbinarytree(root.right))+1;
}
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       levelordertraversal(root);
    }
}
