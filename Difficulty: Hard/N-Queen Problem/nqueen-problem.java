// User function Template for Java

class Solution {
    public boolean isplacable(char[][] board,int col,int row,int n)
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
        i=row;
        j=col;
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
    public void backtrack(int col,char[][] board,ArrayList<ArrayList<Integer>> res,int n)
    {
        if(col==n)
        {
            ArrayList<Integer> l1=new ArrayList<>();
            for(int i=0;i<board.length;i++)
            {
                for(int j=0;j<board[0].length;j++)
                {
                    if(board[i][j]=='Q')
                    {
                        l1.add(j+1);
                    }
                }
            }
            res.add(l1);
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isplacable(board,col,row,n))
            {
                board[row][col]='Q';
                backtrack(col+1,board,res,n);
                board[row][col]='.';
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
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