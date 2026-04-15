class Solution {
    public int singleNumber(int[] nums) {
        int result =0;
        for(int num: nums){
            result^=num;//XOR done to all the numbers of the array
        }
        return result;
    }
}