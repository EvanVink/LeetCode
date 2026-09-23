// Last updated: 9/23/2026, 9:24:06 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
    
        int size = nums.length * 2;
        int arrSize = nums.length;
        

        int[] arr = new int[size];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < arrSize; j++){
                if(i == 1){
                    arr[j + arrSize] = nums[j];
                } else {
                    arr[j] = nums[j];
                }
            }
        }

        return arr;

    }
}