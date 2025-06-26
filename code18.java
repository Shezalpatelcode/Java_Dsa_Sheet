//18. Trapping Rain Water
public class code18 {

    public static int Rain_water(int height[]) {
        int n = height.length;
        if (n == 0) return 0; // Edge case

        // Step 1: Create and fill leftMax array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Step 2: Create and fill rightMax array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // Step 3: Calculate trapped water at each index
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        // Make sure array has at least 3 elements to form a valley
        int height[] = {4, 2, 0, 6, 3, 2, 5};  // Length = 7
        System.out.println("Trapped Rain Water: " + Rain_water(height));
    }
}
