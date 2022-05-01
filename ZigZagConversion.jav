/**
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R

And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

Example 3:

Input: s = "A", numRows = 1
Output: "A"

 

Constraints:

    1 <= s.length <= 1000
    s consists of English letters (lower-case and upper-case), ',' and '.'.
    1 <= numRows <= 1000



**/

class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows == 1) return s;
        
        
        //create 2d arraylist to put in letters from string
        ArrayList<ArrayList<String>> letters = new ArrayList<ArrayList<String>>();
        int currRow =0; int prevRow = currRow-1;
        
        
        //loop through string and add letters to array in zigZag pattern
        
        for(int i=0; i<s.length(); i++)
        {
            //adding letters to first column of array
            if(i>=0 && i<numRows)
            {
                ArrayList<String> letterRow = new ArrayList<String>();
                letterRow.add( "" + s.charAt(i));
                letters.add(letterRow);
                prevRow = currRow;
                currRow++; 
            }
            
            else
            {
                if(currRow == numRows)
                {
                    // at bottom of zigzag going up
                    prevRow = currRow;
                    currRow--;
                    letters.get(currRow-1).add(""+s.charAt(i));
                    
                }
                //going up in zigZag
                else if((currRow<numRows && currRow>1) && prevRow > currRow)
                {
                    prevRow = currRow;
                    currRow--;
                    letters.get(currRow-1).add(""+s.charAt(i));
                }
                //going down the zigZag
                else
                {
                    prevRow = currRow;
                    currRow++;
                    letters.get(currRow-1).add(""+s.charAt(i));
                }
            }
            
            
        }
        //convert 2D array to string and return result
        String result = "";
        for (int row = 0; row < letters.size(); row++)
        {
            String strValue = "";
            for (String value : letters.get(row)) 
            {
                strValue += value;
            }
            result += strValue;
            // 
        }
        
        return result;
    }
}

/----------------------------------------------------------------------------------------------------------------------------------------/
//Alternate solution with stringBuilder instead of 2D array
  //-------------------------
  
  class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows == 1) return s;
        
        
        //create arraylist of StringBuilder to put in letters from string
        ArrayList<StringBuilder> letters = new ArrayList<StringBuilder>();
        int currRow =0; int prevRow = currRow-1;
        
        
        //loop through string and add letters to array in zigZag pattern
        
        for(int i=0; i<s.length(); i++)
        {
            //adding letters to first set of rows
            if(i>=0 && i<numRows)
            {
                StringBuilder letterRow = new StringBuilder();
                letterRow.append(s.charAt(i));
                letters.add(letterRow);
                prevRow = currRow;
                currRow++; 
            }
            
            else
            {
                if(currRow == numRows)
                {
                    // at bottom of zigzag going up
                    prevRow = currRow;
                    currRow--;
                    letters.get(currRow-1).append(s.charAt(i));
                    
                }
                //going up in zigZag
                else if((currRow<numRows && currRow>1) && prevRow > currRow)
                {
                    prevRow = currRow;
                    currRow--;
                    letters.get(currRow-1).append(s.charAt(i));
                }
                //going down the zigZag
                else
                {
                    prevRow = currRow;
                    currRow++;
                    letters.get(currRow-1).append(s.charAt(i));
                }
            }
            
            
        }
        //convert stringBuilder array to string and return result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : letters)
        {
            result.append(row);
       
        }
        
        return result.toString();
    }
}

