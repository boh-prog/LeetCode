/**
##EASY
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.


Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

**/

class Solution 
{
    public int[] plusOne(int[] digits) 
    {
      //loop through array from the last index
        for(int indx=digits.length-1;indx>=0;indx--)
        {
                //check if value at last index is 9
                if(digits[indx]==9)
                {
                    digits[i]=0; //set value to 0 at 9+1 == 10, input 0 and carry 1 
                }
                else
                {
                  //increment value at index if less than 9
                    digits[indx]+=1;
                    return digits;
                }
        }
      //first value in array will be zero when value + 1 is greater than 9
      //in this case create new aray of length + 1
        if(digits[0]==0)
        {
            digits=new int[digits.length+1];
          //asigne the carry, 1, to index zero
            digits[0]=1;
        }

            return digits;
    }
}
