/*
The nambair number generator has devised a mechanism to process any given number and thus generate
a new resultant number.the mechanism is as follows , in the given mobile number starting with first digit
keep on adding all subsequent digits in the state (even and odd) of the sum of the digits is opposite 
to the state of first digit  . continue this from the subsequent digit ill the last digit of the mobile number
is reached concatenate the sum thus generated results in the number.

input : 98880127431
output: 26971

explanation : first digit is 9 which is odd,so we keep adding digits till sum becomes even
9+8=17 odd
17+8=25 odd
25+0=25 odd
25+1=26 even , so stop first pass here and remember the result 
now we enter the second pass
the second pass should start after the digit where we stop the first pass 2,8,8,0,1
now next first digit in second pasas is 2 which is even , now we have to sum up subsequence till odd sum found
2+7=9

third pass 4   find odd
4+3=7

fourth pass 1  end digit , no more digits to iterate so add directly in result

26971

*/


import java.util.*;
public class abc{
    public static void main(String args[]){
         int arr[]={8,6,1,3,2,5,7,9,1,0};
    System.out.println(num(arr));
    }
    
    public static int num(int arr[]){
        ArrayList<Integer>al=new ArrayList<Integer>();
        int n=arr.length;
        String s="";
        boolean even=false;
        int sum=arr[0];
        if(sum%2==0){
            even=false;
        }
        else{
            even=true;
        }
        Stack<Integer>st=new Stack<>();
        st.push(sum);
        int i=1;
        while(i<n){
            int result=st.peek()+arr[i];
            if(even &&result%2==0){
                al.add(result);
                st.pop();
                if(i<n){
                    i++;
                  even=arr[i]%2==0?false:true;
                    st.push(arr[i]);
                }
                if(i<n){
                    i++;
                }
                
            }
            
             else if(!even &&result%2!=0){
                al.add(result);
                st.pop();
                if(i<n){
                    i++;
                     even=arr[i]%2==0?false:true;
                    st.push(arr[i]);
                }
                
                if(i<n){
                    i++;
                }
                
            }
            
            else{
                int top=st.pop();
                st.push(result);
                i++;
            }
             
        }
        
        if(st.size()>0)
        al.add(st.pop());
        
         for(int v=0;v<al.size();v++){
        s+=al.get(v)+"";
    }
    return Integer.parseInt(s);
    }
}
