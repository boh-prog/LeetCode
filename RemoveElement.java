/** 
##Easy
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums

Example:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

**/

class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
        int k = 0; // instantiate k for number of expectedNums in array
        
        if(nums.length == 0) return k; //if array is empty 
        
        
        //loop through array and replace occurence of given val
        for (int j=0; j<nums.length; j++)
        {
            if (nums[j]!=val) //
            {
                nums[k] = nums[j]; k++; //move the unique elements to the right index in the array and increment k
                
            }
        }
        return k++;
        
    }
}
