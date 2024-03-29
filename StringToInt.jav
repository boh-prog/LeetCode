/**
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 

Example 1:

Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
**/


//Solution still needs Improvement, doesn't meet all edge cases

class Solution 
{
    public int myAtoi(String s) 
    {
        //instantiate final value
        int val = 0;                        int sign = 1; //assume sign of integer is positive
        
        //loop through string and get numeric val
        
        //To Do:
        
        //
        //check after the loop, if val is with -2^31 and 2^31-1 range.
        // Having problems with integer overflowing and changing into a new int
        
        //for a single non numeric string
        if(s.length() == 1 &&  s.matches("^[0-9]")) { return s.charAt(0)-'0';}
        else if(s.length() == 1 &&  !s.matches("^[0-9]")) return 0;
        else
        {
        for(int i =0; i<s.length(); i++)
        {
            //get character in string
            char c = s.charAt(i);
            
            if (c >= '0' && c <= '9')
            {
               
                if((val >= Integer.MAX_VALUE/10)  ||  (val >= Integer.MAX_VALUE/10 + 7 ) )  return Integer.MAX_VALUE;
                   
                else if((val <= Integer.MIN_VALUE/10)  ||  (val <= Integer.MIN_VALUE/10 - 8)) return Integer.MIN_VALUE;
                
                
                //add next numeric value to val; Note, multiplying by 'sign' to keep the sign of the integer  
                val = (val * 10) + sign * (c - '0');
                
            }
            
            //check on non numeric characs
            else if (!(c >= '0' && c <= '9'))
             {
                    System.out.println(c);
                //check for sign of numeric charac
                    if( c == '-' && (s.charAt(i+1) != '-' || s.charAt(i+1)!='+') ) 
                    {
                        sign = -1;  //convert sign to negative
                        continue;
                    }
                    //else if( c == '+' && (s.charAt(i+1) != '-' || s.charAt(i+1)!='+') )  continue;
                
                
                    //break loop if a non-Numeric charac is found before or inbetween numeric characters
                    else if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c != '\s') break;
                
                    
             }
            
            //breaks loop after all numeric values have been read
            else if ( (c >= '0' && c <= '9') && !(s.charAt(i+1)>='0' && s.charAt(i+1)<='9' ) )
            {
                break;
            }
        }
        
        return val;
        }
    }
}
