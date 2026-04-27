// 1. Two Sum
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.
----------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the number we need exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // If not found, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // Return empty array if no solution is found (though the problem says one exists)
        return new int[] {};
    }
}


// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // Map to store: Value -> Index
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
            
//             // Check if the number we need exists in the map
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }
            
//             // If not found, add the current number and its index to the map
//             map.put(nums[i], i);
//         }
        
//         // Return empty array if no solution is found (though the problem says one exists)
//         return new int[] {};
//     }
// }