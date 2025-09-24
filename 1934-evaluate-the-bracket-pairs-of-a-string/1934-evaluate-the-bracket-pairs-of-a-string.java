class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> m1=new HashMap<>();
        for(List<String> l1:knowledge)
        {
            m1.put(l1.get(0),l1.get(1));
        }
        boolean open=false;
        StringBuilder res=new StringBuilder();
        StringBuilder comp=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(' && open==false)
            {
               open=true;
            }
            else if(open==true && c!=')')
            {
                comp.append(c);
            }
            else if( c==')' &&  open==true)
            {
                open=false;
                res.append(m1.getOrDefault(comp.toString(),"?"));
                comp=new StringBuilder();
            }
            else
            {
                res.append(c);
            }
        }
        return res.toString();
    }
}