class Solution {
    public boolean canweplace(int[] positions,int dist,int magnets)
    {
        int last=positions[0],magnet=1;
        for(int i=1;i<positions.length;i++)
        {
            if(positions[i]-last>=dist)
            {
                magnet++;
                last=positions[i];
            }
        }
        return magnet>=magnets;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int min=1;
        int n=position.length;
        int max=position[n-1]-position[0];
        int ans=max-1;
        while(min<=max)
        {
            int mid=min+(max-min)/2;
            if(canweplace(position,mid,m))
            {
                ans=mid;
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return ans;
    }
}