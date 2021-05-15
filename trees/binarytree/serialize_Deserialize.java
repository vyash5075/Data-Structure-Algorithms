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
public class serialize_Deserialize {
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
      
      public void serialize(node node, List<Integer> list) {
    if (node == null) {
      list.add(-1);
      return;
    }

    list.add(node.data);
    
    serialize(node.left, list);
    serialize(node.right, list);
  }

  int deSerializeIndex = 0;

  public node deSerialize(List<Integer> list) {
    if (list.get(deSerializeIndex) == -1) {
      deSerializeIndex++;
      return null;
    }

    node newNode = new node(list.get(deSerializeIndex++));

    newNode.left = deSerialize(list);
    newNode.right = deSerialize(list);

    return newNode;
  }
        public static void main(String args[]){
      serialize_Deserialize b=new serialize_Deserialize();
         node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
        List<Integer> list= new ArrayList<>();
    b.serialize(root, list);
    
    root = b.deSerialize(list);
     
    }
}
