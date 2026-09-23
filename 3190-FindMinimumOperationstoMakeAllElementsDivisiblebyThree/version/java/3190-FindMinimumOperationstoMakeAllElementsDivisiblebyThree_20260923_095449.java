// Last updated: 9/23/2026, 9:54:49 AM
1class Solution {
2    public int minimumOperations(int[] nums) {
3        int length = nums.length;
4        int counter = 0;
5
6        for(int i = 0; i < length; i++){
7            if(nums[i] % 3 != 0){
8                counter++;
9            } 
10        }
11
12
13
14        return counter;
15    }
16}