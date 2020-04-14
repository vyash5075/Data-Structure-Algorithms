

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array


Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6




import java.util.*;
/**
 *
 * @author yash verma
 */
public class gfgques1 {
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases!=0)
        {
            int n=sc.nextInt();
            int rotate=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            StringBuffer s=new StringBuffer();
            for(int i=rotate;i<n;i++)
            {
                s.append(arr[i]+" ");
            }
            for(int i=0;i<rotate;i++)
            {
                s.append(arr[i]+" ");
            }
            System.out.println(s);
            testcases--;
        }        
    }
}
