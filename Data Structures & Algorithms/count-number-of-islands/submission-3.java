class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int res=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j]&&grid[i][j]=='1'){
                    res++;
                    bfs(grid,i,j,visited);
                }
            }
        }
        return res;
    }
    public void bfs(char[][] grid,int prow,int pcol,boolean[][] visited){
        Queue<Pair> q = new LinkedList<>();
        visited[prow][pcol]=true;
        q.add(new Pair(prow,pcol));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};
            for(int i=0;i<4;i++){
                int arow=row+drow[i];
                int acol=col+dcol[i];
                if(arow>=0 && arow<grid.length && acol>=0 && acol
                <grid[0].length && grid[row][col]=='1' && visited[arow]
                [acol]==false){
                    visited[arow][acol]=true;
                    q.add(new Pair(arow,acol));
                }
            }
        }
    }
}
