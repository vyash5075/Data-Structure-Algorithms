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
 * output=[5,9,12,12,12,-1,8,-1,-1]
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
        int nge[]=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>arr[st.peek()])
            {
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        
        
        return nge;
    }

}
