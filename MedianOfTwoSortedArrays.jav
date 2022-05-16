/**

Problem: 


**/
//----------------------------------------------------------------------------------------------

//My solution:

//----------------------------------------------------------------------------------------------


class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length==0 & nums2.length==0) return 0.00000;
        
        // create newArr to hold values in nums1 and nums2
        int[] newArr = new int[nums1.length + nums2.length];
        
        if(nums1.length==0 & nums2.length!=0)
        {
            newArr = nums2;
            return getMedian(newArr);
            
        }
        else if(nums1.length!=0 & nums2.length==0)
        {
            newArr = nums1;
            return getMedian(newArr);
            
        }
        //add all value sin nums1 and nums2 in sorted order into newArr
        else
        {
            int indx = 0; //index in newArr
            
            //use two pointers to compare values at each index in nums1 and nums2
            int p1 = 0; int p2 =0;
                
            //create a new array of sorted intergers from nums1 and nums2
            while (p1<nums1.length & p2<nums2.length)
            {
                if(nums1[p1] < nums2[p2])
                {
                    newArr[indx] = nums1[p1];
                    p1++;
                }
                else if(nums1[p1] > nums2[p2])
                {
                    newArr[indx] = nums2[p2];
                    p2++;
                }
                else if(nums1[p1] == nums2[p2])
                {
                    newArr[indx] = nums1[p1]; p1++;
                    indx ++;
                    newArr[indx] = nums2[p2]; p2++;
                }
                //move to next index in newArr
                indx++;
            }

            //add all remaining values in nums2 in new arr
            if(p1>=nums1.length & p2<nums2.length)  //add all remaining value sin nums2 in new arr
            {
                while(p2<nums2.length)
                {
                    newArr[indx] = nums2[p2];
                    indx++; p2++;
                }
            }
            //add all remainding values in num1 in new arr
            else if(p2>=nums2.length & p1<nums1.length) 
            {
                while(p1<nums1.length)
                {
                    // System.out.print(indx);
                    newArr[indx] = nums1[p1];
                    indx++; p1++;
                }
            }
            
        }
        //get median index and return median of sorted array
        return getMedian(newArr);
        
    }
    
    public double getMedian(int[] Arr)
    {
        for(int num : Arr)
        {
            System.out.print(num + " ");
        }
        
        
        int size = Arr.length;
        //get median index and return median of sorted array
        
        //even array
        if(Arr.length%2 == 0) 
        {
            double  median = (Arr[size/2] + Arr[size/2 -1] ) / 2.00000; 
            return median;
        }
        
        //odd array
        double median =  (Arr[size/2])/1.00000;
        
        return median;
    }
}


//--------------------------------------------------------------------------------------------------------------

//Best solution

//------------------------------------------------------





