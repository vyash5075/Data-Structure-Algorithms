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
public class levelordersum {
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
        
                Queue<node>q=new LinkedList<node>();
                q.add(root);
                
                while(true){
                    int size=q.size();
                    if(size==0){
                        break;
                    }
                int sum=0;
                while(size>0){
                    node top=q.remove();
                   sum=sum+top.data;
                    if(top.left!=null){
                        q.add(top.left);
                    }
                     if(top.right!=null){
                        q.add(top.right);
                    }
                     size--;    
                }
                System.out.println(sum);
                }
                return;
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
