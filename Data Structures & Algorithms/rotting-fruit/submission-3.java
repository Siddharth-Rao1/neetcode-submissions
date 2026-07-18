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
        int res=-1,fresh=0;
        Queue<Pair> q = new LinkedList<>(); 
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));             
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)return 0;        
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            int t=q.peek().time;q.remove();
            res=Math.max(res,t);
            int[] arow ={-1,0,1,0};
            int[] acol ={0,1,0,-1};
            for(int i=0;i<4;i++){
                int drow=row+arow[i];
                int dcol=col+acol[i];
                if(drow>=0 && drow<grid.length && dcol>=0 && dcol<
                grid[0].length && visited[drow][dcol]==false && 
                grid[drow][dcol]==1){
                    grid[drow][dcol]=2;
                    fresh--;
                    q.add(new Pair(drow,dcol,t+1));
                }
            }
        }
        if(fresh>0)return -1;
        return res;
    }    
}
