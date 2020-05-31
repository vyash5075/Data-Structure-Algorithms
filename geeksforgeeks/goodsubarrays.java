
package geeksforgeeks;
import java.util.*;
/**
 *
 * @author yash verma
 


intput:   4
            5
            1 2 3 4 5
            0  0 0 0 0 
output:   15
            1 2 3 4 5
            0 0 1 0 0 
output:   12
            5 4 3 2 1 
            1 1 1 1 1 
output :0
           5 4 3 2 1
           0 0 0 0 0 
output: 0


*/
public class goodsubarrays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
            int m=sc.nextInt();
            int ar1[]=new int[m];
            int ar2[]=new int [m];
            for(int i=0;i<m;i++)
            {   ar1[i]=sc.nextInt(); } 
            for(int i=0;i<m;i++)
            {  ar2[i]=sc.nextInt();  }
            
            int count=0;
             if(ar2[0]==0)
                {
                    count=count+ar1[0];
                }
            for(int i=1;i<m-1;i++)
            { 
                if(ar1[i]<ar1[i+1])
                {
                    if(ar2[i]==0)
                    {
                        count=count+ar1[i];
                    }  
                }
                else{
                    break;
                }
            }
            if((ar1[m-1]>ar1[m-2])&&ar2[m-1]==0)
            {
                count=count+ar1[m-1];
            }
            System.out.println("dnd"+count);
        }
    }
}

