/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class minstack2 {
     Stack<Integer>data;
    int min;
    minstack2(){
        data=new Stack<>();
    }
    
    void push(int val){
        if(data.size()==0){
            data.push(val);
            min=val;
        }
        else if(val>=min){
            data.push(val);
        }
        else{
            min=val;
            int v=val+(val-min); //detection storing a fake smaller value
            data.push(v);
        }
    }
    
   int size(){
       return data.size();
   }
     int pop(){
              if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
       else{
                  int val=data.pop();
           if(data.peek()>=min){
               return data.pop();
           }
           else{
               int m=min; 
               min=m+m-data.peek();
               data.pop();
               return  m;
           }
       }    
        }
    int min(){
        if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return min;
        }
    }
    
    int top(){
       if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
       else{
           if(data.peek()>=min){
               return data.peek();
           }
           else{
               return  min;
           }
       }
    }
}
