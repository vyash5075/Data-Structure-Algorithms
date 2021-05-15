 
package Binary_tree;
 import java.util.*;
public class averageofeachlevel {
          static class Node {
  Node left;
  Node right;
  int data;
}
        public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.data = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
        public List<Integer> levelOrderAverage(Node node) {
    if (node == null) {
      return new ArrayList<Integer>();
    }

    List<Integer> avgList = new ArrayList<Integer>();
    
    Queue<Node> q = new LinkedList<Node>();
    q.add(node);

    while (true) {
      int queueSize = q.size();
      if (queueSize == 0) {
        break;
      }

      int sum = 0;
      int count = 0;
      
      
      while (queueSize > 0) {
        Node headNode = q.remove();
        
        sum = sum + headNode.data;
        count++;
        
        if (headNode.left != null) {
          q.add(headNode.left);
        }

        if (headNode.right != null) {
          q.add(headNode.right);
        }

        queueSize--;
      }
      
      avgList.add(sum / count);
    }
    
    return avgList;
  }
  
        
        public static void main(String[] args) {

    averageofeachlevel a = new averageofeachlevel();

    Node root = a.createNewNode(1);
    root.left = a.createNewNode(2);
    root.right = a.createNewNode(4);
    root.left.left = a.createNewNode(10);
    root.left.right = a.createNewNode(20);
    root.right.right = a.createNewNode(30);
    
    
    System.out.println(a.levelOrderAverage(root));
  }
}
