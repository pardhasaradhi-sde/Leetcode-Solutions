class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int second=-1;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
               int digit=Character.getNumericValue(s.charAt(i));
               if(digit>largest)
               {
                second=largest;
                largest=digit;
                
               }
               else if(digit<largest && digit>second)
               {
                second=digit;
               }
            }
        }
        return second;
        
    }
}