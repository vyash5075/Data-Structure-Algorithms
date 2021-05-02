/*
input: i d d d i d d d
output: 1 5 4 3 2 9 8 7 6 
 */
package stackqueues;

import java.util.*;
public class smallestnumberfollowingpattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Integer>st=new Stack<>();
        int num=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='d'){
                st.push(num);
                num+=1;
            }
            else{
                st.push(num);
                num+=1;
                while(st.size()!=0){
                    System.out.println(st.pop());
                }
            }
        }
         st.push(num);
        while(st.size()!=0){
                    System.out.println(st.pop());
                }
    }
}
