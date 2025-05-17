class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
       Stack<Integer> s=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            int curr=nums2[i];
            while(!s.isEmpty() && s.peek()<=curr)
            {
                s.pop();
            }
            h1.put(curr,s.isEmpty()?-1:s.peek());
            s.push(curr);
        }
        int arr[]=new int[nums1.length];
        for(int j=0;j<nums1.length;j++)
        {
            arr[j]=h1.get(nums1[j]);
        }
        return arr;
    }
}