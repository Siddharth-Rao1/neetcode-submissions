class Solution {
    public void solve(char[][] board) {
        int n=board.length,m=board[0].length;
        if (board.length == 0 || board[0].length == 0) return;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'){
                q.add(new int[]{i,0});
            }
            if(board[i][m-1]=='O'){
                q.add(new int[]{i,m-1});
            }
        }
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                q.add(new int[]{0,i});
            }
            if(board[n-1][i]=='O'){
                q.add(new int[]{n-1,i});
            }
        }
        boolean[][] visited=new boolean[n][m];
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int cRow=curr[0],cCol=curr[1];
            board[cRow][cCol]='#';
            int[] r={0,1,0,-1};
            int[] c={1,0,-1,0};
            for(int i=0;i<4;i++){
                int prow=cRow+r[i];
                int pcol=cCol+c[i];
                if(prow>=0&&pcol>=0&&prow<n&&pcol<m&&visited[prow][pcol]==false && board[prow][pcol]=='O'){
                   q.add(new int[]{prow,pcol}); 
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
    }
}
