class Pair{
    int first;
    int second;
    int dist;
    Pair(int first,int second,int dist){
        this.first=first;
        this.second=second;
        this.dist=dist;
    }
}
class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new Pair(i,j,0));
                }
            }
        }
        while(!q.isEmpty()){
            Pair temp = q.poll();
            int row=temp.first,col=temp.second,dist=temp.dist;
            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};
            for(int i=0;i<4;i++){
                int arow=row+drow[i];
                int acol=col+dcol[i];
                if(arow>=0 && arow<n && acol>=0&&acol<m
                && grid[arow][acol] == Integer.MAX_VALUE){
                    grid[arow][acol]=Math.min(grid[arow][acol],dist+1);
                    q.add(new Pair(arow,acol,dist+1));
                }
            }
        }
    }
}
