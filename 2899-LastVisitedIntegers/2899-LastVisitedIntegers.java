// Last updated: 4/3/2026, 9:39:43 PM
1class Solution {
2    public List<Integer> lastVisitedIntegers(int[] nums) {
3        
4        ArrayList<Integer> seen = new ArrayList<>();
5        ArrayList<Integer> ans = new ArrayList<>();
6        
7        int tracker = 0;
8
9        
10        //bubble down once to get the last to first position?
11
12        for (int i = 0; i < nums.length; i++){
13
14            if (nums[i] > 0){
15                tracker = 0;
16                seen.add(nums[i]);
17                
18                if (seen.isEmpty()){
19                    seen.add(nums[i]);
20                } else {
21
22                    for (int j = seen.size() - 1; j > 0; j--){
23                        int temp = seen.get(j);
24                        seen.set(j, seen.get(j - 1));
25                        seen.set(j - 1, temp);
26                    }
27                }
28                
29            } else if (nums[i] < 0){
30                tracker++;
31
32                int tem = tracker;
33
34                if ((tem - 1) < seen.size()){
35                    ans.add(seen.get(tracker - 1));
36                } else {
37                    ans.add(nums[i]);
38                }
39            }
40
41
42        }
43        
44        return ans;
45    }
46}