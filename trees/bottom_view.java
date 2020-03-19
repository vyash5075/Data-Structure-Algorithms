/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.*;
import java.util.Map.Entry; 
/**
 *
 * @author yash verma
 */
public class bottom_view {
    
   static class node{
       int data;
       node left;
       node right;
       int hd;
       node(int d)
       {
           hd=Integer.MAX_VALUE;
           this.data=d;
           left=right=null;
       }
   }
   public static void bottomview(node root)
   {
       if(root==null)
       {
           return;
       }
       Map<Integer,Integer>map=new TreeMap<>();
       Queue<node>q=new LinkedList<>();
      int hd=0;
      root.hd=hd;
      q.add(root);
      while(!q.isEmpty())
      {
          node temp=q.remove();
          hd=temp.hd;
          map.put(hd, temp.data);
          if(temp.left!=null)
          {
              temp.left.hd=hd-1;
              q.add(temp.left);
          }
           if (temp.right != null) 
            { 
                temp.right.hd = hd+1; 
                q.add(temp.right); 
            } 
      }
      Set<Entry<Integer, Integer>> set = map.entrySet(); 
      
       Iterator<Entry<Integer, Integer>> iterator = set.iterator();
      
           while (iterator.hasNext()) 
        { 
            Map.Entry<Integer, Integer> me = iterator.next(); 
            System.out.print(me.getValue()+" "); 
        } 
     
}     
      
   
   public static void main(String args[])
   {
        node root = new node(20); 
        root.left = new node(8); 
        root.right = new node(22); 
        root.left.left = new node(5); 
        root.left.right = new node(3); 
        root.right.left = new node(4); 
        root.right.right = new node(25); 
        root.left.right.left = new node(10); 
        root.left.right.right = new node(14); 
         bottom_view tree = new bottom_view();
         System.out.println("bottom view:-");a
            tree.bottomview(root);
   }    
   
}
