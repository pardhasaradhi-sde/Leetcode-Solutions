class Solution {
    public boolean exist(char[][] board, String word) {
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(board[i][j]==word.charAt(0) && wordexist(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean wordexist(char[][] board,String word,int row,int col,int ind)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(row<0|| col<0 || row>=board.length || col>=board[0].length || board[row][col]!=word.charAt(ind) || board[row][col]=='#')
        {
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        boolean found=wordexist(board,word,row+1,col,ind+1)||
                      wordexist(board,word,row-1,col,ind+1)||
                      wordexist(board,word,row,col+1,ind+1)||
                      wordexist(board,word,row,col-1,ind+1);
        board[row][col]=temp;
        return found;
    }   
}