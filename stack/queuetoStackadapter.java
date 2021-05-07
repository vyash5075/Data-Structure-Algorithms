/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class queuetoStackadapter {
    Queue<Integer>mainQ;
    Queue<Integer>helperQ;
    public queuetoStackadapter(){
        mainQ=new ArrayDeque<>();
        helperQ=new ArrayDeque<>();
    }
    int size(){
        return mainQ.size();
    }
    void push(int val){
        while(mainQ.size()>0){
            helperQ.add(mainQ.remove());
        }
        
        mainQ.add(val);
        while(helperQ.size()>0){
            mainQ.add(helperQ.remove());
        }
    }
    int pop(){
        if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return mainQ.remove();
        }
    }
}
