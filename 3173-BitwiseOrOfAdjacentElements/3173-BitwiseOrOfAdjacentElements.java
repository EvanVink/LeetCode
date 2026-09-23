// Last updated: 9/23/2026, 9:23:55 AM
class Solution {
    public int[] orArray(int[] nums) {
        int length = nums.length - 1;
        int[] answer = new int[length];

        for(int i = 0; i < length; i++){
            answer[i] = nums[i] | nums[i + 1];
        }


        return answer;
    }
}