class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
       ArrayList<ArrayList<Integer>> gra=new ArrayList<>();
       for(int i=0;i<v;i++)
       {
           gra.add(new ArrayList<>());
       }
       for(int[] e:edges)
       {
            gra.get(e[0]).add(e[1]);
           gra.get(e[1]).add(e[0]);
       }
       int color[]=new int[v];
       return solve(0,v,m,color,gra);
    }
    boolean issafe(ArrayList<ArrayList<Integer>> gra,int[] color,int node,int c)
    {
        for(int neigh:gra.get(node))
        {
            if(color[neigh]==c)
            {
                return false;
            }
        }
        return true;
    }
    boolean solve(int node,int V,int m,int[] color,ArrayList<ArrayList<Integer>> gra)
    {
        if(node==V)
        {
            return true;
        }
        for(int c=1;c<=m;c++)
        {
            if(issafe(gra,color,node,c))
            {
                color[node]=c;
                if(solve(node+1,V,m,color,gra))
                {
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
}