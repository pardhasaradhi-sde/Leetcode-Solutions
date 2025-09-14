class Solution {
    public boolean isplacable(String[] board,int row,int col,int n)
    {
        //check left
        int i=col;
        while(i>=0)
        {
            if(board[row].charAt(i)=='Q')
            {
                return false;
            }
            i--;
        }
        i=row;
        int j=col;
        while(i>=0 && j>=0)
        {
            if(board[i].charAt(j)=='Q')
            {
                return false;
            }
            i--;
            j--;
        }
        i=row;j=col;
        while(i<n && j>=0)
        {
            if(board[i].charAt(j)=='Q')
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void backtrack(int col,String[] board,List<List<String>> res,int n)
    {
        if(col==n)
        {
            res.add(new ArrayList<>(Arrays.asList(board)));
            return;
        }
        for(int row=0;row<n;row++)
        {
            if(isplacable(board,row,col,n))
            {
                char[] chars=board[row].toCharArray();
                chars[col]='Q';
                board[row]=new String(chars);
                backtrack(col+1,board,res,n);
                chars[col]='.';
                board[row]=new String(chars);
            }
        }
    }
        public List<List<String>> solveNQueens(int n) {
            List<List<String>> res=new ArrayList<>();
            String[] nqueen=new String[n];
            char []row=new char[n];
            Arrays.fill(row,'.');
            String emptyrow=new String(row);
            Arrays.fill(nqueen,emptyrow);
            backtrack(0,nqueen,res,n);
            return res;
        }
}