// Last updated: 4/3/2026, 9:39:29 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && (nums[i] + nums[j]) == target){
                    int[] finalNums = {i, j};
                    return finalNums;
                }
            }
         }

        return new int[0];
    }
}