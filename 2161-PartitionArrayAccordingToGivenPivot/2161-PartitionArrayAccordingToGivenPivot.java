// Last updated: 9/25/2026, 7:41:18 AM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int length = nums.length;
        ArrayList<Integer> partOne = new ArrayList<>();
        ArrayList<Integer> partTwo = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();

        for(int i = 0; i < length; i++){
            if(nums[i] < pivot){
                partOne.add(nums[i]);
            } else if(nums[i] > pivot) {
                partTwo.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }

        partOne.addAll(equal);
        partOne.addAll(partTwo);

        int[] arr = new int[length];
        
        for(int i = 0; i < length; i++){
            arr[i] = partOne.get(i);
        }

        return arr;
    }
}