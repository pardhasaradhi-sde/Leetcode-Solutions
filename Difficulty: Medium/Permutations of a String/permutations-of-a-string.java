class Solution {
    public ArrayList<String> findPermutation(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        String sorted=new String(c);
      ArrayList<String> res=new ArrayList<>();
      boolean used[]=new boolean[sorted.length()];
      backtrack(res,new StringBuilder(),sorted,used);
      return res;
    }
    public void backtrack(ArrayList<String> res,StringBuilder str,String s,boolean[] used)
    {
        if(str.length()==s.length())
        {
            res.add(str.toString());
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            if(i>0 && s.charAt(i)==s.charAt(i-1) && !used[i-1])
            {
                continue;
            }
            if(!used[i])
            {
                str.append(s.charAt(i));
                used[i]=true;
                backtrack(res,str,s,used);
                str.deleteCharAt(str.length()-1);
                used[i]=false;
            }
        }
    }
}