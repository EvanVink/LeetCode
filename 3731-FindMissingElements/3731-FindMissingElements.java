// Last updated: 9/25/2026, 7:40:55 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        if(nums.length == 0){
            return new ArrayList<>();
        }

        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]);
        }

        list.sort(Comparator.naturalOrder());

        if(list.size() == list.get(nums.length - 1) - list.get(0) + 1){
            return new ArrayList<>();
        }

        System.err.println(list.get(nums.length - 1) - list.get(0));

        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = list.getFirst(); i <= list.getLast(); i++){
            answer.add(i);
        }
        System.err.println(answer);
        System.err.println(list);

        for(int i = answer.getFirst(); i <= answer.getLast(); i++){
            if(list.contains(i)){
                answer.remove(answer.indexOf(i));
            }
        }


        return answer;
    }
}