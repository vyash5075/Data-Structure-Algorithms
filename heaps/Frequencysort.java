/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Frequencysort {
    public static List<Character> sortStringBasedOnFrequencyOfCharacters(String str) {
    Map<Character, Integer> map = new HashMap<>();
    
    for(int i = 0; i < str.length(); i++) {
      map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
    }
    
    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
        (n1, n2) -> n2.getValue() - n1.getValue());
    
    maxHeap.addAll(map.entrySet());
    
    List<Character> list = new ArrayList<>();
    while(!maxHeap.isEmpty()) {
      Map.Entry<Character, Integer> entry = maxHeap.poll();
      
      list.add(entry.getKey());
      
    }
    
    return list;
  }
   public static void main(String[] args) {
    String str = "codingsimplified";
    
    System.out.println( sortStringBasedOnFrequencyOfCharacters(str));
  } 
}
