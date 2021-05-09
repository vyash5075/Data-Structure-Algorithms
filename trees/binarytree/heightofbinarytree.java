/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;

public class height_of_binarytree {
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
   
public static int heightofbinarytree(node root){
    
    if(root==null)return -1;
    return Math.max(heightofbinarytree(root.left),heightofbinarytree(root.right))+1;
}
//way2

public static int heightofbinarytree1(node root){
    
    if(root==null)return -1;
    int count1=heightofbinarytree1(root.left);
    count1++;
    int count2=heightofbinarytree1(root.right);
    count2++;
    return  (count1>count2?count1:count2);
}


    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
         System.out.println("height of tree by way1  is "+ heightofbinarytree(root));
        System.out.println("height of tree by way2 is"+ heightofbinarytree1(root));
        
    }
}
