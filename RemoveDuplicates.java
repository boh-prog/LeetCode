/**
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums

##Example:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

**/


class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
            int k = 0; //instantiate number of unique elements in array.

            //if array contains no elements.
            if (nums.length == 0) 
            {
                return k;
            }
            
            //loop through the array and find unique values
            int current = nums[0];//assign first element in array to 'current' for comparison
            for (int i = 1; i < nums.length; i++) 
            {
                //if a different element from the 'current' is found, assign to the next index adjecent to current
                //and set current to the new unique element
                if (current != nums[i]) 
                {
                    nums[++k] = nums[i];
                    current = nums[i];
                }
            }

            return ++k; //return ++k because the Kth == k-1. Indices are always 1 less.
    }
}
