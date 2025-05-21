class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int posindex=0,negindex=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=pos.get(posindex++);
            }
            else{
                arr[i]=neg.get(negindex++);
            }
            
        }
        return arr;
    }
}