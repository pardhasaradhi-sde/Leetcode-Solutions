class Solution {
    public void dothework(int[] image)
    {
        int left=0;
        int right=image.length-1;
        while(left<right)
        {
            image[left]=image[left]^image[right];
            image[right]=image[left]^image[right];
            image[left]=image[left]^image[right];
            left++;
            right--;
        }
        for(int i=0;i<image.length;i++)
        {
            if(image[i]==1)
            {
                image[i]=0;
            }
            else{
                image[i]=1;
            }
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            dothework(image[i]);
        }
        return image;
    }
}