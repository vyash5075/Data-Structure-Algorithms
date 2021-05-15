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

public class diagonalprint {
    


  
static class node {  
    int data;  
    node left, right; 
    node(int d)
    {
        this.data=d;
        node left=null;
        node right=null;
    }
}  
  
static node root;
public diagonalprint()
{
    root=null;
}
public diagonalprint(int key)
{
    root=new node(key);
}
public node insert(node root,int data)
{
    node temp=new node(data);
    if(root!=null)
    {
        if(data<root.data)
    {
        insert(root.left,data);
        if(root.left==null)
        {
            root.left=temp;
        }
    }
        else{
            insert(root.right,data);
            if(root.right==null)
            {
                root.right=temp;
            
            }
            
            }
        return root;
            
        }
    return root;
    
}   
static void diagonalPrint(node root)  
{  
      
    if (root == null)  
        return;  
    
   
    Queue<node> q= new LinkedList<node>();  
    
    
    q.add(root);  
    
    
    q.add(null);      
    
    while (q.size()>0) {  
        node temp = q.peek();  
        q.remove();  
    
     
        if (temp == null) {  
    
          
            if (q.size()==0)  
                return;  
    
         
            System.out.println(); 
    
            
            q.add(null);  
        }  
        else {  
            while (temp!=null) {  
                System.out.print( temp.data + " ");  
    
              
                if (temp.left!=null)  
                    q.add(temp.left);  
    
          
                temp = temp.right;  
            }  
        }  
    }  
}  
    

public static void main(String args[]) 
{  
   
    diagonalprint bst=new diagonalprint(50);
    bst.insert(bst.root,30);
    bst.insert(bst.root,56);
    bst.insert(bst.root,86);
        bst.insert(bst.root,59);
        
    bst.insert(bst.root,20);
        bst.insert(bst.root,35);
            bst.insert(bst.root,33);
    diagonalPrint(root);  
}  
} 