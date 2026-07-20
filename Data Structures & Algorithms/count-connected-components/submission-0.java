class Solution {
    public int countComponents(int n, int[][] edges) {
        int res=0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){        
            if(!visited[i]){
                res++;
                dfs(adj,i,visited);
            }
        }
        return res;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int node,
    boolean[] visited){
        visited[node]=true;
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(adj,i,visited);
            }
        }
    }
}
