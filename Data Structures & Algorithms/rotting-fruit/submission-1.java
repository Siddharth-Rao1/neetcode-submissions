class Pair{
    int first;
    int second;
    int time;
    Pair(int first,int second,int time){
        this.first=first;
        this.second=second;this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length,m=grid[0].length,res=-1,fresh=0;
        Queue<Pair> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh == 0) return 0;
        while(!q.isEmpty()){
            Pair p =q.poll();
            int row=p.first,col=p.second,t=p.time;
            res=Math.max(res,t);
            int[] drow={-1,0,1,0};
            int[] dcol={0,1,0,-1};
            for(int i=0;i<4;i++){
                int arow=row+drow[i];
                int acol=col+dcol[i];
                if(arow>=0 && arow<n && acol>=0 && acol<m
                && grid[arow][acol]==1){
                    grid[arow][acol]=2;fresh--;
                    q.add(new Pair(arow,acol,t+1));
                }
            }
            
        }
        if(fresh>0)return -1;
        return res;
    }
    
}
