// Last updated: 10/2/2026, 11:15:30 AM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int counter = 0;


        HashSet<Integer> hash = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            if(!hash.contains(nums[i])){
                hash.add(nums[i]);
            } else {
                arr[counter] = nums[i];
                counter++;
            }
        }
        return arr;
    }
}