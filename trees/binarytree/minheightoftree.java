/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;
import java.util.*;
public class minheightoftree {
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
    
  public static int  minheightlevelwise_way1(node root){
      
    if(root==null)return 0;
    int height=1;
    Queue<node>q=new LinkedList<>();
    q.add(root);
    while(true){
        int size=q.size();
        if(q.isEmpty()||size==0){
            break;
        }
        while(size>0){
            node temp=q.remove();
            
            if(temp.left==null&&temp.right==null){
                return height;
            }
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            size--;
        }
        height++;
        
    }
    return height;
  }
    static int minHeight = Integer.MAX_VALUE;
  public static  void findMinHeightRecursive(node node, int height) {
    if(node == null) {
      return;
    }
    
    if(node.left == null && node.right == null && height < minHeight) {
      minHeight = height;
    }
    
    findMinHeightRecursive(node.left, height + 1);
    findMinHeightRecursive(node.right, height + 1);
  }
  
  public static int minHeight(node node) {
    if (node == null) {
      return 0;
    }

    if (node.left == null && node.right == null) {
      return 1;
    }

    if (node.left == null) {
      return minHeight(node.right) + 1;
    }

    if (node.right == null) {
      return minHeight(node.left) + 1;
    }

    return Math.min(minHeight(node.left), minHeight(node.right)) + 1;
  }
  
    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       
        System.out.println("minheight levelwise way1 "+minheightlevelwise_way1(root));
       findMinHeightRecursive(root,1);
        System.out.println("findMinHeightRecursive "+minHeight);
        
         System.out.println("findMinHeightRecursive way2 " +minHeight(root));
        
        
    }
}