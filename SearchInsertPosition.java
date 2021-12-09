/**
##Easy

Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

**/

class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        int low =0; int high = nums.length-1; //set the first and last index of array to low and high
         
        //while low and high are not on the same value
        //continue moving through the array to find target
        while( low <= high) 
        {
            int mid = (low+high) / 2; //get value in middle of array
        
            if(target == nums[mid])  return mid; //if target is value at mid, return mid index
            
            //if its less than, then target can be found in left slice of array. Set high to mid-1 to move the upper bound index to the left.
            else if (target < nums[mid])
            {
                high = mid-1;
            }
            //else, target can be found in right slice of array. set low to mid+1 to move the lower bound index to the right
            else if (target > nums[mid])
            {
                low = mid+1;
            }
            
        }
        
      return low; //return low index if value is not in array. It's the index for insertion
    }
}
