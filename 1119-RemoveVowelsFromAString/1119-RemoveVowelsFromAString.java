// Last updated: 9/23/2026, 9:24:29 AM
class Solution {
    public String removeVowels(String s) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("e");
        list.add("i");
        list.add("o");
        list.add("u");
        StringBuilder fin = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(!list.contains(s.charAt(i) +"")){
                fin.append(s.charAt(i));
            }
        }


        return fin.toString();
    }
}