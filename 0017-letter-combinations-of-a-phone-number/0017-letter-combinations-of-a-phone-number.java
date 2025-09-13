class Solution {
    public void backtrack(int ind,String digits,StringBuilder curr,List<String> res,Map<Integer,String> num)
    {
        if(ind==digits.length())
        {
            if(curr.length()>0)
            {
                res.add(curr.toString());
                return;
            }
        }
        String letters=num.get(digits.charAt(ind)-'0');
        for(int j=0;j<letters.length();j++)
        {
            curr.append(letters.charAt(j));
            backtrack(ind+1,digits,curr,res,num);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
        {
            return res;
        }
        Map<Integer,String> num=new HashMap<>();
        num.put(2,"abc");
        num.put(3,"def");
        num.put(4,"ghi");
        num.put(5,"jkl");
        num.put(6,"mno");
        num.put(7,"pqrs");
        num.put(8,"tuv");
        num.put(9,"wxyz");
    backtrack(0,digits,new StringBuilder(),res,num);
    return res;
    }
}