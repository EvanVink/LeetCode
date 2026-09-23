// Last updated: 9/23/2026, 1:28:16 PM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        ArrayList<Integer> list = new ArrayList<>();
4
5        if(nums.length == 0){
6            return new ArrayList<>();
7        }
8
9        for(int i = 0; i < nums.length; i++){
10            list.add(nums[i]);
11        }
12
13        list.sort(Comparator.naturalOrder());
14
15        if(list.size() == list.get(nums.length - 1) - list.get(0) + 1){
16            return new ArrayList<>();
17        }
18
19        System.err.println(list.get(nums.length - 1) - list.get(0));
20
21        ArrayList<Integer> answer = new ArrayList<>();
22
23        for(int i = list.getFirst(); i <= list.getLast(); i++){
24            answer.add(i);
25        }
26        System.err.println(answer);
27        System.err.println(list);
28
29        for(int i = answer.getFirst(); i <= answer.getLast(); i++){
30            if(list.contains(i)){
31                answer.remove(answer.indexOf(i));
32            }
33        }
34
35
36        return answer;
37    }
38}