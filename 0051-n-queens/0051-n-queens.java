class Solution {
    boolean[] leftrow;
    boolean[] bottomleftdiag;
    boolean[] topleftdiag;
    public boolean isplacable(char[][] board,int row,int col,int n,boolean[] leftrow,boolean[] bottomleftdiag,boolean[] topleftdiag)
    {
        if(leftrow[row] || bottomleftdiag[row+col] || topleftdiag[n-1+col-row])
        {
            return false;
        }
        return true;
    }
    public void backtrack(int col,char[][] board,List<List<String>> res,int n,boolean[] leftrow,boolean[] bottomleftdiag,boolean[] topleftdiag)
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
            if(isplacable(board,row,col,n,leftrow,bottomleftdiag,topleftdiag))
            {
                board[row][col]='Q';
                leftrow[row]=true;
                bottomleftdiag[row+col]=true;
                topleftdiag[n-1+col-row]=true;
                backtrack(col+1,board,res,n,leftrow,bottomleftdiag,topleftdiag);
                board[row][col]='.';
                leftrow[row]=false;
                bottomleftdiag[row+col]=false;
                topleftdiag[n-1+col-row]=false;
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
            leftrow=new boolean[n];
            topleftdiag=new boolean[2*n-1];
            bottomleftdiag=new boolean[2*n-1];
            backtrack(0,board,res,n,leftrow,topleftdiag,bottomleftdiag);
            return res;
        }
}