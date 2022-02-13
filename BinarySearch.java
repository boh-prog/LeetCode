
//Binary Search for List of Strings
//array of Strings have been sorted by first letter of each string
//Each string is unique
public class BinarySearch
{
    //Iterative method
    public static int binarySearchIterative(String[] A, String s)
    {
        //instantiate left and right bounds
        int left = 0; int right = A.length-1;
        while(left < right)
        {
            //get median index of array
            int mid = (left + right) / 2;

            //compare with string val s
            if (s.charAt(0) < A[mid].charAt(0))
            {
                //move upperbound of slice to one less than mid
                right = mid -1;
            }
            else if (s.charAt(0) > A[mid].charAt(0))
            {
                //move lowerbound of slice to one more than mid
                left = mid +1;
            }
            else if(A[mid].charAt(0) == s.charAt(0))
            {
                return mid;
            }

        }
        //if string value doesn't exist in list.
        return -1;

    }

    public static int binarySearchIterative(int[] A, int x)
    {
        //instantiate left and right bounds
        int left = 0; int right = A.length;
//        int mid = 0;
        while(left < right)
        {
            //get median indx of array
//            int mid = (left + right) / 2;
            int mid = left + (right - left)/2;

            //compare x with val at mid index
            if(x < A[mid])
            {
                right = mid -1;
            }
            else if(x > A[mid])
            {
                left = mid +1;
            }
            else if(x == A[mid])
            {
                return mid;
            }
        }
//        System.out.println(A[mid]);
        //if value is not found in array
        return -1;
    }

    public static void main(String[] args)
    {
//        String s = "apple";
//        String[] A = {"apple","oranges","guava","juice","pineapple"};
//        System.out.println(binarySearchIterative(A, s ) );

        int x = 4;
        int[] N = {1,3,4,5,6,7,8,9};
        System.out.println(binarySearchIterative(N, x));

    }

}
