// Indexes of Subarray Sum
// Given an array arr[] containing only non-negative integers, your task is to
//  find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target.
//  You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.
//  You need to find the first subarray whose sum is equal to the target.

// Note: If no such array is possible then, return [-1].
// Examples:

// Input: arr[] = [1, 2, 3, 7, 5], target = 12
// Output: [2, 4]
// Explanation: The sum of elements from 2nd to 4th position is 12.
public class Arr_q11 {
public static void main(String[] args) {
    int[] arr = {1,2,3,7,5};
    int target  = 12;
    int  n = arr.length;
       int sum = 0;
       
      
    for ( int i = 0; i<n ; i++ ){
        for ( int j = 1;j<n; j++){
            sum = arr[i]+arr[j];
             if (sum == target ){ 
            System.out.println("the index:" + i + " and index:"+ j + " sum is = " + sum );
            }
        }
        
    }
  

    }

}
    
