// Last updated: 9/25/2026, 7:40:48 AM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length * 2;
        int[] arr = new int[n];
        int counter = 0;


        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[i];
        }
        for(int i = nums.length * 2 - 1; i >= nums.length; i--){
            arr[i] = nums[counter];
            counter++;
        }

        return arr;
    }
}