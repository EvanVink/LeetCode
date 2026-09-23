// Last updated: 9/23/2026, 1:44:37 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int counter = 0;
4        for(int i = 0; i < patterns.length; i++){
5            if(word.contains(patterns[i])){
6                counter++;
7            }
8        }
9
10        return counter;
11    }
12}