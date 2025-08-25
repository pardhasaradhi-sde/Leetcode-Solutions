// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> l1=new ArrayList<>();
        rec(0,l1,new StringBuilder(),s);
        Collections.sort(l1);
        return l1;
    }
    public void rec(int ind,List<String> l1,StringBuilder str,String s)
    {
        if(ind==s.length())
        {
            l1.add(new String(str.toString()));
            return;
        }
        str.append(s.charAt(ind));
        rec(ind+1,l1,str,s);
        str.deleteCharAt(str.length()-1);
        rec(ind+1,l1,str,s);
    }
}