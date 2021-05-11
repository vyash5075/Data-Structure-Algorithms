/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_tree;

import java.util.*;
public class spiralprinting {
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
    static int maxlevel=0;
    public static void leftview(node root,int level){
       if(root==null)return  ;
       
       if(level==maxlevel){
           System.out.println(root.data);
           maxlevel++;
       }
       leftview(root.left,level+1);
       leftview(root.right,level+1);
    
    }
    
    public static void Spiralprint(node root){
        if(root==null)return;
        
        Stack<node>s1=new Stack<>();
        Stack<node>s2=new Stack<>();
        
        s1.push(root);
        while(!s1.isEmpty()||!s2.isEmpty()){
            while(!s1.isEmpty()){
                node temp=s1.pop();
                System.out.println(temp.data);
                if(temp.left!=null){
                    s2.push(temp.left);
                    
                }
                if(temp.right!=null){
                    s2.push(temp.right);
                }
            }
            
            while(!s2.isEmpty()){
                node temp=s2.pop();
                System.out.println(temp.data);
                if(temp.right!=null){
                    s1.push(temp.right);
                }
                if(temp.right!=null){
                    s1.push(temp.left);
                }
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
       Spiralprint(root);
    }
}
