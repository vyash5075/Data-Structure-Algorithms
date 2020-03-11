/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class longestvalidpalin2 {
    
    public static int validpalin(String str)
    {
           
		    Stack<Integer> stack = new Stack<Integer>();
		    stack.push(-1);
		    int max = -1;
		    for(int i=0; i<str.length(); i++)
		    {
		        if(str.charAt(i) == '(')
                        {
		            stack.push(i);
                        }
		        else{
		            stack.pop();
		            if(stack.isEmpty())
                            {
		                stack.push(i);
                            }
		            else
                            {
		                max = Math.max(max, i-stack.peek());
                            }
		        }
		    }
		    return(max);
		
    }
    	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j = 0; j<n; j++)
		{
		    String str = sc.next();
                    System.out.println(validpalin(str));      
	}
}
}

