/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;
import java.util.*;
public class buildnormalstack {
    public static class customstack{
        int data[];
        int tos;
        public customstack(int cap){
            data=new int[cap];
            tos=-1;
        }
        
        int size(){
            return tos+1;
        }
        void display(){
            for(int i=tos;i>=0;i++){
                System.out.print(data[tos]+" ");
                
            }
            System.out.println();
        }
        void push(int val){
            if(tos==data.length-1){
                System.out.println("Stack overflow");
        }
            else{
                tos++;
                data[tos]=val;
            }
        }
           
        int pop(){
             if(tos==-1){
                System.out.println("Stack underflow");
                return -1;
            }
             else{
                 int val=data[tos];
                 tos--;
                 return val;
             }
        }
        int top(){
            if(tos==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                return data[tos];
            }
        }
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        customstack st=new customstack(n);
        String str=sc.nextLine();
        while(str.equals("quit")==false){
            if(str.startsWith("push")){
                int val=Integer.parseInt(str.split(" ")[1]);
                st.push(val);
                
            }
            else if(str.startsWith("pop")){
                int val=st.pop();
                if(val!=-1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("size")){
                System.out.println(st.size());
            }
            else if(str.startsWith("display")){
                st.display();
            }
            
            
        }
    }
}
