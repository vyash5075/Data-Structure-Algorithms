import java.util.*;
public class graph_dfs {
    private int V;
    private LinkedList<Integer> adj[];
    
    graph_dfs(int v)
    {
        V=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]=new LinkedList();
    }
    void add(int v,int w)
    {
        adj[v].add(w);
        
    }
    void dfs(int v,boolean visited[])
    {
        visited[v]= true;
            System.out.print(v+" ");
            Iterator<Integer>i=adj[v].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                
                if(!visited[n])
                    dfs(n,visited);
                
            }
    }
    void dfss()
    {
        boolean visited[]=new boolean[V];
        for(int i=0;i< V;++i)
        if(visited[i]==false)
            dfs(i,visited);
}
    public static void main(String args[])
    {
        graph_dfs g=new graph_dfs(4);
        g.add(0,1);
        g.add(0,2);
        g.add(1,2);
        g.add(2,0);
        g.add(2,3);
        g.add(3,3);
        System.out.println("following is depth traversal");
        g.dfss();
        
    }
}
