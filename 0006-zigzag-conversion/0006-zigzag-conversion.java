class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i]=new StringBuilder();
        }

        int row = 0;
        boolean goingdown = true;

        for (int i = 0; i < s.length(); i++) {
            rows[row].append(s.charAt(i));
            if(goingdown)
            {
                if(row==numRows-1)
            {
                    goingdown=false;
                    row--;
            }
            else{
                row++;
            }
            }
            else{
                if(row==0)
                {
                    goingdown=true;
                    row++;
                }
                else{
                    row--;
                }
            }
            
        }

        StringBuilder st = new StringBuilder();
        for (int i = 0; i < rows.length; i++) {
            st.append(rows[i]);
        }
        return st.toString();
    }
}
