// Last updated: 9/25/2026, 7:41:21 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for(int i = 0; i < patterns.length; i++){
            if(word.contains(patterns[i])){
                counter++;
            }
        }

        return counter;
    }
}