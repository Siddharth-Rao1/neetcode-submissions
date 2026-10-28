class Solution {
    public void area(int[][]grid,boolean[][]visited,int row,int col,int[] cnt){
        visited[row][col]=true;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{row,col});
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int prow=curr[0],pcol=curr[1];
            for(int i=0;i<4;i++){
                int aRow=prow+drow[i],aCol=pcol+dcol[i];
                if(aRow>=0 &&aRow<grid.length&&aCol>=0          &&aCol<grid[0].length&&grid[aRow][aCol]==1&&visited[aRow][aCol]==false){
                    visited[aRow][aCol]=true;cnt[0]++;
                    q.add(new int[]{aRow,aCol});
                }
            }
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int res=0;int[] cnt=new int[1];
        int n=grid.length,m=grid[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visited[i][j]==false){
                    cnt[0]=1;
                    area(grid,visited,i,j,cnt);
                    res=Math.max(res,cnt[0]);
                    cnt[0]=0;
                }  
            }
        }
        return res;
    }
}
