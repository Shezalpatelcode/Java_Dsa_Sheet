//14. Subarray with given sum (Two pointer / Sliding window)
public class code14 {
    
// public  static int minSubArrayLen(int target, int[] nums) {
//     int left = 0, sum = 0, minLen = Integer.MAX_VALUE;

//     for (int right = 0; right < nums.length; right++) {
//         sum += nums[right];
//         //Checks if the sum formed by adding each elemnt of i is>target
//         //if yes then with a normal Equality rule understanding 
//         //Sum 1 + Sum 2 =Target
//         //Sum 1> =Target so     .
//         //Sum 1- Target = Sum2 . . 
//         while (sum >= target) {
//             minLen = Math.min(minLen, right - left + 1);
//             sum -= nums[left++];
//         }
//     }
//     return minLen == Integer.MAX_VALUE ? 0 : minLen;
// }
//    public static void main(String[] args) {
//     int nums[]={2,3,1,2,4,3};
   
//     int result= minSubArrayLen(7,nums);
//     System.out.println("The subarray of the given sum: " + result);
// }
// }

    public static void findSubarrayWithSum(int target, int[] nums) {
        int left = 0, sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Shrink the window from the left if the sum is too large
            while (sum > target && left <= right) {
                sum -= nums[left++];
            }

            // If a matching subarray is found
             if (sum == target) {
            System.out.print("Subarray with the given sum found: [");
            for (int i = left; i <= right; i++) {
                System.out.print(nums[i]);
                if (i < right) System.out.print(", ");
            }
            System.out.println("]");
            System.out.println("Start index: " + left + ", End index: " + right);
            return;  // Stop after finding first subarray
        }
    }

        System.out.println("No subarray with the given sum found.");
    }

    public static void main(String[] args){
        int[] nums = {1, 4, 20, 3, 10, 5};
        int target = 33;

        findSubarrayWithSum(target, nums);
    }
}


