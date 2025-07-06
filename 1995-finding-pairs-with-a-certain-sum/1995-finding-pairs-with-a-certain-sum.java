class FindSumPairs {
    int nums1[];
    int nums2[];
    HashMap<Integer,Integer> freqmap;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        this.freqmap=new HashMap<>();
        for(int num:nums2)
        {
            freqmap.put(num,freqmap.getOrDefault(num,0)+1);
        }
    }
    
    public void add(int index, int val) {
        int oldval=nums2[index];
        freqmap.put(oldval,freqmap.get(oldval)-1);
        if(freqmap.get(oldval)==0)
        {
            freqmap.remove(oldval);

        }
        nums2[index]+=val;
        int newval=nums2[index];
        freqmap.put(newval,freqmap.getOrDefault(newval,0)+1);
    }
    
    public int count(int tot) {
        int totalpairs=0;
        for(int i=0;i<nums1.length;i++)
        {
            int comp=tot-nums1[i];
            if(freqmap.containsKey(comp))
            {
                totalpairs+=freqmap.get(comp);
            }
        }
        return totalpairs;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */