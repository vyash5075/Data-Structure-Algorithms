import java.util.*;
public class graph4 {
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
    System.out.println("eneter verttex1");
    int ver1=sc.nextInt();
    System.out.println("enter vertex2");
    int ver2=sc.nextInt();
    if(matrix[ver1][ver2]==1||matrix[ver2][ver1]==1)
    {
        System.out.println("adjacent");
        
    }
    else
    {
        System.out.println("not adjacent");
    }
            }
}