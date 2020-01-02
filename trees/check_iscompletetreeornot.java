import java.util.*;
/**
 *
 * @author yash verma
 */
class node  
{ 
    int data; 
    node left, right; 
   
    node(int item) { 
        data = item; 
        left = right = null; 
    } 
} 
    
public class check_iscompletetreeornot {
  static node root;
   int countnodes(node root)  
    { 
        if (root == null) 
            return (0); 
        return (1 + countnodes(root.left) + countnodes(root.right)); 
    } 
    boolean isComplete(node root, int index, int number_nodes) 
    { 
        
        if (root == null)         
           return true; 
        if (index >= number_nodes) 
           return false; 
        return (isComplete(root.left, 2 * index + 1, number_nodes) 
            && isComplete(root.right, 2 * index + 2, number_nodes)); 
   
    } 
   
      public static void main(String args[])  
    {
         iscompletetreeornot tree = new iscompletetreeornot(); 
        tree.root = new node(1); 
        tree.root.left = new node(2); 
        tree.root.right = new node(3); 
        tree.root.left.right = new node(5); 
        tree.root.left.left = new node(4); 
        tree.root.right.right = new node(6);
         int node_count = tree.countnodes(tree.root); 
         System.out.println("no of nodes "+node_count);
          int index = 0; 
           
        if (tree.isComplete(tree.root, index, node_count)) 
            System.out.print("The binary tree is complete"); 
        else
            System.out.print("The binary tree is not complete"); 
}
}
