class Solution {
    public int romanToInt(String s) {
        int result=0;
        Map<Character,Integer> m1=new HashMap<>();
        m1.put('I',1);
        m1.put('V',5);
        m1.put('X',10);
        m1.put('L',50);
        m1.put('C',100);
        m1.put('D',500);
        m1.put('M',1000);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int val=m1.get(c);
            if(i+1<s.length() && val<m1.get(s.charAt(i+1)))
            {
                result-=val;
            }
            else{
                result+=val;
            }
        }
        return result;

    }
}