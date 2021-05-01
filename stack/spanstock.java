/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextgreater;
import java.util.*;
/**
 *
 * input : 9
 * [2,5,9,3,1,12,6,8,7]
 * output=[ 1,2,3,1,1,6,1,2,1]
 *
 *
 * @author yash verma
 */
public class java {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int nge[]=solve(arr);

         for(int i=0;i<nge.length;i++){
          System.out.print(nge[i]+"-");
        }
    }
    public static int[] solve(int arr[]){
        int span[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        
        return span;
    }

}
