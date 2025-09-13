class Solution {
    static public boolean isWordExist(char[][] mat, String word) {
        int rows=mat.length;
        int cols=mat[0].length;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(dfs(mat,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    static public boolean dfs(char[][] mat,String word,int row,int col,int ind)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(row<0 || row>=mat.length|| col<0 || col>=mat[0].length || mat[row][col]!=word.charAt(ind))
        {
            return false;
        }
        char temp=mat[row][col];
        mat[row][col]='#';
        boolean found=dfs(mat,word,row+1,col,ind+1)||
                      dfs(mat,word,row-1,col,ind+1)||
                      dfs(mat,word,row,col+1,ind+1)||
                      dfs(mat,word,row,col-1,ind+1);
        mat[row][col]=temp;
        return found;
    }
}