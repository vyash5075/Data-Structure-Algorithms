/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueues;

/**
 * input  5
0 1 1 1 1 
1 0 0 1 0 
1 0 0 1 0 
0 0 0 0 0 
0 1 0 1 0 
* 
* output  3
 * @author yash verma
 */
import java.util.*;
public class celebrity {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                arr[j][k]=sc.nextInt();
            }
        }
            findcelebrity(arr);
        
    }
    public static void findcelebrity(int arr[][]){
            Stack<Integer>st=new Stack<>();
            for(int i=0;i<arr.length;i++){
                st.push(i);
            }
            while(st.size()>=2){
              int i=st.pop();
              int j=st.pop();
              
              if(arr[i][j]==1){
                  //i is not a celebrity
                 st.push(j); 
              }else{
                  st.push(i);
              }
            }
            int pot=st.pop();
            System.out.println(pot+"d");
            
            for(int j=0;j<arr.length;j++){
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[j][k]+" ");
            }
            System.out.println();
            }
            for(int i=0;i<arr.length;i++){
                if(i!=pot){
                    if(arr[i][pot]==0||arr[pot][i]==1){
                        
                        System.out.println(arr[i][pot]+"none"+arr[pot][i]);
                        return;
                    }
                }
            }
            System.out.println(pot);
            
    }
}
