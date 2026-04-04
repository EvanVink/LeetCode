// Last updated: 4/3/2026, 9:39:27 PM
class Solution {
    public static boolean isSubsequence(String s, String t) {
        int pointer1 = 0;
        int pointer2 = 0;
        

        while(pointer1 != s.length() && pointer2 != t.length()){
            if(s.charAt(pointer1) == t.charAt(pointer2)){
                pointer1++;
                pointer2++;
            } else {
                pointer2++;
            }
        }




        return pointer1 == s.length();
    }

}