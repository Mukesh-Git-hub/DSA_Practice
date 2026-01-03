package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
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


ArrayList<Integer> result = bfs(5,adj);
        System.out.println(result);

    }
    static void addedge(ArrayList<ArrayList<Integer>> adj,int v ,int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }
    static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs= new ArrayList<>();
        boolean vis[] =new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();
        int start  =1;
        q.add(start);
        vis[start]=true;

        while (!q.isEmpty()){
          Integer node = q.poll();
          bfs.add(node);
          for (Integer it : adj.get(node)){
              if(vis[it]== false){
                  vis[it]=true;
                  q.add(it);
              }
          }
        }
        return  bfs;
    }
}
