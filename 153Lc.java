// 153. Find Minimum in Rotated Sorted Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times.
// [0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: 1
// Explanation: The original array was [1,2,3,4,5] rotated 3 times.
// Example 2:

// Input: nums = [4,5,6,7,0,1,2]
// Output: 0
// Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
// Example 3:

// Input: nums = [11,13,15,17]
// Output: 11
// Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
 

// Constraints:

// n == nums.length
// 1 <= n <= 5000
// -5000 <= nums[i] <= 5000
// All the integers of nums are unique.
// nums is sorted and rotated between 1 and n times.

//----------------------------------------------------------------
class Solution {
    public int findMin(int[] nums) {
      int low=0, high = nums.length-1;

     //Start of the Binary Search
     //While loop start
      while(low < high){

        //Taking out the mid;
        int mid = (low+high)/2;
 
        //if the value of mid comes out to be high.....
        //then we shift our pointer to Right Side
        if(nums[mid] > nums[high] ){
             low =mid+1;
        }
        else{

            //If the value of mid comes out to be low then 
            //then will make the mid value as the highest one ..
            high = mid;
        }

      }
      //Here we know this is the condition that will give the 
      //real or Expected output 
      //As the lower/lowest value give the answer of Q.
      return nums[low];
    }
}