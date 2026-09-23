// Last updated: 9/23/2026, 9:23:37 AM
class Solution {
    public int digitFrequencyScore(int n) {
         HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();

        String s = Integer.toString(n);

        int sum = 0;

        for (int i = 0; i < s.length(); i++){
            hash.put(Integer.parseInt(String.valueOf(s.charAt(i))), hash.getOrDefault(Integer.parseInt(String.valueOf(s.charAt(i))), 0) + 1);
        }

        for (Integer num : hash.keySet()){
            sum += num * hash.get(num);
        }

        return sum;
    }
}