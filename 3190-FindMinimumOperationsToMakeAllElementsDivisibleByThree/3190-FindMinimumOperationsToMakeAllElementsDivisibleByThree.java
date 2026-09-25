// Last updated: 9/25/2026, 7:41:03 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int length = nums.length;
        int counter = 0;

        for(int i = 0; i < length; i++){
            if(nums[i] % 3 != 0){
                counter++;
            } 
        }



        return counter;
    }
}