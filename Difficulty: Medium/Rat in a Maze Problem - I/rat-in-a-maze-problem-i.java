class Solution {
    // Function to find all possible paths
    public void backtrack(ArrayList<String> res,StringBuilder curr,int[][] maze,int row,int col)
    {
        if(row==maze.length-1 &&  col==maze[0].length-1)
        {
            res.add(curr.toString());
            return;
        }
        if(row<0 || col<0 || row>=maze.length || col>=maze[0].length || maze[row][col]==0)
        {
            return ;
        }
        maze[row][col]=0;
        curr.append('D');
        backtrack(res,curr,maze,row+1,col);
        curr.deleteCharAt(curr.length()-1);
        curr.append('L');
        backtrack(res,curr,maze,row,col-1);
        curr.deleteCharAt(curr.length()-1);
        curr.append('R');
        backtrack(res,curr,maze,row,col+1);
        curr.deleteCharAt(curr.length()-1);
        curr.append('U');
        backtrack(res,curr,maze,row-1,col);
        curr.deleteCharAt(curr.length()-1);
        maze[row][col]=1;
        
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res=new ArrayList<>();
        backtrack(res,new StringBuilder(),maze,0,0);
        return res;
    }
}