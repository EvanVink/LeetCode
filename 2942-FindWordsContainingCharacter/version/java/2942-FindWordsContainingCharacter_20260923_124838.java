// Last updated: 9/23/2026, 12:48:38 PM
1class Solution {
2    public List<Integer> findWordsContaining(String[] words, char x) {
3        CharSequence c = x + "";
4
5        ArrayList<Integer> list = new ArrayList<>();
6
7        for(int i = 0; i < words.length; i++) if(words[i].contains(c)) list.add(i);
8
9
10        return list;
11    }
12}