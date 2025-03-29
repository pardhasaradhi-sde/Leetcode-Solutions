/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=1;
        int j=n;
        while(true)
        {
            int mid=i+(j-i)/2;
            int myguess=guess(mid);
            if(myguess==1)
            {
                i=mid+1;
            }
            else if(myguess==-1)
            {
                j=mid-1;
            }
            else{
                return mid;
            }
        }
    }
}