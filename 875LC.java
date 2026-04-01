875. Koko Eating Bananas
Solved
Medium
Topics
premium lock icon
Companies
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.

 

Example 1:

Input: piles = [3,6,7,11], h = 8
Output: 4
Example 2:

Input: piles = [30,11,23,4,20], h = 5
Output: 30
Example 3:

Input: piles = [30,11,23,4,20], h = 6
Output: 23
 

Constraints:

1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109

-------------------------------------------------
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        
        // The maximum possible speed Koko needs is the largest pile
        for (int pile : piles) {
            end = Math.max(end, pile);
        }

        int ans = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (canEatAll(piles, mid, h)) {
                ans = mid;      // This speed works, but try to find a slower one
                end = mid - 1;
            } else {
                start = mid + 1; // Too slow, need to increase speed
            }
        }
        return ans;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
        long totalHours = 0; // Use long to avoid overflow for large h
        for (int pile : piles) {
            // Calculate ceiling division: ceil(pile / k)
            totalHours += (pile + k - 1) / k;
        }
        return totalHours <= h;
    }
}