class Solution {
    public void dothework(int[] image)
    {
        int left=0;
        int right=image.length-1;
        while(left<=right)
        {
           int l=image[left]^1;
           int r=image[right]^1;
           image[left]=r;
           image[right]=l;
           left++;
           right--;
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