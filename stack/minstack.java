/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class minstack {
    Stack<Integer>alldata;
    Stack<Integer>mindata;
    minstack(){
        alldata=new Stack<>();
        mindata=new Stack<>();
        
    }
    
    void push(int val){
        alldata.push(val);
        if(mindata.size()==0||val<=mindata.peek()){
            mindata.push(val);
        }
    }
    
   int size(){
       return 1;
   }
     int pop(){
             if(size()==0){
                System.out.println("Stack underflow");
                return -1;
            }
             else{
                 int val=alldata.pop();
               if(val== mindata.peek()){
                   mindata.pop();
               }return val;
             }
             
        }
    int min(){
        if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return mindata.peek();
        }
    }
}
