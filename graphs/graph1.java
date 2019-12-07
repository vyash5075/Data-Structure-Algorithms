import java.util.*;
public class graph1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of vertices");
        int ver=sc.nextInt();
        System.out.println("enter no. of edges");
        int edge=sc.nextInt();
        int matrix[][]=new int [ver][ver];
        for(int i=0;i<edge;i++)
        {
            System.out.println("source");
            int source=sc.nextInt();
            System.out.println("destination");
            int des=sc.nextInt();
            matrix[source][des]=1;
        }
        for(int i=0;i<ver;i++)
        {
            for(int j=0;j<ver;j++)
            {
                 System.out.print(matrix[i][j]);
            }
            System.out.println("");
           
        }
    }
}
