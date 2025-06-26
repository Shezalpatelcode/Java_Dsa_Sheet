//Maximum Product Subarray
public class code20{

    public static void maxProductSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            // Swap if current number is negative
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // Calculate current max and min
            if (nums[i] > currMax * nums[i]) {
                currMax = nums[i];
                tempStart = i;
            } else {
                currMax = currMax * nums[i];
            }

            currMin = Math.min(nums[i], currMin * nums[i]);

            // Update result and subarray indices
            if (currMax > maxProduct) {
                maxProduct = currMax;
                start = tempStart;
                end = i;
            }
        }

        // Output
        System.out.println("Maximum Product: " + maxProduct);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxProductSubarray(nums);
    }
}
