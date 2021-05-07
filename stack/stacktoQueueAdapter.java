/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

/**
 *
 * @author yash verma
 */
import java.util.*;
public class stacktoQueueAdapter {
     Stack<Integer>mainS;
    Stack<Integer>helperS;
    public stacktoQueueAdapter(){
        mainS=new Stack<>();
        helperS=new Stack<>();
    }
    int size(){
        return mainS.size();
    }
    void push(int val){
        while(mainS.size()>0){
            helperS.push(mainS.pop());
        }
        
        mainS.push(val);
        while(helperS.size()>0){
            mainS.push(helperS.pop());
        }
    }
    int pop(){
        if(size()==0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return mainS.pop();
        }
    }
}
