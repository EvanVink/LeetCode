// Last updated: 9/23/2026, 9:23:51 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        
       int sum = 0;
        int tempSum;
        int actions = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++){
            sum += nums[i];
        }

        if(sum % k == 0){
            return 0;
        }

        tempSum = sum;

        for (int i = 0; i < sum; i++){
            actions = actions + 1;
            tempSum = tempSum - 1;
            if(tempSum % k == 0){
                return actions;
            }
        }

        return sum;
        
    }


}
