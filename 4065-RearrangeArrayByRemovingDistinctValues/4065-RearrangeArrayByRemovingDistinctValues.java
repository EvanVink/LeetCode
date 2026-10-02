// Last updated: 10/2/2026, 11:15:15 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        HashSet<Integer> hash = new HashSet<Integer>();
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> fin = new ArrayList<>();

        while(counter != nums.length){
            counter = 0;
            hash = new HashSet<>();
            for(int i = 0; i < nums.length; i++){
                if(!hash.contains(nums[i]) && nums[i] != -1){
                    ans[i] = nums[i];

                    list.add(nums[i]);
                    hash.add(nums[i]);
                    nums[i] = -1;
                } else if (nums[i] == -1){
                    counter++;
                }
            }

            list.sort(Comparator.naturalOrder());
  
            for(int num : list){
                fin.add(num);
            }
            list.removeAll(list);

            

        }


        int[] arr = new int[nums.length];
        for(int i = 0; i < fin.size(); i++){
            arr[i] = fin.get(i);
        }

        return arr;
    }
}