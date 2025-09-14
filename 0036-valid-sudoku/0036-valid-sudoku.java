class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m=board.length;
        int n=board[0].length;
       for(int i=0;i<m;i++)
       {
        Set<Character> s1=new HashSet<>();
        for(int j=0;j<n;j++)
        {
            if(board[i][j]=='.')
            {
                continue;
            }
            if(s1.contains(board[i][j]))
            {
                return false;
            }
            s1.add(board[i][j]);
        }
       }
       for(int i=0;i<n;i++)
       {
        Set<Character> s1=new HashSet<>();
        for(int j=0;j<m;j++)
        {
            if(board[j][i]=='.')
            {
                continue;
            }
            if(s1.contains(board[j][i]))
            {
                return false;
            }
            s1.add(board[j][i]);
        }
       }
       for(int sr=0;sr<m;sr+=3)
       {
        int er=sr+2;
        for(int sc=0;sc<n;sc+=3)
        {
            int ec=sc+2;
            if(!isvalid(board,sr,er,sc,ec))
            {
                return false;
            }
        }
       }
       return true;
    }
    public boolean isvalid(char[][] board,int sr,int er,int sc,int ec)
    {
        Set<Character> s1=new HashSet<>();
        for(int i=sr;i<=er;i++)
        {
            for(int j=sc;j<=ec;j++)
            {
                if(board[i][j]=='.')
            {
                continue;
            }
            if(s1.contains(board[i][j]))
            {
                return false;
            }
            s1.add(board[i][j]);
            }
        }
        return true;
    }
}