/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amcat;
import java.util.*;
/**
 *
 * @author yash verma
 */
public class bomb {
       static int[] bombDiff(int size, int key, int [] msg)
    {
        int sum;
        int result[]=new int[size];
        for(int i=0;i<size;i++)
        {
            sum=0;
            if(key>0)
            {
                for(int j=0;j<size;j++)
                {
                    if(j==i)
                    { continue;}
                    sum=sum+msg[j];
                }
               result[i]=sum;
            }
            else if(key<0)
            {
                sum=0;
                for(int j=0;j<i;j++)
                {
                    sum=sum+msg[j];
                }
                result[i]=sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int key=sc.nextInt();
        int msg[]=new int[size];
        int c[]=new int[size];
        for(int i=0;i<size;i++)
        {
            msg[i]=sc.nextInt();
        }
      c=bombDiff(size,key,msg);
      for(int i=0;i<size;i++)
      {
        System.out.print(c[i]+" ");
      }
    }
}
