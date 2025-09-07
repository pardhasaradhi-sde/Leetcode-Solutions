// User function Template for Java

class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> l1=new ArrayList<>();
        subs(0,l1,new ArrayList<>(),arr);
        l1.sort((a,b)->{
            for(int i=0;i<Math.min(a.size(),b.size());i++)
            {
                if(!a.get(i).equals(b.get(i)))
                {
                    return a.get(i)-b.get(i);
                }
            }
            return a.size()-b.size();
        });
        return l1;
    }
    public void subs(int ind,ArrayList<ArrayList<Integer>> l1,ArrayList<Integer> cur,int[] arr)
    {
        if(ind==arr.length)
        {
            l1.add(new ArrayList<>(cur));
            return;
        }
        cur.add(arr[ind]);
        subs(ind+1,l1,cur,arr);
        cur.remove(cur.size()-1);
        subs(ind+1,l1,cur,arr);
    }
}