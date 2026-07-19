class Pair{
    int first;
    int second;
    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public void solve(char[][] board) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        Queue<Pair> q = new LinkedList<>();
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
                q.add(new Pair(i,0));
            }
            if(board[i][board[0].length-1]=='O'){
                q.add(new Pair(i,board[0].length-1));
            }           
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
                q.add(new Pair(0,i));
            }
            if(board[board.length-1][i]=='O'){
                q.add(new Pair(board.length-1,i));
            }           
        }
       
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col =q.peek().second;
            board[row][col]='#';
            q.remove();
            int[] drow ={-1,0,1,0};
            int[] dcol ={0,1,0,-1};
            for(int i=0;i<4;i++){
                int crow=row+drow[i];
                int ccol=col+dcol[i];
                if(crow>=0 && crow<board.length && ccol>=0 && ccol<board[0].length && board[crow][ccol]=='O'
                )  {
                    q.add(new Pair(crow,ccol));

                }              
            }            
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '#'){
                    board[i][j] = 'O';
                }
            }
        }
    }
}
