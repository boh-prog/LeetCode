class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int maxSum = Integer.MIN_VALUE; //instantiate minimum interger val
        int currSum = 0; //set the current subArray sum to 0
        
        //loop through array and compare contiguous values to the current sum
        for (int i = 0; i < nums.length; i++) 
        {
            //
            if (currSum + nums[i] > nums[i]) 
            {
                currSum += nums[i]; //if current sum and next contiguous value is higher than that val, set it to current sum
            }
            else 
            {   //else set current sum to the next contiguous val, as it's greater
                currSum = nums[i];
            }
            maxSum = Math.max(maxSum, currSum); //assigne currSum to maxSum
        }    
        return maxSum; // return maxSum
        
    }
}
