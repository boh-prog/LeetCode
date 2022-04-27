/***
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:

Input: nums = [0,0,0], target = 1
Output: 0

**/


class Solution
{
    public int threeSumClosest(int[] nums, int target) 
    {
         // if(nums.length<3) return ;
        
        Arrays.sort(nums);
        //
        
        // System.out.println(Arrays.toString(nums));
        int result = nums[0] + nums[1] + nums[nums.length-1];
        // int difference = Integer.MAX_VALUE;
    
        //loop through each num in array and use two pointers to find the other 2 numbers that adds up to zero
        for(int i=0; i<nums.length; i++)
        {
            //make sure not to check same number twice
            if(i > 0 && nums[i-1] == nums[i]) continue;

            int leftP = i+1; int rightP = nums.length-1;
            System.out.println(leftP +" " + rightP + " " + i);


            while(leftP<rightP)
            {
                int curSum = nums[leftP]+ nums[rightP] + nums[i];
                if( curSum > target ) 
                {
                    // difference = currDiff;
                    // result = nums[leftP]+ nums[rightP] + nums[i];

                    // System.out.println(difference + " " + result + " ");

                    //check if the next values to current pointers are the same. If so skip them
                    // while(leftP<rightP && nums[rightP]==nums[rightP-1]) rightP--;
                    // while(leftP<rightP && nums[leftP]==nums[leftP+1]) leftP++;

                    //move left and right pointers to the next values in array
                    // leftP++; 
                    rightP--;
                }
                else
                {                        
                    //check if the next values to current pointers are the same. If so skip them
                    // while(leftP<rightP && nums[rightP]==nums[rightP-1]) rightP--;
                    // while(leftP<rightP && nums[leftP]==nums[leftP+1]) leftP++;

                    //move left and right pointers to the next values in array
                    leftP++; //rightP--;
                }
                
                if(Math.abs(curSum - target) < Math.abs(result-target))
                {
                    result = curSum;
                }
            }
        }
        
        return result;
    }
}
