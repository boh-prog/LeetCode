/**
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
**/

class Solution
{
    public int reverse(int x)     
    {
        int lastDigit = 0;
        int reversed = 0;
        
        while(x!=0)
        {
            //get last digit in origal string
            lastDigit = x%10;
            
            //reasign x to a new int value excluding the last digit
            x = x/10;
            
            //check if reversed is within range of signed 32-bit integer
            if(reversed > Integer.MAX_VALUE/10 || reversed==Integer.MAX_VALUE/10 && lastDigit>7) return 0;
            if(reversed < Integer.MIN_VALUE/10 || reversed==Integer.MIN_VALUE/10 && lastDigit<-8) return 0;
            
            //add lastDigit to reversed Integer
            reversed = (reversed * 10) + lastDigit;
        }
        
        return reversed;
    }
}
