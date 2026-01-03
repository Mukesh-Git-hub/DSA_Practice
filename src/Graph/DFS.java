package Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        addedge(adj,1,2);
        addedge(adj,1,3);
        addedge(adj,2,1);
        addedge(adj,2,4);
        addedge(adj,3,4);
        addedge(adj,3,1);
        addedge(adj,4,2);
        addedge(adj,4,5);
        addedge(adj,5,2);
        addedge(adj,5,4);


       dfs(n,adj);

    }
    static void addedge(ArrayList<ArrayList<Integer>> adj,int v ,int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    static void dfs(int v,ArrayList<ArrayList<Integer>> adj){
        boolean vis[]=new boolean[v+1];
        vis[1]=true;
        ArrayList<Integer> ls=new ArrayList<>();
       dfsmethod(1,vis,adj,ls);
        System.out.println(ls);
    }

    public static void  dfsmethod(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {

        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                dfsmethod(it,vis,adj,ls);
            }

        }

    }

}
