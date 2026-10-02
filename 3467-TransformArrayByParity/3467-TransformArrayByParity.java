// Last updated: 10/2/2026, 11:15:27 AM
class Solution {
    public int[] transformArray(int[] nums) {
        int length = nums.length;

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            if(nums[i] % 2 == 0){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        int temp = 0;
        for(int i = 0; i < length - 1; i++){
            for(int j = i + 1; j < length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        return arr;
    }
}