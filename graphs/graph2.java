import java.util.*;
public class graph2 {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no. of vertices");
    int ver=sc.nextInt();
    System.out.println("enter the no. of edges");
    int edge=sc.nextInt();
    int matrix[][]=new int[ver][ver];
    for(int i=0;i<edge;i++)
    {
        System.out.println("Source");
        int source=sc.nextInt();
        System.out.println("destination");
        int des=sc.nextInt();
        matrix[source][des]=1;
    }
    System.out.println("enter the vertex to find its out degree");
    int val=sc.nextInt();
    int degree=0;
    for(int i=0;i<ver;i++)
    {
        if(matrix[val][i]==1)
        {
            
            degree++;
        }
    }
     System.out.println("outdegree"+degree);
    
    }
   
}
