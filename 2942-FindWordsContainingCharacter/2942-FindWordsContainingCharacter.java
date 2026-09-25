// Last updated: 9/25/2026, 7:41:08 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        CharSequence c = x + "";

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) if(words[i].contains(c)) list.add(i);


        return list;
    }
}