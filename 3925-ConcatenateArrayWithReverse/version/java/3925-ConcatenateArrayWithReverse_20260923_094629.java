// Last updated: 9/23/2026, 9:46:29 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length * 2;
4        int[] arr = new int[n];
5        int counter = 0;
6
7
8        for(int i = 0; i < nums.length; i++){
9            arr[i] = nums[i];
10        }
11        for(int i = nums.length * 2 - 1; i >= nums.length; i--){
12            arr[i] = nums[counter];
13            counter++;
14        }
15
16        return arr;
17    }
18}