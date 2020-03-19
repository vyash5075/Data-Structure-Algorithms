
package trees;
import java.util.*;
public class topview {
    static class node{
        int data;
        node left;
        node right;
        node (int d)
        {
            this.data=d;
            left=null;
            right=null;
        }
    }
     public void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
     

     public void topvieww(node root)
     {
          class queueobj{
         node node;
         int hd;
         queueobj(node node,int hd)
         {
             this.node=node;
             this.hd=hd;
         }
     }
         Queue<queueobj>q=new LinkedList<>();
         Map<Integer,node>map=new TreeMap<Integer,node>();
         if(root==null)
         {
             return ;
             
         }
         else{
             q.add(new queueobj(root,0));
         }
         System.out.println("topview is");
         while(!q.isEmpty())
         {
             queueobj temp=q.poll();
             if(!map.containsKey(temp.hd))
             {
                 map.put(temp.hd,temp.node);
             } 
             if(temp.node.left!=null)
             {
                 q.add(new queueobj(temp.node.left, temp.hd - 1)); 
             }
             if(temp.node.right!=null)
             {
                 q.add(new queueobj(temp.node.right,temp.hd+1));
             }
             
         }
         for(Map.Entry<Integer,node>entry:map.entrySet())
         {
             System.out.println(entry.getValue().data);
         }
         
         
     }
    public static void main(String args[])
    {
        topview tree = new topview(); 
        node root=new node(1);
//        tree.root = new node(1); 
        root.left = new node(2); 
        root.right = new node(3); 
       root.left.right = new node(4); 
        root.left.right.right = new node(5); 
        root.left.right.right.right = new node(6);
       
//        tree.inorder(root);
        tree.topvieww(root);
    }
}
