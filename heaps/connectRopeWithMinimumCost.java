/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

import java.util.PriorityQueue;

public class connectDifferentRopes_minimumcost {
    
     public static int connectRopeWithMinimumCost(int[] ropes) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    for(int i = 0; i < ropes.length; i++) {
      minHeap.add(ropes[i]);
    }
    
    int minCost = 0;
    
    while(minHeap.size() > 1) {
      
      int tempCost = minHeap.poll() + minHeap.poll();
      minCost = minCost + tempCost;
      
      minHeap.add(tempCost);
    }
    
    return minCost;
  }
  
  public static void main(String[] args) {
    int arr[] = {3, 4, 7, 2};
    System.out.println(connectRopeWithMinimumCost(arr));
  }
}
