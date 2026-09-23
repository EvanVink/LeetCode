// Last updated: 9/23/2026, 9:24:45 AM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int length = nums.length;

        for(int i = 0; i < length; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }


        for(int num : hash.keySet()){
            if(hash.get(num) == 1){
                return num;
            }
        }




        return 0;
    }
}