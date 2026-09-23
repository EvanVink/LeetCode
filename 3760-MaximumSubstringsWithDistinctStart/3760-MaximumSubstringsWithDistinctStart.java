// Last updated: 9/23/2026, 9:23:40 AM
class Solution {
    public int maxDistinct(String s) {
       HashSet<Character> set = new HashSet<>(); 

        int actions = 0;
        int length = s.length();


        for(int i = 0; i < length; i++){
            char c = s.charAt(i);

            if(!set.contains(c)){
                actions += 1;
                set.add(c);
            }
        }

        return actions;
    }
}