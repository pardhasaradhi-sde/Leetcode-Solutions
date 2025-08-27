class Solution {
    public int kthFactor(int n, int k) {
         List<Integer> factors = new ArrayList<>();
        List<Integer> lastfact=new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);  // smaller factor
                if (i!=n/i) {
                    lastfact.add(n / i); // paired factor
                }
            }
        }
        Collections.reverse(lastfact);
        factors.addAll(lastfact);
        if(k>factors.size())
        {
            return -1;
        }
        return factors.get(k-1);
    }
}