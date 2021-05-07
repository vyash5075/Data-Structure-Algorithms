/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;
import java.util.*;
/**
 *  input= [6,2,5,4,5,1,6]
 *  output=12
 * @author yash verma
 */
public class largestareahistogram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int rb[]=new int[arr.length];  //next smaller index on the right
        Stack<Integer>st=new Stack<>();
        st.push(arr.length-1);
        rb[arr.length-1]=arr.length;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                rb[i]=arr.length;
            }
            else{
                rb[i]=st.peek();
            }
            st.push(i);
        }
        
        
        
        int lb[]=new int[arr.length];  //next smaller index on the left
       Stack<Integer>st2=new Stack<>();
       st2.push(0);
       lb[0]=-1;
       for(int i=1;i<arr.length;i++){
          while(st2.size()>0&&arr[i]<arr[st2.peek()])
          {
              st2.pop();
           }
          if(st2.size()==0){
              lb[i]=-1;
          }
          else{
              lb[i]=st2.peek();
          }
          st2.push(i);
       }
        
        int maxarea=0;
         for(int i=0;i<arr.length;i++){
             int width=rb[i]-lb[i]-1;
             int area=width*arr[i];
             
             if(area>maxarea){  
                 maxarea=area;
             }
         }
         System.out.println(maxarea+",,");
    }
}
