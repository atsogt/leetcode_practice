class Solution {
    public int removeDuplicates(int[] nums) {
        //pointer one:
        int j = 1;

        for(int i = 1; i < nums.length; i++) {
          //pointer two: nums[i]
          //temporary pointer: nums[i - 1]

          //comparing current element to previous element
            if(nums[i] != nums[i - 1]) {
              //if current element is unique, it is assigned in the array IN-PLACE
                nums[j] = nums[i];
              //pointer one get incremented
                j++;
            }
        }
        return j;
        
    }
}