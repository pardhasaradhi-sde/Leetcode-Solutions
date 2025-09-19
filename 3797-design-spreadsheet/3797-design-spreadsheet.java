class Spreadsheet {
    int[][] spreadsheet;
    public Spreadsheet(int rows) {
        spreadsheet=new int[rows][26];
        for(int i=0;i<rows;i++)
        {
            Arrays.fill(spreadsheet[i],0);
        }
    }
    
    public void setCell(String cell, int value) {
        char c=Character.toLowerCase(cell.charAt(0));
        int col=c-'a';
        int row=Integer.parseInt(cell.substring(1))-1;
        spreadsheet[row][col]=value;
    }
    public void resetCell(String cell) {
        char c=Character.toLowerCase(cell.charAt(0));
        int col=c-'a';
        int row=Integer.parseInt(cell.substring(1))-1;
        spreadsheet[row][col]=0;
    }
    
    public int getValue(String formula) {
        formula=formula.substring(1);
        String[] parts=formula.split("\\+");
        int sum=0;
        for(String part:parts)
        {
            if(Character.isLetter(part.charAt(0)))
            {
                char c=Character.toLowerCase(part.charAt(0));
                int col=c-'a';
                int row=Integer.parseInt(part.substring(1))-1;
                sum+=spreadsheet[row][col];
            }
            else{
                sum+=Integer.parseInt(part);
            }
        }
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */