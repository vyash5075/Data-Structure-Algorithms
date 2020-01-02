import java.util.*;
/**
 *
 * @author yash verma
 */

public class isomorphicbinarytree {
   static  class node  
{ 
    int data; 
    node left, right; 
   
    node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 

    static node root1, root2; 
   
    
   static  boolean isIsomorphic(node root1, node root2)  
    { 
        
        if (root1 == null && root2 == null) 
            return true; 
   
       
        if (root1 == null || root2 == null) 
            return false; 
   
        if (root1.data != root2.data) 
            return false; 
   
        return (isIsomorphic(root1.left, root2.left) &&  
                                         isIsomorphic(root1.right, root2.right)) 
        || (isIsomorphic(root1.left, root2.right) &&  
                                         isIsomorphic(root1.right, root2.left)); 
    } 
   
     
    public static void main(String args[])  
    { 
       root1 = new node(1); 
        root1.left = new node(2); 
        root1.right = new node(3); 
        root1.left.left = new node(4); 
        root1.left.right = new node(5); 
       root1.right.left = new node(6); 
        root1.left.right.left = new node(7); 
        root1.left.right.right = new node(8); 
   
        root2 = new node(1); 
        root2.left = new node(3); 
        root2.right = new node(2); 
        root2.right.left = new node(4); 
       root2.right.right = new node(5); 
        root2.left.right = new node(6); 
        root2.right.right.left = new node(8); 
        root2.right.right.right = new node(7); 
   
        if (isIsomorphic(root1, root2) == true) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 

   
