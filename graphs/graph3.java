import java.util.*;
public class graph3 {
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
    
    int flag=0;
    for(int i=0;i<ver;i++)
    {
        for(int j=0;j<ver;j++)
        {
        if(matrix[i][j]==1)
        {
            
            flag++;
        }
    }
    }
    if(flag==(ver*ver))
    {
     System.out.println("complete graph");
    
    }
    else
    {
        System.out.println("incomplete graph");
    }
   
}
}