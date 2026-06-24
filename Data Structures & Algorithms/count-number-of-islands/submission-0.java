public class Pair{
    int first,second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length,m=grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&& visited[i][j]==false){
                    res++;
                    dfs(i,j,visited,grid);
                }
            }
        }     
        return res;   
    }
    public void dfs(int row,int col,boolean[][] visited,char[][] grid){
        Queue<Pair> q = new LinkedList<>();
        int n=grid.length,m=grid[0].length;
        visited[row][col]=true;
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int ro=q.peek().first;
            int co=q.peek().second;
            q.remove();
            int[] drow = {-1, 0, 1, 0};
            int[] dcol ={0,1,0,-1};
           
            for(int i=0;i<4;i++){
                int arow=ro+drow[i];
                int acol=co+dcol[i];
                if(arow>=0&& arow<n && acol>=0 && acol<m && 
                grid[arow][acol]=='1'&& visited[arow][acol]==false){
                    visited[arow][acol]=true;
                    q.add(new Pair(arow,acol));
                }            
        }
        }
        
    }
}
