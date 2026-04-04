// Last updated: 4/3/2026, 9:39:28 PM
class Solution {
    public static boolean isPalindrome(String s) {

        if(s.trim().length() == 0){
            return true;
        }
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        s = s.replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;


        while(left < right){
            if(!s.substring(right, right + 1).equals(s.substring(left, left + 1))){
                return false;
            }

            left++;
            right--;
            
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}