// Last updated: 9/25/2026, 7:41:29 AM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        int length = length1 + length2;

        StringBuffer sb = new StringBuffer(length);

        int longest = length1 >= length2 ? length1 : length2;

        for(int i = 0; i < longest; i++){

            if(i < length1){
                sb.append(word1.charAt(i));
            }

            if(i < length2){
                sb.append(word2.charAt(i));
            }

        }

        return sb.toString();
    }
}