class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        Integer candidate1=null,candidate2=null;
        for(int num:nums)
        {
            if(candidate1!=null && candidate1==num)
            {
                count1++;
            }
            else if(candidate2!=null && candidate2==num)
            {
                count2++;
            }
            else if(count1==0)
            {
                candidate1=num;
                count1=1;
            }
            else if(count2==0)
            {
                candidate2=num;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums)
        {
            if(candidate1==num)
            {
                count1++;
            }
            else if(candidate2==num){
                count2++;
            }
        }
        List<Integer> l1=new ArrayList<>();
        if(count1>nums.length/3)
        {
            l1.add(candidate1);
        }if(count2>nums.length/3)
        {
            l1.add(candidate2);
        }
        return l1;
    }
}