/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heaps;

class HeapImpl {
  
  int size;
  int[] arr = new int[20];
  
  public void insertNewValue(int val) {
    arr[size] = val;
    int index = size;
    int parent = (index - 1)/2;
    
    while(parent >= 0 && arr[parent] > arr[index]) {
      int t = arr[parent];
      arr[parent] = arr[index];
      arr[index] = t;
      
      t = parent;
      index = parent;
      parent = (t - 1) / 2;
    }
    
    size++;
  }
  
  public int peek() {
    return arr[0];
  }
  
  public int poll() {
    int max = arr[0];
    arr[0] = arr[size -1];
    size = size - 1;
    minHeapify(0);
    return max;
  }
  
  
public void print(){
   for(int i = 0; i<arr.length; i++) {
     System.out.print(arr[i]+" ");
    }  
}

  public void minHeapify(int index) {
    int l, r;
    l = 2 * index + 1;
    r = 2 * index + 2;
    
    int smallest = index; 
    if(l < this.size && arr[l] < arr[smallest]) {
      smallest = l;
    }
    
    if(r < this.size && arr[r] < arr[smallest]) {
      smallest = r;
    }
    
    if(smallest != index) {
      int t = arr[smallest];
      arr[smallest] = arr[index];
      arr[index] = t;
      
      minHeapify(smallest);
    }
  }
  
  public void buildMinHeap(int[] arr) {
    this.arr = arr;
    this.size = arr.length;
    
    for(int i = size/2 - 1; i >= 0; i--) {
      minHeapify(i);
    }
  }
}

public class minheap {
    public static void main(String[] args) {
    
    HeapImpl a = new HeapImpl();
    int[] arr = {10, 7, 11, 5, 20, 3, 2, 1};
    
    a.insertNewValue(arr[0]);
    a.insertNewValue(arr[1]);
    a.insertNewValue(arr[2]);
    
    System.out.println(a.peek());
    
    a.insertNewValue(arr[3]);
    a.insertNewValue(arr[4]);
    System.out.println(a.peek());
    
    a.insertNewValue(arr[5]);
    System.out.println(a.peek());
    
    a.insertNewValue(arr[6]);
    a.insertNewValue(arr[7]);
    System.out.println(a.peek());
    
    a.poll();
    System.out.println(a.peek());
    
    a.buildMinHeap(arr);
a.print();
  }
}
