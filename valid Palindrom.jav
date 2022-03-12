/**
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

**/




class Solution 
{
  public boolean isPalindrome(String S) 
    {
        //convert String to lowercase
        String s = S.toLowerCase();
        
        //remove all white spaces in string
         s.replaceAll("\\s+","");
        
        int head =0; int tail = s.length()-1;
        
        while(head <= tail)
        {
            //check whether character at head is alphnumeric or not
            if(!Character.isLetterOrDigit(s.charAt(head)))
            {
                //move head to next index towards the right
                head +=1;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(tail)))
            {
                //move tail to next index towards the left
                tail -= 1;
                continue;
            }
            //return false if characters on any non palindromic case
            if(s.charAt(head) != s.charAt(tail)) return false;
            
            //move head and tail to next indices 
            head ++; tail--;
        }
        return true;
        
        
    }
}
