/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

import java.util.*;
public class queueimplementtion {
    public static void main(String args[]){
        Queue<Integer>que=new ArrayDeque<>();
        que.add(10);
        System.out.println(que);
        System.out.println(que);
        que.add(20);
         System.out.println(que);
        que.add(30);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.peek());
    } 
}
