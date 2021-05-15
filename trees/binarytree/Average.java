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
public class Average {
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
    int sum;
  int count;
  
  public void getAverage(node node) {
    if (node == null) {
      return;
    }
    
    sum = sum + node.data;
    count = count + 1;

    getAverage(node.left);
    getAverage(node.right);
  }
    
     public static void main(String args[]){
        Average b=new Average();
         node root=new node(10);
        root.left=new node(5);
        root.right=new node(2);
        root.left.left=new node(11);
        root.left.right=new node(12);
        root.right.left=new node(13);
        root.right.right=new node(14);
          
        b.getAverage(root);
    System.out.println(b.sum / b.count);
        
    } 
}
