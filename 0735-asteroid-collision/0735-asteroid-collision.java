class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int cur=asteroids[i];
            if(cur>0)
            {
                s.push(asteroids[i]);
            }
            else{
            while(!s.isEmpty() && s.peek()<Math.abs(cur) && s.peek()>0)
            {
                s.pop();
            }
            if(!s.isEmpty() && s.peek()==Math.abs(cur) && s.peek()>0)
            { 
                s.pop();
            } 
            else if(s.isEmpty() || s.peek()<0)
            {
                s.push(cur);
            }
        }
        }
        int arr[]=new int[s.size()];
        for(int i=arr.length-1;i>=0;i--)
        {
            arr[i]=s.pop();
        }
        return arr;
    }
}