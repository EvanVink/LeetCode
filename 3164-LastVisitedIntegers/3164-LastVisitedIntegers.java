// Last updated: 4/3/2026, 9:39:21 PM
class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        
        ArrayList<Integer> seen = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        int tracker = 0;

        
        //bubble down once to get the last to first position?

        for (int i = 0; i < nums.length; i++){

            if (nums[i] > 0){
                tracker = 0;
                seen.add(nums[i]);
                
                if (seen.isEmpty()){
                    seen.add(nums[i]);
                } else {

                    for (int j = seen.size() - 1; j > 0; j--){
                        int temp = seen.get(j);
                        seen.set(j, seen.get(j - 1));
                        seen.set(j - 1, temp);
                    }
                }
                
            } else if (nums[i] < 0){
                tracker++;

                int tem = tracker;

                if ((tem - 1) < seen.size()){
                    ans.add(seen.get(tracker - 1));
                } else {
                    ans.add(nums[i]);
                }
            }


        }
        
        return ans;
    }
}