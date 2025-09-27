class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxarea=-1.0;
        for(int i=0;i<points.length;i++)
        {
            for(int j=i+1;j<points.length;j++)
            {
                for(int k=i+1;k<points.length;k++)
                {
                    int[] p1=points[i],p2=points[j],p3=points[k];
                    double area=0.5*(Math.abs(
                        p1[0]*(p2[1]-p3[1])+
                        p2[0]*(p3[1]-p1[1])+
                        p3[0]*(p1[1]-p2[1])
                    ));
                    maxarea=Math.max(area,maxarea);
                }
            }
        }
        return maxarea;
    }
}