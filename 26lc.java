class Solution {
    //Function to remove duplicates from the sorted array in place
    public int removeDuplicates(int[] nums) {
          //if array is empty , return 0
          if(nums.length==0) return 0;

          //2 pointer Approach 
          int i=0;// Standing at the First index;

          //Start from the second element
          for (int j=1; j<nums.length;j++){
              
              //Checking for the number 
              //comparing it with the adjacent one 
              //if the two numbers are same --> no change instead skip
              // if the numbers are different then -->move toward the new position 
              if(nums[j]!= nums[i]){
                i++;

                //The new number assigned to the pointer index
                nums[i]= nums[j];
              }
          }

          // Returning the answer 
          //the value which is returned 
          //
          return (i+1);
    }
}