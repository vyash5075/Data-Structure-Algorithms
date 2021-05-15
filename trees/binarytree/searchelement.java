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
public class searchelement {
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
    
    public static boolean  search(node root,int element){
       if(root==null)return false ;
       
       if(root.data==element){
        return true;
       
       }
     return  search(root.right,element)|| search(root.left,element);
    
    }
    
    public static  boolean iterativesearch(node root,int key){
        if(root==null)return false;
 
                Queue<node>q=new LinkedList<node>();
                q.add(root);
                
                while(q.size()>0){
                    node top=q.remove();
                   if(top.data==key){
                       return true;
                   }
                    if(top.left!=null){
                        q.add(top.left);
                    }
                     if(top.right!=null){
                        q.add(top.right);
                    }
                     
                }
                return false;
    }

    public static void main(String args[]){
        node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
       System.out.println(search(root,12));
              System.out.println(iterativesearch(root,2));
    }
}
