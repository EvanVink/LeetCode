// Last updated: 9/23/2026, 11:58:53 AM
1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int length = nums.length;
4        ArrayList<Integer> partOne = new ArrayList<>();
5        ArrayList<Integer> partTwo = new ArrayList<>();
6        ArrayList<Integer> equal = new ArrayList<>();
7
8        for(int i = 0; i < length; i++){
9            if(nums[i] < pivot){
10                partOne.add(nums[i]);
11            } else if(nums[i] > pivot) {
12                partTwo.add(nums[i]);
13            } else {
14                equal.add(nums[i]);
15            }
16        }
17
18        partOne.addAll(equal);
19        partOne.addAll(partTwo);
20
21        int[] arr = new int[length];
22        
23        for(int i = 0; i < length; i++){
24            arr[i] = partOne.get(i);
25        }
26
27        return arr;
28    }
29}