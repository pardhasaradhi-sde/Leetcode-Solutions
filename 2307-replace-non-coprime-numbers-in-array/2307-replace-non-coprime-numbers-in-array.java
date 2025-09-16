import java.util.*;

class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (int)((long)a * b / gcd(a, b)); // prevent overflow
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
       List<Integer> res=new ArrayList<>();
       Stack<Integer> s=new Stack<Integer>();
       for(int i=0;i<nums.length;i++)
       {
        s.push(nums[i]);
        while(s.size()>1)
        {
            int a=s.pop();
            int b=s.pop();
                int gcdp=gcd(a,b);
                if(gcdp>1)
                {
                    s.push(lcm(a,b));
                }
                else{
                    s.push(b);
                    s.push(a);
                    break;
                }
        }
       }
       for(int i=s.size()-1;i>=0;i--)
        {
            res.add(s.pop());
        }
        Collections.reverse(res);
        return res;
    }
}
