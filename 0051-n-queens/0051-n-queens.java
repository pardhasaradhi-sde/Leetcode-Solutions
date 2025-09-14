class Solution {
    public boolean isplacable(char[][] board,int row,int col,int n)
    {
        //check left
        int i=col;
        while(i>=0)
        {
            if(board[row][i]=='Q')
            {
                return false;
            }
            i--;
        }
        i=row;
        int j=col;
        while(i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i=row;j=col;
        while(i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void backtrack(int col,char[][] board,List<List<String>> res,int n)
    {
        if(col==n)
        {
            ArrayList<String> l1=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                l1.add(new String(board[i]));
            }
            res.add(l1);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isplacable(board,row,col,n))
            {
                board[row][col]='Q';
                backtrack(col+1,board,res,n);
                board[row][col]='.';
            }
        }
    }
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> res=new ArrayList<>();
            char[][] board=new char[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    board[i][j]='.';
                }
            }
            backtrack(0,board,res,n);
            return res;
        }
}