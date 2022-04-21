/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

 

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:

Input: nums = []
Output: []

Example 3:

Input: nums = [0]
Output: []

**/

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        if(nums.length<3) return null;
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList();
        
        //loop through each num in array and use two pointers to find the other 2 numbers that adds up to zero
        for(int i=0;i<nums.length; i++)
        {
            //make sure not to check same number twice
            if( i==0 || (i>0 && nums[i]!=nums[i-1]))
            {
                
                int leftP = i+1; int rightP = nums.length-1;
                int target = 0 - nums[i];
                
                while(leftP<rightP)
                {
                    if(nums[leftP]+nums[rightP] < target ) leftP++;
                    else if(nums[leftP]+nums[rightP] > target) rightP--;
                    else
                    {
                        // List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[leftP], nums[rightP]));
                        int[] numbers = {nums[i], nums[leftP], nums[rightP]};
                        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
                        //add lists to resulting list
                        result.add(list);

                        //check if the next values to current pointers are the same. If so skip them
                        while(leftP<rightP && nums[rightP]==nums[rightP-1]) rightP--;
                        while(leftP<rightP && nums[leftP]==nums[leftP+1]) leftP++;
                        
                        //move left and right pointers to the next values in array
                        leftP++; rightP--;
                    }
                }
            }
        }
        
        return result;
    }
        
}
