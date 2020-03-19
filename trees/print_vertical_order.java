/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.*;
/**    input:    
 * /* Construct below tree
		          1
		        /   \
		       /     \
		      2       3
		            /   \
		           /     \
		          5       6
		        /   \
		       /     \
		      7       8
		            /   \
		           /     \
		          9      10
                          * 
                          * 
 output:   [2, 7]
           [1, 5, 9]
           [3, 8]
            [10, 6]
 *
 * @author yash verma
 */
public class print_vertical_order {
    static class node{
        int data;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
            left=right=null;
        }
    }
    public static void printvertical(node root)
    {
        Map<Integer,List<Integer>>map=new TreeMap<>();
        printpreorder(root,0,map);
        for(Collection<Integer> collection:map.values())
        {
            System.out.println(collection);
        }
    }
    public static void printpreorder(node root,int dist,Map<Integer,List<Integer>>map)
    {
     if(root==null)
     {
         return;
     }
     multimap(root.data,dist,map);
     printpreorder(root.left,dist-1,map);
     printpreorder(root.right,dist+1,map);
     
    }
    public static void multimap(Integer value,Integer key,Map<Integer,List<Integer>>map)
    {
        if(!map.containsKey(key))
        {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }
    public static void main(String args[])
    {
        print_vertical_order v=new print_vertical_order();
        node root = new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.right.left = new node(5);
		root.right.right = new node(6);
		root.right.left.left = new node(7);
		root.right.left.right = new node(8);
		root.right.left.right.left = new node(9);
		root.right.left.right.right = new node(10);
//        v.inorder(root);
        printvertical(root);
        
    }
}
